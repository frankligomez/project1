package com.company;
public class Main {
    public static void main(String[] args)
    {
        int param1 = 25;
        int param2 = 45;

        var valor = suma(param1, param2);

       System.out.println(valor);
    }
   public static int suma(int a, int b) {
        return a + b;

    }
}

