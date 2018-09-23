package bai3_tuan3;

public class fish {
    private String cannang,chieudai;

    fish(String cannang, String chieudai){
        this.cannang = cannang;
        this.chieudai = chieudai;
    }

    public void setCanNang(String cannang) {
        this.cannang = cannang;
    }
    public void setChieudai(String chieudai) {
        this.chieudai = chieudai;
    }

    public String getCanNang() {
        return this.cannang;
    }
    public String getChieudai() {
        return this.chieudai;
    }
    public void getInfor() {
        System.out.print("Con cá có cân nặng: " + this.cannang + " và có chiều dài: " + this.chieudai);
    }
    public void Boi() {
        System.out.print("Con cá đang bơi");
    }

    public static void main(String[] args){
        fish fish1 = new fish("13kg", "2m");
        fish1.getInfor();
        fish1.Boi();


    }
}
