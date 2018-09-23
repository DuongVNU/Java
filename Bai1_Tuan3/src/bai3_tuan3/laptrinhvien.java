package bai3_tuan3;

public class laptrinhvien {

    private String ten,tuoi,kinhnghiem;

    laptrinhvien(String ten, String tuoi, String kinhnghiem){
        this.ten = ten;
        this.tuoi = tuoi;
        this.kinhnghiem= kinhnghiem;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
    public void setKinhnghiem(String kinhnghiem) {
        this.kinhnghiem= kinhnghiem;
    }

    public String getTen() {
        return this.ten;
    }
    public String getTuoi() {
        return this.tuoi;
    }
    public String getKinhnghiem() {
        return this.kinhnghiem;
    }
    public void getInfor() {
        System.out.print("Lập trình viên có tên là: " + this.ten + " và có tuổi: " + this.tuoi +",và có kinh nghiệm: " + this.kinhnghiem);
    }

    public static void main(String[] args){
        laptrinhvien laptrinhvien1 = new laptrinhvien("Duong", "15","3 năm");
        laptrinhvien1.getInfor();


    }
}
