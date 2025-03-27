package com.mycompany.java7;
import java.util.Scanner;
public class Java7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor 1:");
        int n1 = scanner.nextInt();
        
        System.out.println("Valor 2:");
        int n2 = scanner.nextInt();
        
        System.out.println("Valor 3:");
        int n3 = scanner.nextInt();
        
        if(n1 >= n2 && n1 >= n3){
            if(n2 >= n3){
                System.out.printf("Ordem %d, %d e %d", n1, n2, n3);
            }else{
                System.out.printf("Ordem %d, %d e %d", n1, n3, n2);
            }
        }else if(n2 >= n1 && n2 >= n3){
            if(n1 >= n3){
                System.out.printf("Ordem %d, %d e %d", n2, n1, n3);
            }else{
                System.out.printf("Ordem %d, %d e %d", n2, n3, n1);
            }
        }else{
            if(n2 >= n1 ){
                System.out.printf("Ordem %d, %d e %d", n3, n2, n1);
            }else{
                System.out.printf("Ordem %d, %d e %d", n3, n1, n2);
            }
        }
            
        scanner.close();
    }
}
