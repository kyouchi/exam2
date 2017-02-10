package exam2.d13137.p3;

public class VendingMachine {
	public int tea;
	public int cola;
	public int money;

	/*
	 * こちらの方が分かりやすい。
	 * public Integer tea;
	 * public Integer cola;
	 * public Integer money;
	 */

	public VendingMachine(int tea, int cola){
		this.tea=tea;
		this.cola=cola;
		money=0;
	}

	public boolean buyTea(){
		if(tea>0){
			tea--;
			money += 100;
			return true;
		}else{
			//買えない場合
			return false;
		}
	}

	public boolean buyCola(){
		if(cola>0){
			cola--;
			money += 150;
			return true;
		}else{
			//買えない場合
			return false;
		}
	}

	public int collectAndRestock(int addTea, int addCola){
		this.tea += addTea;
		this.cola += addCola;
		int memory=money;//memoryとか適当な変数を用意して代入
		money=0;//リセット
		return memory;
	}

	public String getStatus(){
		//Integer.toString();
		//Integer型をString型に変換する。
		//このときint型はInteger型に暗黙の型変換(オートボクシング)をしている。
		return Integer.toString(this.tea) + "," + Integer.toString(this.cola) + "," + Integer.toString(this.money);
	}

}
