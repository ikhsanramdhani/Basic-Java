package com.tutorial;

public class Main {

    public static void main(String[] args){

        // Operator Logika = Operator yang dilakukan pada tipe data Boolean

        /* Operator Logika ada 4 bentuk, yaitu :
            1. OR ( || ) = math rumusnya itu +
            2. AND ( && ) = math rumusnya itu *
            3. XOR (^) = yang berbeda jenis adalah true, yg sama adalah false
            4. NOT (!) = kebalikan nilai boolean
        */

        boolean a,b,c;
        System.out.println();
        System.out.println("Bentuk Operator Logika : ");
        System.out.println();

        // OR / Atau (||)

        /* 0 = false, 1 = true

            0 + 0 = 0, false
            0 + 1 = 1, true
            1 + 0 = 1, true
            1 + 1 = 2 (ditulis 1) true

        */
        System.out.println("--- OR (||) ---");

        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c); // 0 + 0 = 0, yaitu false

        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c); // 0 + 1 = 1, yaitu true

        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c); // 1 + 0 = 1, yaitu true

        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c); // 1 + 1 = 1, yaitu true


        System.out.println();


        // AND / Dan (&&)

        /* 0 = false, 1 = true

            0 * 0 = 0, false
            0 * 1 = 1, false
            1 * 0 = 1, false
            1 * 1 = 2 (ditulis 1) true

        */
        System.out.println("--- AND (&&) ---");

        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c); // 0 * 0 = 0, yaitu false

        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c); // 0 * 1 = 0, yaitu false

        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c); // 1 * 0 = 0, yaitu false

        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c); // 1 * 1 = 1, yaitu true

        System.out.println();


        // XOR / Exclusive OR (^)
            // Yang berbeda jenis adalah true, yang sama adalah false.
        /* 0 = false, 1 = true

            0 ^ 0 = 0, false
            0 ^ 1 = 1, true
            1 ^ 0 = 1, true
            1 ^ 1 = 2 (ditulis 1) false

        */
        System.out.println("--- XOR (^) ---");

        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); // 0 ^ 0 = 0, yaitu false

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); // 0 ^ 1 = 0, yaitu true

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); // 1 ^ 0 = 0, yaitu true

        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c); // 1 ^ 1 = 1, yaitu false

        System.out.println();


        // NOT / Negasi (!)
        System.out.println("--- NOT (!) ---");

        a = true;
        c = !a;
        System.out.println(a + " --> (!) = " + c);

        a = false;
        c = !a;
        System.out.println(a + " --> (!) = " + c);

    }

}
