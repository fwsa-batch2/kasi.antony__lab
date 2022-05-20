package com.kasi;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IoBufferwriting {
    public static void main(String[] args) throws IOException {
        FileWriter fil = new FileWriter("D://IO//ando.txt");
        BufferedWriter bf= new BufferedWriter(fil);

        bf.write("HI my name is ando");
        bf.close();

        System.out.println("File written");


    }
}