package modul2.percobaan;

public class CobaUnicode {
    public static void main(String[] args) {
        char a = '\u0061';
        char b = '\u0062';
        char c = '\u0063';
        String kata = "\u0061\u0062\u0063";

        System.out.println("a\t: " + a);
        System.out.println("b\t: " + b);
        System.out.println("c\t: " + c);
    }
}
