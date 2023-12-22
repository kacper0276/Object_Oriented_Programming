public class Biuro {
    private Printer printer;

    public Biuro(Printer printer) {
        this.printer = printer;
    }

    void drukujDokument(String tekst) {
        printer.drukuj(tekst);
    }
}
