package com.mycompany.fobonacci1;

import java.util.Scanner;
public class Fobonacci1 {

public static void main(String[] args) {
    
    Scanner sca = new Scanner(System.in);
    
        System.out.println("Type a number: ");
        int n = sca.nextInt();
        System.out.printf("Fibonacci " + fibonacci(n));
        
        
    }


    public static int fibonacci(int n) {

        if (n == 1) { 
            return 1;
        } else if (n == 0) {
            return 0;
        }
        int f0 = 0, f1 = 1, ftemporary = 0;

        for (int i = 2; i <= n; i++) {

            ftemporary = f0 + f1;
            f0 = f1;
            f1 = ftemporary;
            System.out.printf("The sequence fibonacci is until %d: %d \n", n, ftemporary);
        }
        return ftemporary;
    }

    
}
