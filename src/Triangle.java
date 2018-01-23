import java.util.List;

public class Triangle {

    private List <Point> points;

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void drow() {

        for (Point point : points) {
            System.out.println("Point = ( " + point.getX() + " , " + point.getY() + " )");
        }
    }
}
