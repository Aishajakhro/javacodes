package helloworld;

import java.util.Scanner;

public class SwappingWithoutTemporaryVariable {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter The Value Of A : \n And the Value of B : ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.println(swap(a,b));
    }
    
    public static int swap(int a , int b){
        
        System.out.println("Before Swapping a = " + a + "and b = " + b);
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.println("After Swapping a = " + a + "and b = " + b);
        return 0;
    }
}
