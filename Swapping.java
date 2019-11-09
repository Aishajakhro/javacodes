package helloworld;

public class Swapping {
    
    public static void main(String[] args){
    
        int a = 2 , b = 4 , temp ;
        
        System.out.println(" Before Swapping a = " + a + " and b = " + b );
        
        temp = a ;
        a = b ;
        b = temp ;
        
        System.out.println(" After Swapping a = " + a + " and b = " + b);
    }
    
}
