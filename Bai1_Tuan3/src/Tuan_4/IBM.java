package Tuan_4;

public class IBM {
    public static String chiSoBMI(double cannang, double chieucao) {
        double BMI = cannang/ (chieucao * chieucao);
        if(BMI<18.5){
            return "Thiếu cân";
        }else if(BMI >= 18.5 && BMI <23){
            return "Bình thường";
        }else if(BMI >= 23 && BMI <25){
            return "Thừa cân";
        }else if(BMI >= 25){
            return "Béo phì";
        }else return null;
    }
}
