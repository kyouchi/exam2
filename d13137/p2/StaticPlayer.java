package exam2.d13137.p2;
import exam2.d00000.p2.JankenPlayer;

public class StaticPlayer implements JankenPlayer{
	public String name;
	public int hand1;//1回目に出す手
	public int hand2;//2回目に出す手
	public int hand3;//3回目に出す手

	public StaticPlayer(String name, int hand1,int hand2,int hand3) {
		this.name = name;
		this.hand1 = hand1;
		this.hand2 = hand2;
		this.hand3 = hand3;
	}

	@Override
	public String getName(){
		return name;
	}

	@Override
	public int getHand(int t){

		switch(t){
		case 0:
			return hand1;
		case 1:
			return hand2;
		case 2:
			return hand3;
		default://それ以外(そんなものないけどね)
			return -1;
		}

	}

}
