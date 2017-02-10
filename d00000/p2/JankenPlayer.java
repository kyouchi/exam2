package exam2.d00000.p2;

public interface JankenPlayer {
    /**
     * プレイヤーの名前を返すメソッド
     */
    String getName();

    /**
     * じゃんけんの手を返すメソッド
     * 引数は何回戦かを表す。
     * tが0: 1回戦目
     * tが1: 2回戦目
     * tが2: 3回戦目
     */
    int getHand(int t);
}