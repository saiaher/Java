package UDEMY_WORKSHOP;

public class RingAnnouncer {

    public static void main(String[] args) {

        String Record[] = { "win","loss", "win", "win", "loss" };

        int wins = 0;
        for(int i = 0; i < Record.length; i++){
            if(Record[i].equals("win")){
                wins++;
            }
}
            int losses = 0;
        for(int j = 0; j < Record.length; j++){
            if(Record[j].equals("loss")){
                losses++;
            }     
        }

    System.out.println("Wins: " + wins);
    System.out.println("Losses: " + losses);
    
}
}
