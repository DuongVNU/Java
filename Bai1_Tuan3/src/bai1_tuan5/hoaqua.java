package bai1_tuan5;

public class hoaqua {
    private int gia, soluong;
    private String nguongoc, ngaynhap;

    public int getGia() { // getter gia ban
        return this.gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNguongoc() { // getter nguon goc
        return this.nguongoc;
    }

    public void setNguongoc(String s) {
        this.nguongoc = s;
    }

    public String getNgaynhap() {
        return this.ngaynhap;
    }

    public void setNgaynhap(String s) {
        this.ngaynhap = s;
    }

    public int getSoluong() {
        return this.soluong;
    }

    public void setSoluong(int n) {
        this.soluong = n;
    }

    public hoaqua(int g, String ng, String date, int sl) {
        this.gia = g;
        this.nguongoc = ng;
        this.ngaynhap = date;
        this.soluong = sl;
    }
    public void getInfo(hoaqua hq) {
        System.out.println("Gia ban:" + this.gia);
        System.out.println("Nguon goc:" + this.nguongoc);
        System.out.println("Ngay nhap:" + this.ngaynhap);
        System.out.println("So luong:" + this.soluong + "kg");
    }
}
