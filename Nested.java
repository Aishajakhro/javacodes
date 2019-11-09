package helloworld;

import java.util.Scanner;

public class Nested {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the First number here : ");
        float num1 = input.nextFloat();
        
        
        System.out.println("Enter the Second number here : ");
        float num2 = input.nextFloat();
        
        
        System.out.println("Enter the Third number here : ");
        float num3 = input.nextFloat();
        
        float result = (num1 + num2 + num3)/3 ;
        System.out.println("The Average of Num = " + result );
        
        if(num1>num2)
                {
                    if(num1>num3){
                        System.out.println("Number is greater.");
                    }
                    else
                    {
                        System.out.println("Number is greater.");
                    }
                    
                }
        else
        {
            if(num2>num3){
                System.out.println("Number is greater.");
            }
            else{
                System.out.println("Number is lower.");
            }
        }
    }
    
}
