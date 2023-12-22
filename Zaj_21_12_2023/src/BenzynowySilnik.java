public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Benzynowy silnik uruchomiony");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Benzynowy silnik zatrzymany");
    }
}
