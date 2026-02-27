package CollageExp;
import java.util.Scanner;

public class StdMark {

  


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        int total = 0;

       
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                return; 
            }

            total += marks;
        }

      
        double average = total / 5.0;
        double percentage = average;

   
        String grade, remark;

        if (average >= 90) {
            grade = "A";
            remark = "Excellent";
        } else if (average >= 75) {
            grade = "B";
            remark = "Very Good";
        } else if (average >= 60) {
            grade = "C";
            remark = "Good";
        } else if (average >= 40) {
            grade = "D";
            remark = "Pass";
        } else {
            grade = "F";
            remark = "Fail";
        }

        
        System.out.println("\n----- Student Result -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Average    : " + average);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
        System.out.println("Remark     : " + remark);

        sc.close();
    }
}

    

