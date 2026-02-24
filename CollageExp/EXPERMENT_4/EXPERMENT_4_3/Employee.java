package CollageExp.EXPERMENT_4.EXPERMENT_4_3;
public class Employee {

    int id;
    String name;
    static String company = "TCS";
    static int count = 0;

    Employee(int i, String n) {
        id = i;
        name = n;
        count++;
    }

    static void showCount() {
        System.out.println("Total Employees: " + count);
    }

    void display() {
        System.out.println(id + " " + name + " " + company);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Rahul");
        Employee e2 = new Employee(2, "Anita");
        Employee e3 = new Employee(3, "Kiran");

        e1.display();
        e2.display();
        e3.display();

        Employee.showCount();
    }
}