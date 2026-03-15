package UDEMY_WORKSHOP.OOPL.WORKBOOK_7_4;

public class Person {

    private String name;
    private String nationality;
    private String Birth;
    private int seatNumber;



    public Person( String name , String nationality, String Birth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.Birth = Birth;
        this.seatNumber = seatNumber;
        
    }

    public Person(Person p2){
        this.name = p2.name;
        this.nationality = p2.nationality;
        this.Birth = p2.Birth;
        this.seatNumber = p2.seatNumber;
    }


    public String getName(){
        return name;
    }

    public String getNatioality(){
        return nationality;
    }

    public String getBirth(){
        return Birth;
    }

    public int getseatNumber(){
        return seatNumber;
    }




}
