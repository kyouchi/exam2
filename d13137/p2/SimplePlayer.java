package exam2.d13137.p2;
import exam2.d00000.p2.JankenPlayer;

public class SimplePlayer implements JankenPlayer{
	public String name;
	public int hand;//じゃんけんで出す手

	public SimplePlayer(String name, int hand) {
		this.name = name;
		this.hand = hand;
	}

	@Override
	public String getName(){
		return name;
	}
	@Override
	public int getHand(int t){
		return hand;
	}

}
