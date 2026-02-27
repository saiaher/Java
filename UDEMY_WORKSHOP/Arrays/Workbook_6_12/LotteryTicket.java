package UDEMY_WORKSHOP.Arrays.Workbook_6_12;

import java.util.*;

public class LotteryTicket {

    public static void main(String[] args) {
        int ticket[]={5, 12, 23, 34, 45, 56};
        
        int ticket2[] = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;

        LotteryTicket lt = new LotteryTicket();
        lt.PrintTicketNumber(ticket);       
        lt.PrintTicketNumber(ticket2);                                  
        

    }


        void PrintTicketNumber(int[] ticket) {
            System.out.println("Lottery Ticket Numbers:");
            for (int i = 0; i < ticket.length; i++) {
                System.out.print(ticket[i] + " ");
            }
            System.out.println();
        }
}
