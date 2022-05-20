package com.kasi;

import java.io.File;

public class IoExamplemethod {
    public static void main(String[] args) {
        File fl1=new File("kasi.txt");
        //path
        System.out.println(fl1.getPath());
        System.out.println(fl1.getAbsolutePath());

        File fl2=new File("D://KASI");
        //mkdir
        System.out.println(fl2.mkdir());
        System.out.println("Created");

        File fl3=new File("D://IO");
        //list
        fl3.list();
        for (String lists:fl3.list()){
            System.out.println(lists);
        }

    }
}