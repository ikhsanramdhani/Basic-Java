package com.tutorial;

public class Main {

    public static void main(String[] args){

        // Operator Assignment

        /* ada 5 bentuk yaitu,
            1. += (tambah sama dengan)
            2. -= (kurang sama dengan)
            3. *= (kali sama dengan)
            4. /= (bagi sama dengan)
            5. %= (modulus dari sama dengan)
        */

        int a = 1;
        a += 2; // a = a + 2
        System.out.println("Nilai bentuk += a menjadi = " + a);

        int b = 2;
        b -= 1; // b = b - 1
        System.out.println("Nilai bentuk -= b menjadi = " + b);

        int c = 3;
        c *= 2; // c = c * 2
        System.out.println("Nilai bentuk *= c menjadi = " + c);

        int d = 4;
        d /= 2; // d = d / 2
        System.out.println("Nilai bentuk /= d menjadi = " + d);

        int e = 5;
        e %= 3;
        System.out.println("Nilai bentuk %= e menjadi = " + e);
    }

}
