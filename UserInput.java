package helloworld;

import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Value of A : ");
        int a = input.nextInt();
        
        System.out.println("Enter the Value of B : ");
        int b = input.nextInt();
        
        System.out.println("\n The Sum is = " + (a+b) + "\n The Sub is = " + (a-b) + "\n The Multi is = " + (a*b) + "\n The Div is = " + (a/b) + "\n The Mod is = " + (a%b) );
    }
    
}
