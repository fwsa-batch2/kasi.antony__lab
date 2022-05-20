package com.kasi;

import java.io.FileWriter;
import java.io.IOException;

public class IoWrittingfile {
    public static void main(String[] args) throws IOException {
        FileWriter fl = new FileWriter("D://IO//kasi.txt");
        fl.write("HI I am kasi antony");
        fl.close();
        System.out.println("File written");

    }
}
