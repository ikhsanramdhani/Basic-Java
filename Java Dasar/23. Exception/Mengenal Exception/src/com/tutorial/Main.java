package com.tutorial;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("\nMengenal Exception\n--------\n");

        // Exception adalah error runtime / error langsung, jika code diatas
        // Error, Maka code selanjutnya tidak akan dieksekusi
        int [] array = {1,2,3,4};
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Nilai index ke : ");
        int index = inputUser.nextInt(); // Jika inputnya lebih dari index, maka akan error / exception

//  Agar code selanjutnya tidak error, maka kita gunakan exception handling

        // exception handling (try, catch, finally)
//        try {
//            System.out.printf("index ke-%d, adalah %d \n", index,array[index]);
//        } catch(Exception e) {
//            System.err.println(e);
////           catch(ArrayIndexOutOfBoundsException e) { // adalah anak dari exception, hasilnya akan sama
////                System.out.println(e);
//        }

        // runtime error jika file tidak ada
        FileInputStream fileInput = null;

//        try {
//            fileInput = new FileInputStream("input.txt");
//        } catch (IOException e) {
//            System.err.println(e);
//        }

        // mengabungkan dua exception
        try {
            System.out.printf("index ke-%d, adalah %d \n", index,array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah");
        } catch (IOException e) {
            System.err.println("File tidak ditemukan");
        }

        // Finally
        try {
            System.out.printf("index ke-%d, adalah %d \n", index,array[index]);
        } catch(Exception e) {
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah");
        } finally {
            System.out.println("Finally");
        }



        System.out.println("\nEnd Program");
    }

}
