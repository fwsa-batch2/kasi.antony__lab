package com.JavaBacis;

public class Perfectnumber {
    public static void main(String[] args){
        int number=28;
        int sum=0;
        int i=1;
        while (i<=number/2){
            if (number % i == 0){
                sum += i;
            }
            i++;
        }
        if (sum == number){
            System.out.println(number+" is a Perfect number");
        }
        else{
            System.out.println(number+" is not a pefect number");
        }
    }
}
