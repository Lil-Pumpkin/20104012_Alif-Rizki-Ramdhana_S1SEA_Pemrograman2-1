package modul2.latihan;

import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        int[] a, b, c;

        System.out.print("Masukkan Jumlah Testcase\t: ");
        t = sc.nextInt();
        a = new int[t];
        b = new int[t];
        c = new int[t];

        for (int i = 0; i < t; i++) {
            System.out.print("\nMasukkan A" + (i + 1) + "\t: ");
            a[i] = sc.nextInt();
            System.out.print("Masukkan B" + (i + 1) + "\t: ");
            b[i] = sc.nextInt();
            System.out.print("Masukkan C" + (i + 1) + "\t: ");
            c[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            System.out.print("\nA" + (i + 1) + " + B" + (i + 1) + " - C" + (i + 1) + " = ");
            System.out.println(a[i] + b[i] - c[i]);
        }
    }
}
