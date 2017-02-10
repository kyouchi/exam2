package exam2.d13137.p1;

import exam2.d00000.p1.MinimumMedicalCheckup;

public class Main {
    public static void main(String[] args) {
        MinimumMedicalCheckup checkup1 = new MinimumMedicalCheckup(1.7, 75);
        System.out.println("BMI: " + checkup1.getBmi());
        System.out.println("肥満判定: " + checkup1.getBmiClass());

        FullMedicalCheckup checkup2 = new FullMedicalCheckup(1.7, 75);
        System.out.println("BMI: " + checkup2.getBmi());
        System.out.println("肥満判定: " + checkup2.getBmiClass());
        System.out.println("基礎代謝量: " + checkup2.getBme());

        FullMedicalCheckup checkup3 = new FullMedicalCheckup(1.6, 45, 28, false);
        System.out.println("BMI: " + checkup3.getBmi());
        System.out.println("肥満判定: " + checkup3.getBmiClass());
        System.out.println("基礎代謝量: " + checkup3.getBme());
    }
}