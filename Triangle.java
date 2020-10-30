public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter() {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    return(a+b+c);
  }

  public double getArea() {
    double semiperimeter = getPerimeter() / 2;
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    double result = semiperimeter*(semiperimeter - a)*(semiperimeter - b)*(semiperimeter - c);
    return(Math.sqrt(result));
  }

  public String classify() {
    double a = Math.round(((v1.distanceTo(v2)) * 10000.0)/ 10000.0);
    double b = Math.round(((v2.distanceTo(v3)) * 10000.0)/ 10000.0);
    double c = Math.round(((v3.distanceTo(v1)) * 10000.0)/ 10000.0);
    if (a == b || b == c || a == c) {
      if (a == b && b == c){
        return("equilateral");
      }
      return("isosceles");
    }
    return("scalene");
  }

  public String toString() {
    String str = "v1"+"("+v1.getX()+","+v1.getY()+") " + "v2"+"("+v2.getX()+","+
    v2.getY()+") "+"v3"+"("+v3.getX()+","+v3.getY()+")";
    return str;
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) v1 = newP;
    if (index == 1) v2 = newP;
    if (index == 2) v3 = newP;
  }

}
