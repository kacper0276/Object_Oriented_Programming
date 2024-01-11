package WlasnyWyjatek;

public class NiepoprawnyFormatDanychException extends Exception{
    // Może być runtimeException
    NiepoprawnyFormatDanychException(String tekst) {
        super(tekst);
    }

    NiepoprawnyFormatDanychException() {
        super();
    }

    public String toString() {
        return ("Moj wyjątek");
    }
}
