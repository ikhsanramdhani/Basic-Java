package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInput = new FileInputStream("tes.txt");

        try {
            System.out.print((char)fileInput.read() + " ");
            System.out.print((char)fileInput.read() + " ");
            System.out.print((char)fileInput.read() + " ");
            System.out.print((char)fileInput.read() + " ");
        } catch (Exception e) {
            System.err.println(e);
        }

//        Run file Jar di cmd adalah =  java -jar namafile.jar
    }

}
