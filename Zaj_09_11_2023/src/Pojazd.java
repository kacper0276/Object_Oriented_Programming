public class Pojazd {
    public Pojazd() {}

    public void jedz() {
        System.out.println("Pojazd jedzie");
    }
}

class Samochod extends Pojazd {
    public Samochod() {}

    @Override
    public void jedz() {
        super.jedz();
        System.out.println("Samochod jedzie");
    }
}