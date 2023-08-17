package com.tutorial;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        System.out.println("\nLatihan Array Multi Dimensi\n--------");
        System.out.println("\nOperasi Matrix\n----------------");

        int[][] matrixA = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrixB = {
                {11,12,13},
                {14,15,16},
                {17,18,19},
        };

        printArray(matrixA);
        printArray(matrixB);

        int hasil[][] = hasilMatrix(matrixA,matrixB);
        printArray(hasil);


        // Perkalian Matrix

        int[][] matrix_1 = {
                {1,2},
                {3,4}
        };

        int[][] matrix_2 = {
                {5,6},
                {7,8},
        };

        int baris_a = matrix_1.length;
        int kolom_a = matrix_1[0].length;

        int baris_b = matrix_2.length;
        int kolom_b = matrix_2[0].length;

        int buffer;
        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; j < kolom_b; j++) {
                buffer = 0;
                for (int k = 0; k < kolom_a; k++) {
                    buffer += matrix_1[i][k] * matrix_2[k][j];
                }
                System.out.println(buffer);
            }
        }





    }

    private static int[][] hasilMatrix(int[][] matrixSatu, int[][] matrixDua){
        int baris_a = matrixSatu.length;
        int kolom_a = matrixSatu[0].length;

        int[][] tambah = new int[baris_a][kolom_a];

        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; j < kolom_a; j++) {
                tambah[i][j] = matrixSatu[i][j] + matrixDua[i][j];
            }
        }
        return tambah;
    }
    private static void printArray(int[][] isiArray) {
        int baris = isiArray.length;
        int kolom = isiArray[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++ ) {
                System.out.print(isiArray[i][j]);

                if (j < (kolom - 1)) {
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.println();
    }

}
