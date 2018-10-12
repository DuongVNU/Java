package bai2_tuan5;

public class Circle extends Shape {

    protected double radius;
    final private double PI = 3.14; // hang so pi

    Circle() {
        this.radius = 1.0;
    }

    Circle(double radius) { // constructor voi 1 tham so radius
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
       super(color, filled);
        this.radius = radius;

    }

    public double getRadius() { // getter radius
        return this.radius;
    }
    public void setRadius(double radius) { // setter radius
        this.radius = radius;
    }
    public double getArea() { // ham tinh dien tich
        return this.radius * this.radius * PI;
    }
    public double getPerimeter() { // ham tinh chi vi
        return 2 * PI * this.radius;
    }
    public String toString() {
        return "Circle:" + this.color + " " + this.filled;
    }


}
