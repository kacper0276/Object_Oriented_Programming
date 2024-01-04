package zad7;

public class Tree extends Plant implements Comparable<Tree>{
    private int height;

    public Tree(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Tree o) {
        return Integer.compare(this.height, o.height);
    }
}
