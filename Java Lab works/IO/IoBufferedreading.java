package com.kasi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IoBufferedReading {
    public static void main(String[] args) throws IOException {
        FileReader fl = new FileReader("D://IO//ando.txt");
        BufferedReader br=new BufferedReader(fl);

        Scanner scan=new Scanner(br);
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

            }
}
