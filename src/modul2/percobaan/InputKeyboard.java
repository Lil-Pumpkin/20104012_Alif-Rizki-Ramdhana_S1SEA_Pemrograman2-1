package modul2.percobaan;

import java.util.Scanner;

public class InputKeyboard {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int var_a;
        int var_b;
        System.out.print("Masukan nilai var_a\t: ");
        var_a = masukan.nextInt();
        System.out.print("Masukan nilai var_b\t: ");
        var_b = masukan.nextInt();
        System.out.println("\n<=== Variable yang terdapat dalam program ===>");
        System.out.println("var_a\t: " + var_a);
        System.out.println("var_b\t: " + var_b);
    }
}
