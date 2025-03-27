package com.mycompany.java20;
import java.util.Scanner;
public class Java20 {
    
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        double yourBalance = 1000;
        String chooseOption;
        do{
        
        
        System.out.print("""
            1. See your Balance (SB)
            2. Deposit in your Balance (DB)
            3. Withdraw a Value (WV)
            4. Log Out (Log)""");
            chooseOption = sca.nextLine();
                         
        if (chooseOption.equals("1") || chooseOption.equalsIgnoreCase("sb" )) {
            System.out.printf("Your balance is $%.2f\n ", yourBalance);
                
        }else if(chooseOption.equals("2") ||chooseOption.equalsIgnoreCase("db")){
            System.out.println("How many will deposit? ");
            double validDeposit = sca.nextDouble();
            sca.nextLine();
            yourBalance += validDeposit;
                
            System.out.printf("Deposit concluid! You have $%.2f now\n ", yourBalance);
            
        }else if(chooseOption.equals("3") ||chooseOption.equals("wv")){
            
            if (yourBalance > 0) {
                System.out.println("How many will Withdraw?\n ");
            double validWithdraw = sca.nextDouble();
            sca.nextLine();
                
            yourBalance -= validWithdraw;
                
            System.out.printf("Withdraw concluid! You have $%.2f now", yourBalance);
            }else {
                System.out.println("You don't have enough balance ");
            }
                 
        }else if(chooseOption.equals("4") ||chooseOption.equalsIgnoreCase("log")){
            System.out.println("Logging out...");
                
        }else {
            System.out.println("Error");
        }
            
        }while (!chooseOption.equals("4") && !chooseOption.equalsIgnoreCase("log") );
        System.out.println("fineshed");
        
        }
    }
