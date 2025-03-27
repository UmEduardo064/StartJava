package com.mycompany.java17;

public class Java17 {

    public static void plus(double x, double y) {
        System.out.println("--> " + (x + y));
    }
    
    public static void minus(double x, double y) {
        System.out.println("--> " + (int)(x - y));
    }
    
    public static void times(double x, double y) {
        System.out.println("--> " + (int)(x + y));
    }
    
    public static void divied(double x,double y) {
        if(y == 0){
            System.out.println("Invalid");
        }else if (x == 0){
            System.out.println("division by zero, answer will always be 0");
        }else {
            System.out.println("--> " + (x + y));
        }
    }
    

    public static void main(String[] args) {

        System.out.println("Operations: -Plus, -Minus, -Times");
        Double x = Double.parseDouble(args[1]);
        Double y = Double.parseDouble(args[2]);

        switch (args[0]) {
            case "plus" -> plus(x, y);
            case "minus" -> minus(x, y);
            case "times" -> times(x, y);
            case "divied" -> divied(x, y);
            default -> System.out.print("Error.");
        }
    }
}
