package com.mycompany.java21;
public class Java21 { 

    public static void main(String[] args) {
        
        String[] names = {"Communication", "Mammal", "Mammoth"};
        
        
        System.out.println("Names: ");
        for(String name : names){
            System.out.println("- " + name);
        }
        
        int countNames = 0;
        for (String name : names) {
            if (name.startsWith("m") || name.startsWith("M")) {
                countNames++;
            }
        }
            System.out.println("" + countNames);
    }
}
