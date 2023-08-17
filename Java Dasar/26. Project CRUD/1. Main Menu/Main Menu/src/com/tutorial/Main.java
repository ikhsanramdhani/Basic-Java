package com.tutorial;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        Scanner terminalInput = new Scanner(System.in);
        String inputUser; boolean isLanjutkan = true;

        while (isLanjutkan) {
            main.clearScreen();
            System.out.println("\nDatabase Perpustakaan\n--------");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\nPilihan Anda : ");
            inputUser = terminalInput.next();

            switch (inputUser) {
                case "1" :
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    main.showData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    // cari data
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    // tambah data
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    // ubah data
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    // hapus data
                    break;
                default:
                    System.err.println("\nPilihan Anda tidak tersedia!");
            }

            isLanjutkan = main.getYesOrNo("Apakah Anda ingin melanjutkan");
        }
    }

    private void showData() throws IOException {
        System.out.println("kita akan menampilkan data disini brader");
        boolean isTambah = this.getYesOrNo("Apakah Anda ingin menambah data");
    }

    private boolean getYesOrNo(String message) {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+ message +"? (y/n) ");
        String inputUser = terminalInput.next();

        while(!inputUser.equalsIgnoreCase("y") && !inputUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan Anda tidak tersedia!");
            System.out.print("\n"+ message +"? (y/n) ");
            inputUser = terminalInput.next();
        }

        return inputUser.equalsIgnoreCase("y");
    }

    private void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }
}
