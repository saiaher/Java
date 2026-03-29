package UDEMY_WORKSHOP.OOPL.PRACTICE_1.PRACTICE_PROBLEM_4;

import java.time.LocalDate;
import java.time.Period;


public class Contact {
    

    private String name;
    private String phonenumber;
    private String birthdate;
    private int age;


    public Contact(String name, String phonenumber,String birthdate){

        this.name=name;
        this.phonenumber=phonenumber;
        this.birthdate=birthdate;
        this.age=toAge(birthdate);

    }

    public Contact(Contact s1){

        
        this.name=s1.name;
        this.phonenumber=s1.phonenumber;
        this.birthdate=s1.birthdate;
        this.age=s1.age;

    }

    public int toAge(String birthdate) {
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthLocalDate = LocalDate.parse(birthdate);
        LocalDate currentDate = LocalDate.now();
        Period findAPeriod = Period.between(birthLocalDate, currentDate);
        return findAPeriod.getYears();
    }

    



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
        this.age = toAge(birthdate);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "Name: " + this.name + "\n" +
            "Phone number: " + this.phonenumber + "\n" +
            "Birth Date: " + this.birthdate + "\n" +
            "Age: " + this.age + " year old\n";
    }

    

}

