public class Tool {
    public String name;
    protected Tool() {
        this.name = "Narzedzia";
    }
}

class Hammer extends Tool {
    public Hammer() {
        super();
    }
}