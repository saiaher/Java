package UDEMY_WORKSHOP.OOPL.WORKBOOK_7_4;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("sai aher", "india", "14-11-2006", 16); 

        System.out.println(p1.getName());
        System.out.println(p1.getNatioality());
        System.out.println(p1.getBirth());
        System.out.println(p1.getseatNumber());



        Person p2 = new Person(p1);

        System.out.println(p2.getName());
          System.out.println(p2.getNatioality());
        System.out.println(p2.getBirth());
        System.out.println(p2.getseatNumber());


       



       
        
    }

    


    
}
