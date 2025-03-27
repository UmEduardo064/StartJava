package com.mycompany.java18;
import java.util.Scanner;
public class Java18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type a Word our Phrase: ");
        String sentence = scanner.nextLine();
        
        sentence = sentence.toLowerCase();
        
        short countVowel = 0;
        for (short i = 0; i < sentence.length(); i++) {
                char caracter = sentence.charAt(i);
            
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                countVowel++;
            }
        }
        
        System.out.printf("tem: %d", countVowel);
    }
}
