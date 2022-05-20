package com.kasi;

import java.io.File;
import java.io.IOException;

public class IoCreatingfile {
    public static void main(String[] args) throws IOException {
        File fl=new File("D://IO//ando.txt");

        fl.createNewFile();
        if (fl.createNewFile()){
            System.out.println("File is created");
        }
        else{
            System.out.println("not created");
        }
    }
}
