package UDEMY_WORKSHOP;

public class Calendar {

    public static void main(String[] args) {
        String day = "Monday";

        System.out.println("are you free on " + day  );

        System.out .println("lrt me cheak my calendar");

        switch (day) {
            case "Monday":
                System.out.println("sorry, I have work");
                break;
            case "Tuesday":
                System.out.println("sorry, I have work");
                break;
            case "Wednesday":
                System.out.println("sorry, I have work");
                break;
            case "Thursday":
                System.out.println("sorry, I have work");
                break;
            case "Friday":
                System.out.println("i am free");
                break;
            case "Saturday":
                System.out.println("I am free");
                break;
            case "Sunday":
                System.out.println("I am free");
                break;
            default:
                System.out.println("invalid day");
        }


    }
    
}
