public class Circle {

    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}
