package com.mycompany.teste4;

import java.util.Scanner;
public class Teste4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int id;
        System.out.println("De a sua idade");
        id = scanner.nextInt();
        
        if(id <= 0){
            System.out.println("Muito novo");
        } else if(id <= 12){
            System.out.println("Voce e crianca");
        } else if( id <= 18 ) {
            System.out.println("Voce e adolecente");
        } else if(id <= 59 ){
            System.out.println("Voce e adulto");
        }else {
            System.out.println("Voce e idoso");
        }
    }
}
