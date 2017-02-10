package exam2.d13137.p2;

import java.util.ArrayList;

import exam2.d00000.p2.JankenPlayer;

public class Main {
    public static void main(String[] args) {
        // プレイヤー
        ArrayList<JankenPlayer> playerList = new ArrayList<>();
        playerList.add(new SimplePlayer("カイジ",0)); // グーだけ
        playerList.add(new SimplePlayer("古畑", 0)); // グーだけ
        playerList.add(new SimplePlayer("石田", 1)); // チョキだけ
        playerList.add(new StaticPlayer("船井",1, 2, 2)); // チョキ パー パー
        playerList.add(new StaticPlayer("安藤",0, 1, 2)); // グー チョキ パー
        playerList.add(new StaticPlayer("北見",1, 1, 2)); // チョキ チョキ パー

        // 総当たりで対戦
        for (int i = 0; i<playerList.size(); i++) {
            for (int j = i+1; j < playerList.size(); j++) {
                JankenPlayer player1 = playerList.get(i);
                JankenPlayer player2 = playerList.get(j);
                JankenGame game = new JankenGame(player1, player2);
                String result = game.battle();
                System.out.println(player1.getName() + "対" + player2.getName() + "は" + result);
            }
        }
    }
}
