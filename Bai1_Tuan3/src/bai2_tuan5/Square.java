package bai2_tuan5;

public class Square extends Rectangle {
    private double side;
    public Square(){
        this.side = 2.0;
    }
    public Square(double r){
        this.side = r;
    }
    public Square(double r, String s, boolean bool){
        super(r, r, s, bool);
    }
    public double getSide() {
        return this.side;
    }
    public void setSide(double a) {
        this.side = a;
    }
    public void setWidth(double a) {
        this.side = a;
    }
    public void setLength(double a) {
        this.side = a;
    }
    public String toString() {
        return "Square:" + color + " " + filled;
    }

    public double getArea(){
        return  this.side*this.side;
    }
    public double getPerimeter(){
        return 4 * this.side;
    }
}
