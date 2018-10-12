package bai2_tuan5;

public class Shape {

    protected String color;
    protected boolean filled;

    Shape(){
        this.color= "red";
        this.filled = true;
    }
    Shape( String color, boolean filled){
        this.color= color;
        this.filled = filled;
    }

    public String getMauToc() {
        return this.color;
    }
    public boolean isFilled() {
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
    return (this.color + " is " + this.filled);
    }

}
