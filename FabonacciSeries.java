package helloworld;

import java.util.Scanner;

public class FabonacciSeries {
    
    public static void main(String[] args){
        
        int firstnum = 0;
        int secondnum = 1;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Series : ");
        int num = input.nextInt();
        
        for(int i = 0; i<= num ; ++i){
            System.out.println(firstnum);
            int sum = firstnum + secondnum ;
            firstnum = secondnum ;
            secondnum = sum ;
        }
    }
}
