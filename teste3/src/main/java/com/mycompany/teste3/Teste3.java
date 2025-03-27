package com.mycompany.teste3;

import java.util.Scanner;
public class Teste3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    double n1, n2, n3, x, r1, r2;
    
        System.out.println("n1A");
        n1 = scanner.nextDouble();
        System.out.println("n2B");
        n2 = scanner.nextDouble();
        System.out.println("n3C");
        n3 = scanner.nextDouble();
        
        x = (n2 * n2) - 4 * n1 * n3 / (2 * n1);
        System.out.println("delta" + x);
         
         
        if(x>0){
        
          r1 = (-n2 + Math.pow(x, 0.5)) / (2 * n1);
          r2 = (-n2 - Math.pow(x, 0.5)) / (2 * n1);
        
            System.out.printf("O resultado positivo = %f e o negativo = %f", r1, r2);
        } else if(x==0) {
            
            r1 = (-n2 + Math.pow(x, 0.5)) / (2 * n1);
            System.out.printf("O resultado delta e igual a 0, o resultado e %f", r1);
            
        } else {
            System.out.println("Delta é negativo");
        }
        
        
         scanner.close();
    }
}
