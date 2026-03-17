package UDEMY_WORKSHOP.OOPL.WORKBOOK_7_8;


import java .util.*;

public class Person {
    private String name;
    private String nationality;
    private String Birth;
    private int seatnumber;
    private String passport[];
    
    public Person(String name , String nationality , String Birth , int seatNumber ){
        this.name = name;
        this.nationality=nationality;
        this.Birth=Birth;
        // this.seatnumber= seatnumber;
        this.passport =  new String[3];
    }


    public Person(Person p2){
        this.name = p2.name;
        this.nationality = p2.nationality;
        this.Birth = p2.Birth;
        this.seatnumber = p2.seatnumber;
        


    }

    public String getname(){
        return name;
    }
    
    public void setname(String name){
        this.name = name;
    }

    public String getnationality(){
        return nationality;

    }

    public void setnationality(String nationality){
        this.nationality=nationality;
    }

    public String getBirth(){
        return Birth;

    }
    public void setbirth(String Birth){
        this.Birth = Birth;
    }

    public int getseatnumber(){
        return seatnumber;
    }

    public void setseatnumber(int seatnumber){
        this.seatnumber = seatnumber;

    }

    public String getpassport(){
        return Arrays.toString(passport);
    
    }

    public void setpassport(){
        this.passport = new String[] {this.name, this.nationality, this.Birth};

    }

   

    public boolean applyPassport() {
        int number = (int) (Math.random() * 2);
        return number == 1;
    }

    


    public void chooseSeat() {
        seatnumber = ((int) (Math.random() * 11 + 1));
    }

    public String toString(){
    return "Name: " + name + "\n" +
           "Nationality: " + nationality + "\n" +
           "Date of Birth: " + Birth + "\n" +
           "Seat Number: " + seatnumber + "\n" +
           "Passport: " + Arrays.toString(passport) + "\n";
}

}    

