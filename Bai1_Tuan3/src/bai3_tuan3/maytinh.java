package bai3_tuan3;

public class maytinh {



    private String maumay,type;

    maytinh(String maumay, String type){
        this.maumay = maumay;
        this.type = type;
    }

    public void setMauMay(String maumay) {
        this.maumay = maumay;
    }
    public void setLoaiMay(String type) {
        this.type = type;
    }

    public String getMauMay() {
        return this.maumay;
    }
    public String getLoaiMay() {
        return this.type;
    }
    public void getInfor() {
        System.out.print("Máy tính có màu " + this.maumay + " là máy tính hãng: " + this.type + ", ");
    }
    public void khoiDong() {
        System.out.print("Khởi động window");
    }

    public static void main(String[] args){
        maytinh maytinh1 = new maytinh("vàng", "dell");
        maytinh1.getInfor();
        maytinh1.khoiDong();
    }
}
