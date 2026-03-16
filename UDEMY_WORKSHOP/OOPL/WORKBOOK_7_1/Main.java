package UDEMY_WORKSHOP.OOPL.WORKBOOK_7_1;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        //Printing the Value of Person Variables
        System.out.println(p1.name);
        System.out.println(p1.nationality);
        System.out.println(p1.dateOfBirth);
        System.out.println(p1.passport);
        System.out.println(p1.seatNumber);

        //Setting the Values of 
        p1.name = "sai aher";
        p1.nationality = "indian";
        p1.dateOfBirth = "14-11-2006";
        String passport[];
        passport = new String[]{p1.name, p1.nationality,p1.dateOfBirth};
        p1.seatNumber = 10;


        System.out.println(p1.name);
        System.out.println(p1.nationality);
        System.out.println(p1.dateOfBirth);     
        System.out.println(p1.passport);
        System.out.println(p1.seatNumber);

    }
    
}
