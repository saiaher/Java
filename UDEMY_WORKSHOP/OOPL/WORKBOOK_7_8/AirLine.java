package UDEMY_WORKSHOP.OOPL.WORKBOOK_7_8;

public class AirLine {

    Person people[];

    public AirLine(){

        this.people = new Person[11];

    }

    public Person getPerson(int index){
        Person p1 = this.people[index];
        return new Person(p1);

    }

    public void setPerson(Person person) {
        int index = person.getseatnumber() -1;
        this.people[index] = new Person(person);
    }

}

   



    


    

