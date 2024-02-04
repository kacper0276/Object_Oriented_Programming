package Wyjatki;

import java.util.Scanner;

public class WyjatekTest {
    public static void sprawdzFormatDanych(String napis) throws Wyjatek {
        if(napis.contains("a")) {
            throw new Wyjatek("Własny wyjątek");
        }

        System.out.println(napis);
    }

    public static void WlasnyWyjatek() {


        try {
            Scanner scanner = new Scanner(System.in);

            String nazwa = scanner.nextLine();

            sprawdzFormatDanych(nazwa);
        } catch (Wyjatek ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        WlasnyWyjatek();
    }
}
