package swap;

public class VideoGame {
    String name, developer;
    float rating;

    public VideoGame(String name, String developer, float rating) {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Nazwa: " + name;
    }
}
