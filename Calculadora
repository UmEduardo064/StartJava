package com.mycompany.java12;
import java.util.Scanner;
public class Java12 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o PRIMEIRO valor: ");
        double n1 = scanner.nextDouble();     
        System.out.println("Digite o SEGUNDO valor: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a operacao (+ , - , * , /) valor");
        char op = scanner.next().charAt(0);
        
        
        double re = 0; 
        switch(op){
            case '+':
                re = n1 + n2;
                break;
            case '-':
                re = n1 - n2;
                break;
             case '*':
                re = n1 * n2;
                break;
             case '/':
                 if(n2 != 0){
                re = n1 / n2;
                }else{
                    System.out.println("Erro: divisao por 0");
                    return;
                }
                break;
               
             default:   
                 System.out.println("Operacao Invalida");
                 return;
            
        }
        System.out.println("O resultado e: " + re);
        scanner.close();
        }
    }
