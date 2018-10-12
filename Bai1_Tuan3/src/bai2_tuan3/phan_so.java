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

    /**
     *
     * @param tuso
     * @param mauso
     * @return
     */
    private int greatestCommonDivisor(int tuso, int mauso) {
        if (tuso < 0) {
            tuso = -tuso;
        }
        if (mauso < 0) {
            mauso = -mauso;
        }
        while (tuso != mauso) {
            if (tuso > mauso) {
                tuso = tuso - mauso;
            } else {
                mauso = mauso - tuso;
            }
        }
        return tuso;

    }

    private static void rutgon(phan_so a) {
        int ucll = a.greatestCommonDivisor(a.tuso, a.mauso);
        a.tuso = a.tuso / ucll;
        a.mauso = a.mauso / ucll;
    }

    private void congPhanSo(phan_so ps) {
        int ts = this.getTuSo() * ps.getMauSo() + this.getMauSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        phan_so tongPhanSo = new phan_so(ts, ms);
//        tongPhanSo.rutgon();
//        phan_so.rutgon(tongPhanSo);
        System.out.println("Tổng hai phân số là: " + tongPhanSo.tuso + "/" + tongPhanSo.mauso);
    }

    private void truPhanSo(phan_so ps) {
        int ts = this.getTuSo() * ps.getMauSo() - this.getMauSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        phan_so hieuPhanSo = new phan_so(ts, ms);
        if (ts != 0) {
//            tongPhanSo.rutgon();
//            phan_so.rutgon(hieuPhanSo);
            System.out.println("Hiệu hai phân số là: " + hieuPhanSo.tuso + "/" + hieuPhanSo.mauso);
        } else {
            System.out.println("Hiệu hai phân số là: 0");
        }
    }
    private void nhanPhanSo(phan_so ps) {
        int ts = this.getTuSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        phan_so tichPhanSo = new phan_so(ts, ms);
//        phan_so.rutgon(tichPhanSo);
        System.out.println("Tích hai phân số là: " + tichPhanSo.tuso + "/" + tichPhanSo.mauso);
    }

    private void chiaPhanSo(phan_so ps) {
        int ts = this.getTuSo() * ps.getMauSo();
        int ms = this.getMauSo() * ps.getTuSo();
        phan_so thuongPhanSo = new phan_so(ts, ms);
//        thuongPhanSo.rutgon();
//        phan_so.rutgon(thuongPhanSo);
        System.out.println("Thương hai phân số là: " + thuongPhanSo.tuso + "/" + thuongPhanSo.mauso);
    }

    public boolean equals(phan_so ps) {
        int ac = this.getTuSo() * ps.getMauSo();
        int bd = this.getMauSo() * ps.getTuSo();
        return (ac == bd);
    }

    public static void main(String[] args) {
        phan_so phanso1 = new phan_so(1, 2);
        phan_so phanso2 = new phan_so(1, 5);
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
