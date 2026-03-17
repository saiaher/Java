package UDEMY_WORKSHOP.OOPL.WORKBOOK_7_6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Person p1 =  new Person("sai aher", "indian", "14-11-2006" , 16);

        if (p1.applyPassport()) {
            p1.setpassport();
            System.out.println("Applied for Passport");
        }

        System.out.println(Arrays.toString(p1.getpassport()));

        
        
 
        
    



    }





}
