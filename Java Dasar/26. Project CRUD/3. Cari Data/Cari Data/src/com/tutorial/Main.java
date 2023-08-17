package com.tutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

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
                    main.cariData();
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
        FileReader fileInput;
        BufferedReader bufferedInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferedInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan!");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }

        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        String data = bufferedInput.readLine();
        int noData = 0;

        while (data != null) {
            noData++;
            StringTokenizer stringTokenizer = new StringTokenizer(data,",");

            stringTokenizer.nextToken();
            System.out.printf("| %2d ", noData);
            System.out.printf("|\t%4s  ", stringTokenizer.nextToken());
            System.out.printf("|\t%-20s   ", stringTokenizer.nextToken());
            System.out.printf("|\t%-20s   ", stringTokenizer.nextToken());
            System.out.printf("|\t%s   ", stringTokenizer.nextToken());
            System.out.print("\n");

            data = bufferedInput.readLine();
        }

        System.out.println("----------------------------------------------------------------------------------------------------------");

    }

    private void cariData() throws IOException {
        // membaca database ada/tidak
        try {
            File file = new File("database.txt");
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan!");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }

        // mengambil keyword dari users
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari buku : ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        // cek keyword di database
        this.cariBukuDiDatabase(keywords);
    }

    private void cariBukuDiDatabase(String[] keywords) throws IOException {
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        String data = bufferedInput.readLine();
        int noData = 0;
        boolean isExist;

        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("----------------------------------------------------------------------------------------------------------");


        while (data != null) {

            // cek keywords didalam baris
            isExist = true;
            for(String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }

            // jika keyword nya cocok, maka tampilkan
            if (isExist) {
                noData++;
                StringTokenizer stringTokenizer = new StringTokenizer(data,",");

                stringTokenizer.nextToken();
                System.out.printf("| %2d ", noData);
                System.out.printf("|\t%4s  ", stringTokenizer.nextToken());
                System.out.printf("|\t%-20s   ", stringTokenizer.nextToken());
                System.out.printf("|\t%-20s   ", stringTokenizer.nextToken());
                System.out.printf("|\t%s   ", stringTokenizer.nextToken());
                System.out.print("\n");
            }

            data = bufferedInput.readLine();
        }

        System.out.println("----------------------------------------------------------------------------------------------------------");

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