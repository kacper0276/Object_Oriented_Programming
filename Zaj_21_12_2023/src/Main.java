public class Main {
    public static void main(String[] args) {
        // Zadanie Testowe
        KierownikWycieczki kierownik = new KierownikWycieczki(new Koncert());
        kierownik.zalatwBilety();
        kierownik = new KierownikWycieczki(new LotMiedzynarodowy());
        kierownik.zalatwBilety();
        kierownik = new KierownikWycieczki(new BramkaNaAutostradzie());
        kierownik.zalatwBilety();

        // Zadanie 1
        Biuro biuro = new Biuro(new StandardowyPrinter());
        biuro.drukujDokument("Napis testowy");

        // Zadanie 2
        Samochód samochód = new Samochód(new BenzynowySilnik());
        samochód.start();
        samochód.stop();

        // Zadanie 3
        Użytkownik użytkownik = new Użytkownik(new Email());
        użytkownik.powiadomOModernizacji("Treść maila");

        // Zadanie 4
        Wyjatki wyjatki = new Wyjatki();
        try {
            wyjatki.checkAge(1);
            wyjatki.checkAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        // Zadanie 5
        Wyjatki.przyklad2();

        // Zadanie 6
        Wyjatki.WlasnyWyjatek();
    }
}