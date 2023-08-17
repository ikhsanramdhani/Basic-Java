package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("\n1. Menjumlahkan dua Array\n--------");

        int[] arraySatu = {1,2,3,0,9,5,7,4};
        int[] arrayDua = {0,2,9,5,4,1,6,7};
        int[] arrayHasil = tambahArray(arraySatu,arrayDua);

        printArray(arraySatu, "Array1");
        printArray(arrayDua, "Array2");
        printArray(arrayHasil, "hasil");


        System.out.println("\n2. Mengabungkan dua Array\n--------");
        printArray(arraySatu, "Array1");
        printArray(arrayDua, "Array2");

        int[] arrayHasil2 = new int[arraySatu.length + arrayDua.length];
        printArray(arrayHasil2, "\nhasil 2 sebelum digabungkan\n");

        for (int i = 0; i < arraySatu.length; i++) {
            arrayHasil2[i] = arraySatu[i];
        }
        printArray(arrayHasil2, "hasil 2 hampir ditambahkan\n");

        for (int i = 0; i < arrayDua.length; i++) {
            arrayHasil2[i + arraySatu.length] = arrayDua[i];
        }
        printArray(arrayHasil2, "hasil 2 sesudah ditambahkan\n");


        System.out.println("\n3. Sorting Reverse / Mengurutkan Array Kebalik\n--------");

        printArray(arraySatu, "Before Sorted");
        Arrays.sort(arraySatu);
        printArray(arraySatu,"After Sorted");
        reverse(arraySatu);
        printArray(arraySatu, "Use Reverse");

        System.out.println();

        printArray(arrayDua, "Before Sorted");
        Arrays.sort(arrayDua);
        printArray(arrayDua,"After Sorted");
        reverseDua(arrayDua);
        printArray(arrayDua, "Use Reverse 2");





    }

    static void reverseDua(int[] isiArray) {
        Arrays.sort(isiArray);
        int reverse;

        for (int i = 0; i < isiArray.length/2; i++) {
            reverse = isiArray[i];
            isiArray[i] = isiArray[(isiArray.length - 1) - i];
            isiArray[(isiArray.length - 1) - i] = reverse;
        }
    }

    static void reverse(int[] isiArray) {
        Arrays.sort(isiArray);
        int[] arrayReverse = Arrays.copyOf(isiArray, isiArray.length);

        for (int i = 0; i < isiArray.length; i++) {
            isiArray[i] = arrayReverse[(arrayReverse.length - 1) - i];
        }
    }

    static int[] tambahArray(int[] arrayInt1, int[] arrayInt2) {
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }

    static void printArray(int[] isiArray, String pesan) {
        System.out.println(pesan + " = " + Arrays.toString(isiArray));
    }


}
