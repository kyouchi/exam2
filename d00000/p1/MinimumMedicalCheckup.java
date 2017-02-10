package exam2.d00000.p1;

public class MinimumMedicalCheckup {
    public double height; // 身長[m]
    public double weight; // 体重[kg]

    public MinimumMedicalCheckup(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getBmi() {
        return weight / (height * height);
    }

    public String getBmiClass() {
        double bmi = getBmi();
        if (bmi < 18.5) {
            return "低体重";
        } else if (25 <= bmi) {
            return "肥満";
        } else {
            return "普通体重";
        }
    }
}