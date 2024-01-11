package Record;

public record Point2D(double x, double y) {
    public double distanceTo(Point2D otherPoint) {
        double result = Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
        return result;
    }
}
