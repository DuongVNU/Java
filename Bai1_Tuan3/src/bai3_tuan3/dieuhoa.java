package bai3_tuan3;

public class dieuhoa {

    private String maumay,type;

    dieuhoa(String maumay, String type){
        this.maumay = maumay;
        this.type = type;
    }

    public void setMauToc(String maumay) {
        this.maumay = maumay;
    }
    public void setMauda(String type) {
        this.type = type;
    }

    public String getMauToc() {
        return this.maumay;
    }
    public String getMauDa() {
        return this.type;
    }
    public void getInfor() {
        System.out.print("Điều hòa có màu " + this.maumay + " là điều hòa " + this.type);
    }
    public void lamMat() {
        System.out.print("Điều hào thổi quạt mát");
    }

    public static void main(String[] args){
        dieuhoa dieuhoa1 = new dieuhoa("vàng", "hai chiều");
        dieuhoa1.getInfor();
        dieuhoa1.lamMat();


    }
}
