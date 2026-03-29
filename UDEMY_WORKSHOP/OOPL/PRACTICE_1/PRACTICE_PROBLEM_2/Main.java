package UDEMY_WORKSHOP.OOPL.PRACTICE_1.PRACTICE_PROBLEM_2;

public class Main {

    public static void main(String[] args) {

        Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01");
        Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02");
        Contact contact3 = new Contact("Charlie", "345-678-9012", "1994-03-03");
        Contact contact4 = new Contact("David", "456-789-0123", "1996-04-04");
     
        Contact c1 = new Contact(contact1);
        Contact c2 = new Contact(contact3);
        System.out.println(contact1.getBirthdate()+"Birtdate and Age is "+contact1.getAge());
        contact1.setBirthdate("1985-01-25");
        System.out.println(contact1.getBirthdate()+"Birtdate and Age is "+contact1.getAge());
            
        System.out.println(c1);
        System.out.println(contact2);

        System.out.println(c1);
       
    }

   

}



        