package UDEMY_WORKSHOP.OOPL.WORKBOOK_7_5;

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
        this.seatnumber= seatnumber;
        this.passport =  new String[3];
    }


    public Person(Person p2){
        this.name = p2.name;
        this.nationality = p2.nationality;
        this.Birth = p2.Birth;
        this.seatnumber = p2.seatnumber;
        this.passport=p2.passport;

    }

    public String getname(){
        return name;
    }
    
    public void setname(String name){
        this.name= name;
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

         
    public void setPassport() {

    }


    public boolean applyPassport() {
        int number = (int) (Math.random() * 2);
        return number == 1;
    }


    public void chooseSeat() {
        seatnumber = ((int) (Math.random() * 11 + 1));
    }


}

