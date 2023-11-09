public class Istota {
    public Istota() {
        System.out.println("Istota Contructor");
    }
}

class Czlowiek extends Istota {
    public Czlowiek() {
        System.out.println("Czlowiek Constructor");
    }
}

class Programista extends Czlowiek {
    public Programista() {
        System.out.println("Programista Constructor");
    }
}
