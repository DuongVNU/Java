package bai1_tuan5;

public class quanli {
    public static void main(String[] args) {
        hoaqua nho = new hoaqua(50000, "Trung Quoc", "7/10/2018", 100);
        quacam cam = new quacam(70000, "Viet Nam", "6/10/2018", 30);
        quatao tao = new quatao(10000, "My", "5/10/2018/", 50);
        camcaophong caophong = new camcaophong(50000, "Hai Phong", "4/10/2018", 80);
        camsanh camsanh = new camsanh(30000, "Hai Duong", "3/10/2018", 10);
        System.out.println("Qua nho:");
        nho.getInfo(nho);
        System.out.println();
        System.out.println("Qua cam Canh:");
        cam.getInfo(nho);
        System.out.println();
        System.out.println("Qua tao:");
        tao.getInfo(nho);
        System.out.println();
        System.out.println("Qua cam Cao Phong:");
        caophong.getInfo(nho);
        System.out.println();
        System.out.println("Qua cam sanh:");
        camsanh.getInfo(nho);
    }
}
