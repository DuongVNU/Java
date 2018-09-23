package bai3_tuan3;

public class congnhan {
    private String mautoc,mauda;

    congnhan(String mautoc, String mauda){
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
        System.out.print("Công nhân có tóc " + this.mautoc + " có màu da: " + this.mauda);
    }
    public void xayDung() {
        System.out.print("Công nhân đi xây dựng");
    }

    public static void main(String[] args){
        congnhan congnhan1 = new congnhan("màu vàng", "trắng");
        congnhan1.getInfor();
        congnhan1.xayDung();


    }
}
