package CollageExp.EXPRIMENT_5;

public class StringBufferDemo {
    
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");


        
        sb.append(" World");
        System.out.println("Append: " + sb);


        sb.insert(5, " Java");
        System.out.println("Insert: " + sb);

        
        sb.replace(6, 10, "C++");
        System.out.println("Replace: " + sb);

        
        sb.delete(5, 9);
        System.out.println("Delete: " + sb);

        
        sb.reverse();
        System.out.println("Reverse: " + sb);

    }
}
