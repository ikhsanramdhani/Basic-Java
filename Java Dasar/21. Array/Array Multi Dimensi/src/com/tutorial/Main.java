package com.tutorial;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        System.out.println("\nArray Multi Dimensi\n--------");

        // cara membuat array 2 dimensi dengan assignment
        int[][] array_2D = {
                {1,3,5,7,9},
                {2,4,6,8,10}
        };

        printArray2D(array_2D);
        System.out.println();

        // cara membuat array 2D dengan deklarasi
        // strukturnya = int[baris][kolom/isi]
        int[][] newArray_2D = new int[4][3];
        printArray2D(newArray_2D);

        System.out.println();

        // looping secara manual
        for (int i = 0; i < newArray_2D.length; i++) {
            System.out.print("[");
            for (int j = 0; j < newArray_2D[i].length; j++){
                System.out.print(newArray_2D[i][j] + " , ");
            }
            System.out.print("]\n");
        }

        System.out.println();

        // looping dengan foreach
        for (int[] baris : newArray_2D) {
            System.out.print("[");
            for (int angka : baris) {
                System.out.print(angka + " , ");
            }
            System.out.print("]\n");
        }

        System.out.println();

        char[] arrayChar1 = {'a','b','c'};
        char[] arrayChar2 = {'d','e'};
        char[] arrayChar3 = {'f','g','h','i','j'};
        char[] arrayChar4 = {'k','l','m','n','o'};
        char[] arrayChar5 = {'p','q','r','s'};
        char[] arrayChar6 = {'t','u','v','w','x','y','z'};

        char[][] allChar = {
                arrayChar1,
                arrayChar2,
                arrayChar3,
                arrayChar4,
                arrayChar5,
                arrayChar6
        };

        charArray(allChar);
    }

    private static void printArray2D (int[][] dataArray) {
        for (int[] baris : dataArray) {
            System.out.print("[");
            for (int angka : baris) {
                System.out.print(angka + " , ");
            }
            System.out.print("]\n");
        }
    }

    private static void charArray (char[][] dataChar) {
        for (char[] baris : dataChar) {
            System.out.print("[");
            for (char angka : baris) {
                System.out.print(angka + " , ");
            }
            System.out.print("]\n");
        }
    }

}
