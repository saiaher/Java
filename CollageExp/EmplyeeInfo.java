package CollageExp;

import java.util.Scanner;

public class EmplyeeInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Monthly Basic Salary: ");
        double basic = sc.nextDouble();

        double annualBasic = basic * 12;

        double hra = basic * 0.20;
        double da  = basic * 0.10;
        double pf  = basic * 0.12;

        double grossMonthly = basic + hra + da;
        double netMonthly   = grossMonthly - pf;
        double annualNet    = netMonthly * 12;

        System.out.println("\nSalary Details");
        System.out.println("Employee ID    : " + empId);
        System.out.println("Employee Name  : " + name);
        System.out.println("Annual Basic   : " + annualBasic);
        System.out.println("HRA            : " + hra);
        System.out.println("DA             : " + da);
        System.out.println("PF             : " + pf);
        System.out.println("Gross Monthly  : " + grossMonthly);
        System.out.println("Net Monthly    : " + netMonthly);
        System.out.println("Annual Net     : " + annualNet);

        sc.close();
    }
}