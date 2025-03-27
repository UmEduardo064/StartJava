package com.mycompany.java19;
import java.util.Scanner;
public class Java19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Type a Phrase");
        String sentence = scanner.nextLine();
        
        sentence = sentence.replaceAll("[\\p{Punct}\\s+]", "");
        String sentence2 = sentence.replaceAll("[\\p{Punct}\\s+]", "");
        
        
        StringBuilder sb = new StringBuilder(sentence);
        sb.reverse();
        
        
        if (sentence2 != sentence) {
            System.out.printf("Essa frase: ' %s ' n e um palindromo", sentence);
        }else{
            System.out.printf("Essa frase: ' %s ' e um palindromo: ", sb);
        }
        
        
        
    }
}
