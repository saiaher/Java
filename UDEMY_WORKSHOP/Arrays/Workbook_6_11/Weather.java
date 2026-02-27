package UDEMY_WORKSHOP.Arrays.Workbook_6_11;



    public class Weather {
    public static void main(String[] args) {


        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = new double[celsius.length];
        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i] * 9 / 5) + 32;
        }

        System.out.println("CelsiusFahrenheit");
        for (int i = 0; i < celsius.length; i++) {
            System.out.println( celsius[i]  + fahrenheit[i]);
        }       


    
        
    }
}    
       