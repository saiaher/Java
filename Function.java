public  class Function {
   
    static int x=10;
    static int y=5;

    public static void main(String[] args) {
        int num = 20;
        
      

        if(num % 2==0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");


        }

        add();
        sub();
        mul();
        div();
        mod();
        
       
        
        
    }

    static void add() {
        System.out.println(x + y);


    }

    static void sub() {
        System.out.println(x - y);

    }

    static void mul() {
        System.out.println(x * y);


    }

    static void div() {
        System.out.println(x / y);
    }

    static void mod() {
        System.out.println(x % y);
    }
    
}
