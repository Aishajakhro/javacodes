package helloworld;

import java.util.Scanner;

public class Square {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of a : ");
        int a = input.nextInt();
        
        System.out.println(sqr(a));
    }
    
    public static int sqr(int x){
        
        return x*x ;
    }
}
