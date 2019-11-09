  package helloworld;

import java.util.Scanner;

public class SwappingWithTemporaryVariable {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Value of a : \n Enter the Value of b : ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(swap(a,b));
    }
    public static int swap(int i , int j){
        int temp;
        System.out.println("Before Swapping a = " + i + "and b = " + j);
        temp = i ;
        i = j ;
        j = temp;
        System.out.println("After Swapping a = " + i + "and b = " + j);
        return 0;
    }
    
}
