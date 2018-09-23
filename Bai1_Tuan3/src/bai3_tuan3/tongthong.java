package bai3_tuan3;

public class tongthong {
    private String mautoc,mauda;

    tongthong(String mautoc, String mauda){
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
        System.out.print("Tổng thống có tóc " + this.mautoc + " có màu da: " + this.mauda);
    }
    public void ngoaiGiao() {
        System.out.print("Tổng thống đi sang nước khác ngoại giao");
    }

    public static void main(String[] args){
        tongthong tongthong1 = new tongthong("màu vàng", "trắng");
        tongthong1.getInfor();
        tongthong1.ngoaiGiao();


    }
}
