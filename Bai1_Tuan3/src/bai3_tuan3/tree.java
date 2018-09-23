package bai3_tuan3;

public class tree {
    private String tuoi,chieucao;

    tree(String tuoi, String chieucao){
        this.tuoi = tuoi;
        this.chieucao = chieucao;
    }

    public void setMaulong(String tuoi) {
        this.tuoi = tuoi;
    }
    public void setCanNang(String chieucao) {
        this.chieucao = chieucao;
    }

    public String getMaulong() {
        return this.tuoi;
    }
    public String getCanNang() {
        return this.chieucao;
    }
    public void getInfor() {
        System.out.print("Cây có tuổi là: " + this.tuoi + " và có chiều cao: " + this.chieucao);
    }

    public static void main(String[] args){
        tree tree1 = new tree("13 năm", "15m");
        tree1.getInfor();


    }
}
