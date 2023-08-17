package com.tutorial;

public class Main {

    // main(String[] args) { }



    /* String[] adalah index array, misalnya printOut "Hello Guys"
    Nah index [0] nya adalah "Hello", sedangkan index [1] nya adalah kalimat selanjutnya


    Sedangkan args adalah inputan untuk memasukan nilai array didalamnya, dan args bisa diganti sebagai awalan array
    contohnya dibawah ini :
    */

    public static void main(String[] nama){
        // java com.tutorial.Main Ikhsan = Hai Ikhsan Ganteng, jadi si nama nya itu diisi bebas

        // java com.tutorial.Main Ikhsan Fanny
        // Nah Ikhsan adalah index [0] dan Fanny adalah index [1]
        System.out.println("Hai" + nama[0] + "Ganteng"); // Harus Run di console
        System.out.println("Hai" + nama[1] + "Cantik");
    }
}
