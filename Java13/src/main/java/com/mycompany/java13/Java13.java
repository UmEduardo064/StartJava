package com.mycompany.java13;
import java.util.Scanner;
public class Java13 {

    public static boolean isPrime(int pr){
        
        if (pr < 2){
            return false;
        }else {
            for (byte i = 2; i < Math.sqrt(pr); i++) {
                if (pr % i == 0){
            return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int enterPr = scanner.nextInt();
        
        boolean prFinal = isPrime(enterPr);
        
        System.out.print("The number " + enterPr +(prFinal ? " is a prime!" : " isn't a prime!"));
        
    }
}
