package helloworld;

import java.util.Scanner;

public class ComboOfSqAndCube {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Value of a : ");
        int a = input.nextInt();
        
        System.out.println(sqr(a));
        System.out.println(cub(a));
    }
    
    public static int sqr(int x){
        
        return x*x ;
    }
    
    public static int cub(int y){
        
        return y*y*y ;
    }
    
}
