package com.JavaBacis;

public class Reverse {
        public static void main(String[] args){
            int num = 256;
            int orignal=num;
            int rev= 0;
            int b= 0;

            while (num != 0) {
                b = num % 10;
                rev = (rev * 10) + b;
                num = num / 10;
            }

            System.out.println("The reverse number of " + orignal + " is " + rev);

        }

}
