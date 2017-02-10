package exam2.d13137.p2;

import exam2.d00000.p2.JankenPlayer;

public class JankenGame{
	public JankenPlayer player1;
	public JankenPlayer player2;

	public JankenGame(JankenPlayer p1, JankenPlayer p2) {
		this.player1 = p1;
		this.player2 = p2;
	}

	public String battle(){
		int count1=0;//player1が勝った数
		int count2=0;//player2が勝った数
		for(int i=0; i<=2; i++){

			if(player1.getHand(i)==player2.getHand(i)){
				//あいこなら何もしない
			}
			else{
				switch(player1.getHand(i)){
				case 0://player1がグーの時
					if(player2.getHand(i)==1){
						count1++;
					}else{
						count2++;
					}
					break;
				case 1://player1がチョキの時
					if(player2.getHand(i)==0){
						count2++;
					}else{
						count1++;
					}
					break;
				case 2://player1がパーの時
					if(player2.getHand(i)==0){
						count1++;
					}else{
						count2++;
					}
					break;
				}
			}
			//以上をfor文で繰り返す。

		}

		//最終結果
		if(count1==count2){
			return "引き分け";
		}else{
			if(count1>count2){
				return player1.getName() + "の勝ち";
			}else{
				return player2.getName() + "の勝ち";
			}
		}
	}

}
