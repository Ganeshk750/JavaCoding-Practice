package com.files;

import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("filetest.txt");
            fileWriter.write("Welcome to java world!");
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            char [] charArr = new char[22];
            FileReader fileReader = new FileReader("filetest.txt");
            fileReader.read(charArr);
            System.out.println(charArr);
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
