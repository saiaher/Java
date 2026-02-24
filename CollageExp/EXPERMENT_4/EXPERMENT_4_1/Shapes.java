package CollageExp.EXPERMENT_4.EXPERMENT_4_1;

public class Shapes {

    

    // --------- AREA (2D) ---------

    // Circle
    double area(double r) {
        return 3.14 * r * r;
    }

    // Rectangle
    double area(double l, double b) {
        return l * b;
    }

    // Square
    int area(int side) {
        return side * side;
    }

    // Triangle
    double area(double b, double h, int triangle) {
        return 0.5 * b * h;
    }

    // --------- VOLUME (3D) ---------

    // Sphere
    double volume(double r, int sphere) {
        return (4.0/3) * 3.14 * r * r * r;
    }

    // Cylinder
    double volume(double r, double h) {
        return 3.14 * r * r * h;
    }

    // Cuboid
    double volume(double l, double b, double h) {
        return l * b * h;
    }

    // Cube
    int volume(int side) {
        return side * side * side;
    }

    public static void main(String[] args) {

        Shapes s = new Shapes();

        System.out.println("Circle Area: " + s.area(5));
        System.out.println("Rectangle Area: " + s.area(4, 6));
        System.out.println("Square Area: " + s.area(4));
        System.out.println("Triangle Area: " + s.area(5, 3, 1));

        System.out.println("Sphere Volume: " + s.volume(3, 1));
        System.out.println("Cylinder Volume: " + s.volume(3, 5));
        System.out.println("Cuboid Volume: " + s.volume(4, 5, 6));
        System.out.println("Cube Volume: " + s.volume(3));
    }
}
    

