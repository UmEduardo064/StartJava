package com.mycompany.java6;
import java.util.Scanner;
public class Java6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite a nota 1");
        double n1 = scanner.nextInt();
        System.out.println("digite a nota 2");
        double n2 = scanner.nextInt();
        System.out.println("digite a nota 3");
        double n3 = scanner.nextInt();
        
        
        if(n1 > 10 || n1 < 0){
            System.out.println("Valor invalido: Primeira nota");
        }else if(n2 > 10 || n2 < 0){
            System.out.println("Valor invalido: Segunda nota");
        }else if(n3 > 10 || n3 < 0){
            System.out.println("Valor invalido: Terceira nota");
        }else{
            
        double re = (n1 + n2 + n3) / 3;
        
        if(re >= 6){
            System.out.printf("A Media final foi %.2f\n", re);
            System.out.println("Aluno aprovado");
        }else{
            System.out.printf("A Media final foi %.2f\n", re);
            System.out.println("Aluno em recuperacao");
        }
        
        scanner.close();
        
        }
    }
}
