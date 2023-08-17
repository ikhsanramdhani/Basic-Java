package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nArray\n--------\n");

        /*  Array ( [] ) adalah kumpulan data primitif, strukturnya begini :

                tipeData[] namaVariable = { .., .., .., .. };
                                    atau
                tipeData namaVariable[] = { .., .., .., .. }; // namun ini tidak disarankan

            didalam Array terdapat Index, yang dimulai dari 0 dan seterusnya, contoh :
        */

        System.out.println("1. Assignment Array\n--------");
        int[] angkaGanjil = {1, 3, 5, 7, 9, 11 ,13, 15, 17, 19}; // panjang array
                //           |  |  |  |  |  |   |   |   |   |
              // index ke =  0  1  2  3  4  5   6   7   8   9


        System.out.println("angkaGanjil.lenght hasilnya = " + angkaGanjil.length); // untuk mengetahui jumlah panjang array

        System.out.println("angkaGanjil[0] hasilnya = " + angkaGanjil[0]); // memanggil index 0 di angkaGanjil yaitu = 1

        angkaGanjil[0] = 21; // mengubah index array
        System.out.println( "ini adalah Mengubah angkaGanjil[0] \nhasilnya = " + angkaGanjil[0]);


        System.out.println("\n2. Deklarasi Array\n--------");

        float[] floatArray = new float[4];

        System.out.println("Sebelum di tambah");
        System.out.println(floatArray[0]);
        System.out.println(floatArray[1]);
        System.out.println(floatArray[2]);
        System.out.println(floatArray[3]);

        System.out.println("\nSesudah di tambah");

        floatArray [0] = 1.29f;
        floatArray [1] = 19.32f;
        floatArray [2] = 10;
        floatArray [3] = 199.8574f;

        System.out.println(floatArray[0]);
        System.out.println(floatArray[1]);
        System.out.println(floatArray[2]);
        System.out.println(floatArray[3]);

        // Menampilkan Array dengan library Arrays
        System.out.println("\n3. Menampilkan isi Array dengan Arrays\n--------");

        /*  kita bisa menampilkan langsung isi array tanpa dipanggil berulang2, dengan cara :

                import java.util.Arrays; // ditempatkan di class Main
                                        atau
                import java.util.*; // untuk memanggil semua yang ada didalam util

            Arrays.toString(namaArray); ini cara panggilnya

        */

        System.out.println(Arrays.toString(angkaGanjil));
        System.out.println(Arrays.toString(floatArray));

        // Looping standar pada Array
        System.out.println("\n4. Looping Standar pada Array\n--------");

        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"
                        , "Sabtu", "Minggu"
                        };

        for (int i = 0; i < hari.length; i++) {
            System.out.println("Index ke-" + i + " adalah hari = " + hari[i]);
        }

        // Looping khusus untuk array, yaitu For Each
        System.out.println("\n5. Array dengan For Each\n--------");
        System.out.println("\nNama Nama Hari :");
        for (String day : hari) {
            System.out.println("Hari " + day);
        }


        System.out.println("\n=================================\n");



        // 1. Mengcopy isi Array dengan Looping
        System.out.println("1. Mengcopy Isi Array dgn Looping\n--------\n");
        int[] loopArray1 = {1,2,3,4,5,6};
        int[] loopArray2 = new int[6];

        for (int i = 0; i < loopArray1.length; i++) {
            loopArray2[i] = loopArray1[i];
        }

        System.out.println("Alamat loopArray1 = " + loopArray1);
        printArray(loopArray1);
        System.out.println("\nAlamat loopArray2 = " + loopArray2);
        printArray(loopArray2);

        /*  Kesimpulannya, dengan copy array dengan loop hanya mencopy isinya saja,
            Namun Alamat memory nya berbeda.
        */

        int[] arrayNumber = {11,12,13,14,15}; // Array Utama
        System.out.println("\n===============\nArray Utama = [11, 12, 13, 14, 15]\n===============");


        // 2. Mengcopy isi Array dengan copyOf
        System.out.println("\n2. Mengcopy Isi Array dgn copyOf\n--------\n");
            // Use copyOf
        int[] copyOfArray = Arrays.copyOf(arrayNumber, 4);
        printArray(copyOfArray);

        int[] copyOfArray2 = Arrays.copyOf(arrayNumber, 7);
        printArray(copyOfArray2);

        /*  Kesimpulannya, menggunakan Arrays.copyOf(namaArray,lenghtArray)
            untuk mengcopy jumlah panjang isi array yang ingin diambil beberapa.

            Jika diambil lebih dari isi array nya, maka nilai yang lebih akan otomatis
            diisi menjadi 0

            dan, alamat memorynya pun berbeda.
        */

        // 3. Mengcopy isi Array dengan copyOfRange
        System.out.println("\n3. Mengcopy Isi Array dgn copyOfRange\n--------\n");
            // Use copyOfRange
        int[] copyOfRangeArray = Arrays.copyOfRange(arrayNumber,2,5);
        printArray(copyOfRangeArray);

        int[] copyOfRangeArray2 = Arrays.copyOfRange(arrayNumber,2,8);
        printArray(copyOfRangeArray2);

        /*  Kesimpulannya, copyOfRange sebenarnya sama seperti copyOf
            Namun, copyOfRange digunakan untuk mengambil isi array yang di inginkan
        */

        // 4. Fill Array dengan fill
        System.out.println("\n4. Fill Array dengan fill\n--------\n");

        int[] arrayKosong = new int[8];
        printArray(arrayKosong);
            // use fill
        Arrays.fill(arrayKosong,5);
        printArray(arrayKosong);

        /*  Kesimpulannya, Arrays.fill(namaArray, valueArray) digunakan untuk
            mengisi array kosong yang dibuat.
        */


        // 5. Membandingkan Array dengan equals
        System.out.println("\n5. Membandingkan Array dengan equals\n--------\n");

        int[] equalsArray = {1,3,5,7,9};
        int[] equalsArray2 = {1,3,5,7,9};
            // use equals
        System.out.println(Arrays.equals(equalsArray, equalsArray2));

        /*  Kesimpulannya, equals itu digunakan untuk membandingkan isi dua array
            untuk di sama / tidaknya yang menghasilkan nilai boolean (True or False)
        */


        // 6. Compare mana Array yang lebih besar dan Mismatch
        System.out.println("\n6. Compare mana Array yang lebih besar dan Mismatch\n--------\n");

        int[] compareArray = {2,4,6,8,10};
        int[] compareArray2 = {2,4,6,8,10};
            // use compare jika keduanya sama
        System.out.println(Arrays.compare(compareArray,compareArray2));

        int[] compareArray3 = {2,4,5,8,10};
        int[] compareArray4 = {2,4,6,8,10};
            // use compare jika array pertama berbeda
        System.out.println(Arrays.compare(compareArray3,compareArray4));

        int[] compareArray5 = {2,4,6,8,10};
        int[] compareArray6 = {2,4,5,8,10};
        // use compare jika array kedua berbeda
        System.out.println(Arrays.compare(compareArray5,compareArray6));

        /*  Kesimpulannya, Arrays.compare(arrayPertama,arrayKedua) itu untuk mengecek isi
            array jika berbeda/tidak.

            jika sama, maka akan menghasilkan nilai 0,
            jika berbeda, maka akan menghasilkan nilai 1 atau -1
        */

        System.out.println("\n6.1 Mismatch\n--------");
            // use mismatch jika isi kedua array sama
        System.out.println(Arrays.mismatch(compareArray,compareArray2));
            // use mismatch jika isi kedua array berbeda
        System.out.println(Arrays.mismatch(compareArray3,compareArray4));

        /*  Kesimpulannya, Arrays.mismatch(arrayPertama,arrayKedua) itu
            untuk mengecek index mana yang berbeda.

            jika sama, maka outputnya -1

            jika berbeda seperti di atas, maka akan menghasilkan index yg berbeda
            yaitu 2, karna index 2 berbeda (lihat contoh diatas)
        */











    }

   private static void printArray(int[] isiArray) {
       System.out.println("Isi Array = " + Arrays.toString(isiArray));
   }
}
