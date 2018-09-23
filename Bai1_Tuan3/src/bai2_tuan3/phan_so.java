package bai2_tuan3;

public class phan_so {
    private int tuso;
    private int mauso;

    private phan_so(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }


    private int getTuSo() {
        return tuso;
    }

    private int getMauSo() {
        return mauso;
    }

    private int greatestCommonDivisor(int tuso, int mauso) {
        while (tuso != mauso) {
            if (tuso > mauso) {
                tuso = tuso - mauso;
            } else {
                mauso = mauso - tuso;
            }
        }
        return tuso;

    }

    private void rutgon() {
        int ucll = this.greatestCommonDivisor(this.tuso, this.mauso);
        tuso = tuso / ucll;
        mauso = mauso / ucll;
    }

    private void congPhanSo(phan_so ps) {
        int ts = this.getTuSo() * ps.getMauSo() + this.getMauSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        phan_so tongPhanSo = new phan_so(ts, ms);
        tongPhanSo.rutgon();
        System.out.println("Tổng hai phân số là: " + tongPhanSo.tuso + "/" + tongPhanSo.mauso);
    }

    private void truPhanSo(phan_so ps) {
        int ts = this.getTuSo() * ps.getMauSo() - this.getMauSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        phan_so tongPhanSo = new phan_so(ts, ms);
        if (ts != 0) {
            tongPhanSo.rutgon();
            System.out.println("Hiệu hai phân số là: " + tongPhanSo.tuso + "/" + tongPhanSo.mauso);
        } else {
            System.out.println("Hiệu hai phân số là: 0");
        }
    }
    private void nhanPhanSo(phan_so ps) {
        int ts = this.getTuSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        phan_so tichPhanSo = new phan_so(ts, ms);
        tichPhanSo.rutgon();
        System.out.println("Tích hai phân số là: " + tichPhanSo.tuso + "/" + tichPhanSo.mauso);
    }

    private void chiaPhanSo(phan_so ps) {
        int ts = this.getTuSo() * ps.getMauSo();
        int ms = this.getMauSo() * ps.getTuSo();
        phan_so thuongPhanSo = new phan_so(ts, ms);
        thuongPhanSo.rutgon();
        System.out.println("Thương hai phân số là: " + thuongPhanSo.tuso + "/" + thuongPhanSo.mauso);
    }

    public boolean equals(phan_so ps) {
        int ac = this.getTuSo() * ps.getMauSo();
        int bd = this.getMauSo() * ps.getTuSo();
        return (ac == bd);
    }

    public static void main(String[] args) {
        phan_so phanso1 = new phan_so(3, 5);
        phan_so phanso2 = new phan_so(3, 5);
        phanso1.congPhanSo(phanso2);
        phanso1.truPhanSo(phanso2);
        phanso1.nhanPhanSo(phanso2);
        phanso1.chiaPhanSo(phanso2);
        if (phanso1.equals(phanso2)) {
            System.out.print("Hai phân số bằng nhau!");
        } else {
            System.out.print("Hai phân số không bằng nhau!");
        }

    }

}
