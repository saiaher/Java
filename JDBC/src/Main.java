package JDBC.src;

public class Main {
    public static void main(String[] args) {

        JdbcOperation dao = new JdbcOperation();

        // Insert data
        dao.addJet(7, "MR420", "Miraj");


        // Fetch data
        //dao.getStudentById(1);
        System.out.println("Hello World");
    }

    
}
