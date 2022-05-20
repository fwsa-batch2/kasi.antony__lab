package com.kasi;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IoReading {
    public static void main(String[] args) throws IOException {
        FileReader fl = new FileReader("D://IO//kasi.txt");
        Scanner sc=new Scanner(fl);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }
}
