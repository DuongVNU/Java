package bai2_tuan5;

public class quanli {
    public static void main(String[] args) {
        Shape shape1 = new Shape("red", true);
        System.out.println(shape1);

        Circle tron = new Circle(2, "black", false);
        System.out.println(tron.getArea());
        System.out.println(tron.getPerimeter());

        Rectangle hcn = new Rectangle(2, 4, "black", true);
        System.out.println(hcn.getArea());
        System.out.println(hcn.getPerimeter());

        Square vuong = new Square(4, "blue", true);
        System.out.println(vuong);
    }
}
