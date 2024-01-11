package Interfejs;

public class TestPrinter {
    public static void main(String[] args) {
        Biuro biuro = new Biuro(new NiestandardowyPrinter());
        biuro.drukujDokument("Tekst");
        Biuro biuro1 = new Biuro(new StandardowyPrinter());
        biuro1.drukujDokument("Tekst");
    }
}
