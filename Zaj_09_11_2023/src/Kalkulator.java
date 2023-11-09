public class Kalkulator {
    public int dodaj(int a, int b) {
        return a + b;
    }
}

class KalkulatorRozszerzony {
//    @Override <- nie przesłonięcie a przeciążenie
    public int dodaj(int a, int b, int c) {
        return a + b + c;
    }
}
