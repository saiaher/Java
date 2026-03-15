package UDEMY_WORKSHOP.OOPL.WORKBOOK_7_3;

public class Main {
    public static void main(String[] args){

        Person p1 = new Person("sai aher", "indian", "14-11-2006", 10);

        System.out.println(p1.getName());
        System.out.println(p1.getNationality());
        System.out.println(p1.getDateOfBirth());
        System.out.println(p1.getSeatNumber());

        p1.setName("om aher");
        p1.setNationality("dubai");
        p1.setDateOfBirth("14-11-2005");
        p1.setSeatNumber(20);

        System.out.println(p1.getName());
        System.out.println(p1.getNationality());
        System.out.println(p1.getDateOfBirth()); 
        System.out.println(p1.getSeatNumber());


        

    }
     
    
}
