package ATM;
import java.util.Scanner;
public class Switch {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int balance = 10000 ;
        System.out.println("Welcome to the Atm");
        
            System.out.println("choose 1 for Balance Check.");
            System.out.println("Choose 2 for Withdraw. ");
            System.out.println("Choose 3 for Mini Statement.");
            System.out.println("Choose 4 for Exit.");
            
            System.out.println("Choose any option to perform : ");
            int opt = input.nextInt();
            
            switch(opt){
                case 1:
                    System.out.println("Your Current Balance  = " + balance );
                    break;
                case 2:
                    System.out.println("Enter an Amount to Withdraw.");
                    int withdraw = input.nextInt();
                    
                    if(balance>=withdraw){
                        balance = balance - withdraw;
                        System.out.println("Successfully Withdraw.");
                        System.out.println("Your Remaining amount = " + balance);
                    }
                    else{
                        System.out.println("Amount overflow");
                    }
                    break;
                case 3:
                    System.out.println("Your Account is in MA Jinnah Road Branch");
                    System.out.println("Your Account number is 123456789000");
                    System.out.println("Thanks For Using our Bank");
                    break;
                default:
                    System.out.println("Invalid Options");
                    break;
            }
        } 
    }
    

