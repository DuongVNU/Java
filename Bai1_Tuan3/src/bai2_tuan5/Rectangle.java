package bai2_tuan5;

public class Rectangle extends Shape {

    protected double width, length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double r, double d) {
        this.width = r;
        this.length = d;
    }
    public Rectangle(double r, double d,String color, boolean bool) {
       super(color,bool);
        this.width = r;
        this.length = d;
    }
    public double getWidth() { // getter width
        return this.width;
    }
    public void setWidth(double r) { // setter width
        this.width = r;
    }
    public double getLength() { // getter length
        return this.length;
    }
    public void setLength(double r) { // setter length
        this.length = r;
    }
    public double getArea(){ // ham tinh dien tich hinh chu nhat
        return this.width * this.length;
    }
    public double getPerimeter(){ // ham tinh chu vi hinh chu nhat
        return 2 * (this.width + this.length);
    }
    public String toString() {
        return "Rectangle:" + this.color + " " + this.filled;
    }

}
