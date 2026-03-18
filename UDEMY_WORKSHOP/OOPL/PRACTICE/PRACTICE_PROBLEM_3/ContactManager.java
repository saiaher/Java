package UDEMY_WORKSHOP.OOPL.PRACTICE.PRACTICE_PROBLEM_3;

public class ContactManager {

    private Contact[] contacts;



    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact [contacts.length];
        for (int i = 0; i < contacts.length; i++) {
        this.contacts[i] = new Contact (contacts[i]);
        }
    }

   
    
    
}
