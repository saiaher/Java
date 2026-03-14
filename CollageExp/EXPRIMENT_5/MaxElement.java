package CollageExp.EXPRIMENT_5;

public class MaxElement {

    
    public static void main(String[] args) {
        
        int[] arr = {10, 25, 14, 99, 2, 50};

       
        int max = arr[0];

    
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  
            }
        }

       
        System.out.println("Maximum element: " + max);
    }
}
    

