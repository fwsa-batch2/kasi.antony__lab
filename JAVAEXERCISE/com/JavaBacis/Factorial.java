package com.JavaBacis;

public class Factorial {
        public static void main(String[] args){
            int a=6,fact=1;
            for (int i=1;i<=a;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "  +a+ " is " +fact );
        }

    }
