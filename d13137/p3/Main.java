package exam2.d13137.p3;

public class Main {
    public static void main(String[] args) {
        // お茶1、コーラ3で自販機を作成
        VendingMachine vendingMachine = new VendingMachine(1, 3);
        System.out.println(vendingMachine.getStatus()); // 作成直後の状況を表示

        // お茶1本目を購入
        boolean t1 = vendingMachine.buyTea();
        if (t1) {
            System.out.println("お茶を購入しました。");
        } else {
            System.out.println("お茶は売り切れていました。");
        }
        System.out.println(vendingMachine.getStatus()); // 購入後の状況を表示

        // コーラ1本目を購入
        boolean c1 = vendingMachine.buyCola();
        if (c1) {
            System.out.println("コーラを購入しました。");
        } else {
            System.out.println("コーラは売り切れていました。");
        }
        System.out.println(vendingMachine.getStatus()); // 購入後の状況を表示

        // お茶2本目を購入
        boolean t2 = vendingMachine.buyTea();
        if (t2) {
            System.out.println("お茶を購入しました。");
        } else {
            System.out.println("お茶は売り切れていました。");
        }
        System.out.println(vendingMachine.getStatus()); // 購入後の状況を表示

        // コーラ2本目を購入
        boolean c2 = vendingMachine.buyCola();
        if (c2) {
            System.out.println("コーラを購入しました。");
        } else {
            System.out.println("コーラは売り切れていました。");
        }
        System.out.println(vendingMachine.getStatus()); // 購入後の状況を表示

        // 集金し、お茶2、コーラ3を機内在庫に追加
        int sales = vendingMachine.collectAndRestock(2, 1);
        System.out.println(sales + "円集金し、在庫を追加しました。");
        System.out.println(vendingMachine.getStatus()); // 集金&在庫追加後の状況を表示
    }

}
