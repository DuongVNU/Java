package bai3_tuan3;

public class dienthoai {

    private String maumay,type;

    dienthoai(String maumay, String type){
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
        System.out.print("Điện thoại có màu " + this.maumay + " là điện thoại: " + this.type + ", ");
    }
    public void nhanTin() {
        System.out.print("Nhắn tin");
    }

    public static void main(String[] args){
        dienthoai dienthoai1 = new dienthoai("vàng", "iphone");
        dienthoai1.getInfor();
        dienthoai1.nhanTin();
    }
}
