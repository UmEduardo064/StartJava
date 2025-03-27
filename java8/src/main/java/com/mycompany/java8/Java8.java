package com.mycompany.java8;

import java.util.Scanner;

public class Java8 {

    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque um Valor desejado");
        int n1 = scanner.nextInt();
        
        for(byte i = 0; i <= 10; i++){
            
            int re = n1 * i;
            System.out.printf("%d X %d = %d\n", n1, i, re);
        }
    }
}
