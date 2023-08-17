package com.tutorial;

import java.io.IOException;
import java.util.Scanner;

import CRUD.CrudMethod;

public class Main {
    public static void main(String[] args) throws IOException {
        CrudMethod crud = new CrudMethod();
        Scanner terminalInput = new Scanner(System.in);
        String inputUser; boolean isLanjutkan = true;

        while (isLanjutkan) {
            crud.clearScreen();
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
                    crud.showData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    crud.cariData();
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    crud.tambahData();
                    crud.showData();
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    crud.updateData();
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    crud.deleteData();
                    break;
                default:
                    System.err.println("\nPilihan Anda tidak tersedia!");
            }

            isLanjutkan = crud.getYesOrNo("Apakah Anda ingin melanjutkan");
        }
    }


}