package bai3_tuan3;

public class meo {
    private String maulong,cannang;

    meo(String maulong, String cannang){
        this.maulong = maulong;
        this.cannang = cannang;
    }

    public void setMaulong(String maulong) {
        this.maulong = maulong;
    }
    public void setCanNang(String cannang) {
        this.cannang = cannang;
    }

    public String getMaulong() {
        return this.maulong;
    }
    public String getCanNang() {
        return this.cannang;
    }
    public void getInfor() {
        System.out.print("Con mèo có màu lông " + this.maulong + " và có cân nặng: " + this.cannang);
    }

    public static void main(String[] args){
        meo conmeo1 = new meo("màu đỏ", "13kg");
        conmeo1.getInfor();


    }
}
