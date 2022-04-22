package com.JavaBacis;

public class Strongnumber {
    public static void main(String[] args){
        int num=2,i,sum=0,fact,rem,temp=num;
        while (num != 0){
            i=1;
            fact=1;
            rem=num%10;
            while (i<=rem){
                fact=fact*i;
                i++;
            }
            sum+=fact;
            num/=10;
        }
        if (sum == temp){
            System.out.println(temp+" is the strong number");
        }
        else{
            System.out.println(temp+" is the not strong number");
        }
    }
}
