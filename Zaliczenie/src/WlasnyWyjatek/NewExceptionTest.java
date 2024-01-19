package WlasnyWyjatek;

import java.util.Scanner;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println(getValidUserInput());
        } catch (InputTooLongException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex);
        }
    }

    static String getValidUserInput() throws InputTooLongException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę o wpisanie slowa o maksymalnej dlugosci 6 znakow");
        String napis = scanner.nextLine();

        if(napis.length() <= 6) {
            return "Ok";
        } else {
            throw new InputTooLongException("Za długi napis");
        }
    }
}
