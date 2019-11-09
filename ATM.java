package ATM;

import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args){
        int balance = 10000;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome To The Automated Teller Machine");
        
        System.out.println("Enter YOur Password To Proceed : ");
        int password =input.nextInt();
        
        if(password == 7890){
            System.out.println("1 : Balance Check \t2 : Withdraw \t3 : Mini Statement \t4 : Exit");
            System.out.println("Choose Any Option to perform");
            int opt = input.nextInt();
            
            switch(opt){
                case 1:
                    System.out.println("Your Current Balance is " + balance);
                    break;
                case 2:
                    System.out.println("Enter An Amount to Withdraw : ");
                    int withdraw = input.nextInt();
                    
                    if(balance >= withdraw){
                        balance -= withdraw ;
                        System.out.println("AMOUNT SUCCESSFULLY WITHDRAW");
                        System.out.println("Your remaining Amount is " + balance);
                    }
                    else{
                        System.out.println("Amount Overflow.");
                    }
                    break;
                case 3: 
                    System.out.println("Your Mini Statement is Send To Your Offical Account.");
                    System.out.println("Thank For Choosing Us.");
                    break;
                case 4:
                    System.out.println("Thank For Visit.");
                    break;
                default:
                    System.out.println("Invalid Option.");
                
            }
        }
        else{
            System.out.println("Your Password is incorrect.");
        }
    }
}
