public class TestMyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        return a < b ? -1 : a == b ? 0 : 1;
    }
}
