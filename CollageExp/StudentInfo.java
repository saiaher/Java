package CollageExp;
import java.util.*;

public class StudentInfo {
    
     
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter Student CGPA ");
        double CGPA= sc.nextDouble();

        System.out.println("INPERMATION OF STUDENT");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);    
        System.out.println("CGPA: " + CGPA);

    }
}