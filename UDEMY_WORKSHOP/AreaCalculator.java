package UDEMY_WORKSHOP;

public class AreaCalculator {

    public static void main(String[] args){

        System.out.println(areaOfCircle(5));
        System.out.println(areaOfRectangle(4, 6));
        System.out.println(areaOfTriangle(4, 6));       
        System.out.println(areaOfSquare(5));

    }


    static double areaOfCircle(double radius){
        return Math.PI * radius * radius;


    }

    static double areaOfRectangle(double length, double breadth){
        return length * breadth;
    }

    static double areaOfTriangle(double base, double height){
        return 0.5 * base * height;
    }

    static double areaOfSquare(double side){
        return side * side;
    }

    
}
