package WlasnyWyjatek;

public class InputTooLongException extends Exception{
    public InputTooLongException() {
        super();
    }

    public InputTooLongException(String napis) {
        super(napis);
    }
}
