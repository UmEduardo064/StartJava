package com.mycompany.java17t;

public class Java17t {
    
    public static void mai( double x, double y) {
        System.out.println("-->" + (int)(x + y));
    }
    public static void men( double x, double y) {
        System.out.println("-->" + (int)(x - y));
    }
    public static void ves( double x, double y) {
        System.out.println("-->" + (int)(x * y));
    }
    public static void div( double x, double y) {
        
        if(y == 0){
            System.out.println("essa operacao e invalida");
        }else if(x == 0){
            System.out.println("A resposta sempre sera 0");
        }else {
        System.out.println("-->" + (x + y));    
        }
        
    }
    
    public static void main(String[] args) {
        
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);

        
        switch(args[0]) {
            case "mai" -> mai(a, b);
            case "men" -> men(a, b);
            case "ves" -> ves(a, b);
            case "div" -> div(a, b);
            default -> System.out.print("Erro");
        }
    }
}

