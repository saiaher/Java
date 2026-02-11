package UDEMY_WORKSHOP;

public class Weather {
    public static void main(String[] args) {
        
        double noon = 77;
        double evening = 61;
        double midnight = 55;


        printfarenite(midnight);
        printfarenite(evening);
        printfarenite(noon);
    }

    static void printfarenite(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);


     
    }
    
}
