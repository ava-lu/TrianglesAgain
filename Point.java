public class Point {
  private double x, y;

  //construct a point given coordinates
  public Point(double X, double Y) {
    x = X;
    y = Y;
  }

  //construct a point given a point
  public Point(Point p) {
    x = p.x;
    y = p.y;
  }

  public double getX() {
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other) {
    double otherx = other.getX();
    double othery = other.getY();
    double result = Math.sqrt(((otherx-x) * (otherx-x)) + ((othery-y) *
    (othery-y)));
    return(result);
  }


}
