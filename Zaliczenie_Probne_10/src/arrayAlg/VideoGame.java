package arrayAlg;

public class VideoGame implements Comparable<VideoGame> {
    private String name;
    private String developer;
    private float rating;

    public VideoGame(String name, String developer, float rating) {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + "  " + developer + "  " + rating;
    }


    @Override
    public int compareTo(VideoGame o) {
        return this.name.compareTo(o.name);
    }
}
