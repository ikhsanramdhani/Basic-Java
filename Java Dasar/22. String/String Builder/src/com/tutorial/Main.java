package com.tutorial;
import javax.print.DocFlavor;
import java.lang.StringBuilder;
public class Main {

    public static void main(String[] args) {

        /*  Perbedaan String biasa dan StringBuilder yaitu jika
            String biasa hanya mempunyai lenght nya saja,
            sedangkan, StringBuilder mempunyai beragam class

            Yang Spesial dari StringBuilder yaitu Addressnya tetap sama,
            ini membuat lebih efisien memory nya
        */

        StringBuilder sbuild = new StringBuilder("Hallo");
        printStrBuilder(sbuild);

        // Kapasitas default nya adalah 16, jadi 16 + lenght = kapasitas

        System.out.println("\n1. Append");
        // 1. Append
        sbuild.append(" Peserta"); // Menambah Kata
        printStrBuilder(sbuild); // Menjadi Hallo Peserta

        System.out.println("\n2. Insert");
        // 2. Insert
        sbuild.insert(13, " Pelatihan"); // Memasukan kata lewat index
        printStrBuilder(sbuild); // Menjadi Hallo Peserta Pelatihan

        System.out.println("\n3. Delete");
        // 3. Delete
        sbuild.delete(0,6); // Menghapus Kata dari Index awal ke Index Akhir
        printStrBuilder(sbuild); // Menjadi Peserta Pelatihan

        System.out.println("\n4. setCharAt");
        // 4. setCharAt
        sbuild.setCharAt(2, 'z'); // Mengubah Character di suatu index
        printStrBuilder(sbuild); // Menjadi Pezerta Pelatihan

        System.out.println("\n5. Replace");
        // 5. Replace
        sbuild.replace(0,7,"Peserta"); // Mengganti beberapa kata diantara index awal dan index akhir
        printStrBuilder(sbuild); // Menjadi Peserta Pelatihan

        System.out.println("\n6. Casting menjadi String");
        // 6. Casting menjadi String
        String cast = sbuild.toString();
        System.out.println(cast);
        int address = System.identityHashCode(cast);
        System.out.println("Address = " + Integer.toHexString(address));
        
    }

    static void printStrBuilder(StringBuilder data) {
        System.out.println("Isi String Builder = " + data);
        System.out.println("Panjangnya = " + data.length());
        System.out.println("Kapasitas String Builder = " + data.capacity());

        int addresStrBuilder = System.identityHashCode(data);
        System.out.println("Address = " + Integer.toHexString(addresStrBuilder));
    }

}
