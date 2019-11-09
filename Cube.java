package helloworld;

import java.util.Scanner;
public class Cube {
    public static void main (String[] args){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=input.nextInt();
        System.out.println(" the cube  is:"+ cub(a));
    }
    public static int cub (int x){
        return x*x*x;
    }
}
