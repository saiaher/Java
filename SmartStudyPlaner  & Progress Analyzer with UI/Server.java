import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.HashMap;

public class Server {

    static HashMap<String, String> users = new HashMap<>();
    static StudyManager manager = new StudyManager();
    static ProgressAnalyzer analyzer = new ProgressAnalyzer(manager);

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Signup
        server.createContext("/signup", exchange -> {
            String query = exchange.getRequestURI().getQuery();
            String[] data = query.split("&");

            String user = data[0].split("=")[1];
            String pass = data[1].split("=")[1];

            users.put(user, pass);

            try {
                respond(exchange, "Signup Successful! <a href='/login.html'>Login</a>");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        // Login
        server.createContext("/login", exchange -> {
            String query = exchange.getRequestURI().getQuery();
            String[] data = query.split("&");

            String user = data[0].split("=")[1];
            String pass = data[1].split("=")[1];

            if (users.containsKey(user) && users.get(user).equals(pass)) {
                try {
                    respond(exchange, "<a href='/dashboard.html'>Go to Dashboard</a>");
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else {
                try {
                    respond(exchange, "Invalid Login");
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        // Add Study
        server.createContext("/addStudy", exchange -> {
            String q = exchange.getRequestURI().getQuery();
            String[] d = q.split("&");

            manager.addStudy(
                    d[0].split("=")[1],
                    Integer.parseInt(d[1].split("=")[1]),
                    Integer.parseInt(d[2].split("=")[1])
            );

            try {
                respond(exchange, "Study Added Successfully <br><a href='/dashboard.html'>Back</a>");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        // Progress
        server.createContext("/progress", exchange -> {
            String html = analyzer.generateReportHTML();
            try {
                respond(exchange, html);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        server.start();
        System.out.println("Server running at http://localhost:8080");
    }

    static void respond(com.sun.net.httpserver.HttpExchange ex, String response) throws Exception {
        ex.sendResponseHeaders(200, response.length());
        OutputStream os = ex.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
