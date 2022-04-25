package com.JavaBacis;

public class Duplicatesarray {
    public static void main(String[] args){
        int array[]={1,2,3,4,4,5,2,6,3};
        for(int i = 0; i< array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println("Duplicate value is "+array[j]);              
                }
            }
        }
    }
}
