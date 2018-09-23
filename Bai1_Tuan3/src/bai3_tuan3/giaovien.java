package bai3_tuan3;

public class giaovien {


    private String mautoc,mauda;

    giaovien(String mautoc, String mauda){
        this.mautoc = mautoc;
        this.mauda = mauda;
    }

    public void setMauToc(String mautoc) {
        this.mautoc = mautoc;
    }
    public void setMauda(String mauda) {
        this.mauda = mauda;
    }

    public String getMauToc() {
        return this.mautoc;
    }
    public String getMauDa() {
        return this.mauda;
    }
    public void getInfor() {
        System.out.print("Cô giáo có tóc " + this.mautoc + " có màu da: " + this.mauda);
    }
    public void giangBai() {
        System.out.print("Cô giáo giảng bài");
    }

    public static void main(String[] args){
        giaovien cogiao1 = new giaovien("màu vàng", "trắng");
        cogiao1.getInfor();
        cogiao1.giangBai();


    }
}
