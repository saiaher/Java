package UDEMY_WORKSHOP.OOPL.WORKBOOK_7_5;

public class Main {

    public static void main(String[] args) {
        
        Person p1 = new Person("sai aher", "india" , "14-11-2006",100);

        p1.chooseSeat();

        System.out.println(p1.getname());
        System.out.println(p1.getnationality());
        System.out.println(p1.getBirth());
        System.out.println(p1.getseatnumber());




        if(p1.applyPassport()){
            System.out.println("you allpy for passport");
        }else{
            System.out.println("you don't apply for passport");
        }

    }
    
}
