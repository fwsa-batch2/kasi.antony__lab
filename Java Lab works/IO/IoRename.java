package com.kasi;

import java.io.File;
import java.io.IOException;

public class IoRename {
    public static void main(String[] args) throws IOException {
        File f1=new File("D://IO//ando.txt");
        File f2=new File("D://IO//anto.txt");

        f1.renameTo(f2);
        System.out.println("Succesfully rename");
    }
}
