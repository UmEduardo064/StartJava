package com.mycompany.teste2;

import java.util.Scanner;
public class Teste2 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("n1");
        double n1 = scanner.nextDouble();
        
        if( n1 % 2 == 0){
        System.out.printf("O numero %.0f e par", n1);
    } else{
            System.out.printf("O numero %.0f e impar", n1);
        }
        }
}
