package Interfejs;

public class NiestandardowyPrinter implements Printer{
    @Override
    public void drukuj(String tekst) {
        StringBuilder tek = new StringBuilder(tekst);
        System.out.println(tek.reverse());
    }
}
