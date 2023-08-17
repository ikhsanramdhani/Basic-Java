package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // Operator Unary = operator yang mengoperasi pada satu variable

            // Operator Unary + dan -
            int number = 1;
            System.out.printf("Unary '-' mengubah %d menjadi %d \n", number, -number);
            System.out.printf("Unary '+' mengubah %d menjadi %d \n", number, +number); // Jika positif, tidak ditampilkan
            System.out.println();

            // Unary Decrement dan Increment

                // Decrement adalah (++)
                int number1 = 10;
                number1++;
                System.out.println("Nilai dengan Decrement menjadi = " + number1);


                // Increment adalah (--)
                int number2 = 11;
                number2--;
                System.out.println("Nilai dengan Increment menjadi = " + number2);

            System.out.println();

            // Unary Prefix dan Postfix

                // Prefix adalah ++var
                int a = 10;
                System.out.printf("Nilai a dengan Prefix adalah = %d \n",++a);

                // Postfix adalah var++
                int b = 15;
                System.out.printf("Nilai b dengan Postfix adalah = %d \n", b++);
                System.out.println("Nilai b hasil dari Postfix menjadi = " + b);

                /* Jadi Kalo Prefix dieksekusi terlebih dulu ++ nya (ditambah dulu baru ditampilkan),
                Sedangkan Postfix di tampilkan dulu, baru dijumlahkan

                Namun dijumlahkan harus dimunculkan lagi variable nya
                */

            System.out.println();

            // Unary !(tidak/kebalikan) pada boolean

            boolean isan = true;
            System.out.println("nilai boolean tanpa ! = " + isan); // true
            System.out.println("nilai boolean dengan ! = " + !isan); // kebalikan dari true, yaitu false
    }

}
