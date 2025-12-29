public  class IfElse {
     int num = 20;


    public static void main(String[] args) {
        
        IfElse obj = new IfElse();
        obj.add();

        if(obj.num % 2==0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");

        }
        
    }
    void add() {
        System.out.println(num);
    }
    
}
