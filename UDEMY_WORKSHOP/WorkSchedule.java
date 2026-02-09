package UDEMY_WORKSHOP;

public class WorkSchedule {
    public static void main(String[] args) {
        int day = 3;
        boolean Holiday = false;
        if (Holiday) {
            System.out.println("woohoo, no work");

       }
       else if (day==6||day==7) {
        System.out.println("its wewkend , no work");
       }
       else {
        System.out.println("wake up at 7 am");
       }
    
    }
}
