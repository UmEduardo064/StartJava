package com.mycompany.teste;

import java.util.Scanner; //Pode colocar valores em variaveis e +
import java.util.InputMismatchException; // apontar um erro MUITO especifo
public class Teste {
    
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double n1=0; 
        double n2=0;
        
        try{
            System.out.println("n1: ");
            n1 = scanner.nextDouble();
            System.out.println("n2:");
            n2 = scanner.nextDouble();
        
            double re = n1 + n2;
            double re2 = n1 - n2;
            double re3 = n1 / n2; // (double) declara um Num. int para real ex 10 = 10.0
            double re31 = n1 / n2;
            double re4 = n1 % n2;
        
            System.out.println("resu e + " + re);
            System.out.println("resu e - " + re2);
            System.out.println("resu inteiro para e / " + re3);
            System.out.println("resu real para e /  " + re31);
            System.out.println("resu e % " + re4);
        
        } catch (InputMismatchException e) {
            System.out.println("Erro, enrada invalida");
        } finally {
            scanner.close();
        }
    }
}
