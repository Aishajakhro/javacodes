package helloworld;

import java.util.Scanner;

public class MarkSheet {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Your Marks in OOP : ");
        int oop = input.nextInt();
        
        System.out.println("Enter Your Marks in DLD : ");
        int dld = input.nextInt();
        
        System.out.println("Enter your Marks in Discrete Mathematics : ");
        int discrete = input.nextInt();
        
        System.out.println("Enter Your Marks in linear Algebra : ");
        int algebra = input.nextInt();
        
        System.out.println("Enter your Marks in English : ");
        int eng = input.nextInt();
        
        System.out.println("Enter Your Marks in P.ST : ");
        int pst = input.nextInt();
        
        int obtain = oop + dld +discrete + algebra + eng + pst ;
        System.out.println("Your Obtain Marks are : " + obtain );
        
        int total = 600;
        
        int percentage = (obtain*100)/total;
        System.out.println("Your Percentage is : " + percentage );
        
        if(percentage >= 80)
        {
            System.out.println("Your Grade is A+.");
        }
        
        else if(percentage >= 70)
        {
            System.out.println("Your Grade is A.");
        }
        
        else if(percentage >= 60)
        {
            System.out.println("Your Grade is B .");
        }
        
        else if(percentage >= 50)
        {
            System.out.println("Your Grade is C .");
        }
        
        else if(percentage >= 40)
        {
            System.out.println("Your Grade is D .");
        }
        
        else
        {
            System.out.println("You Are Fail .");
        }
    }
    
}
