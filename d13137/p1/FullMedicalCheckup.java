package exam2.d13137.p1;
import exam2.d00000.p1.MinimumMedicalCheckup;

public class FullMedicalCheckup extends MinimumMedicalCheckup{
	public int age;
	public boolean male;//男性ならtrue

	public FullMedicalCheckup(double height, double weight){
		super(height, weight);//継承元のclassのInstanceを作成
		this.age=18;
		this.male=true;
	}

	public FullMedicalCheckup(double height, double weight, int age, boolean male){
		super(height, weight);//継承元のclassのInstanceを作成
		this.age=age;
		this.male=male;
	}

	public double getBme(){
		if(male){
			//男性の時
			return ( (13.397*this.weight) + (4.799*this.height*100) - (5.677*age)+88.362 );
		}else{
			//女性の時
			return( (9.247*this.weight) + (3.098*this.height*100) - (4.33*age)+447.593 );
		}
	}

	@Override
    public String getBmiClass() {
        double bmi = getBmi();
        if(bmi<16){
        	return "痩せすぎ";
        }else if(bmi>=16){
        	//16以上確定
        	if(bmi<17){
        		return "痩せ";
        	}else if(bmi>=17){
        		//17以上確定
        		if(bmi<18.5){
        			return "痩せぎみ";
        		}else if(bmi>=18.5){
        			//18.5以上確定
        			if(bmi<25.0){
        				return "普通体重";//ここを間違えて"標準体重"と書いてしまったのである。
        			}else if(bmi>=25.0){
        				//25以上確定
        				if(bmi<30.0){
        					return "肥満予備軍";
        				}else{
        					//30以上確定
        					return "肥満";
        				}
        			}
        		}
        	}
        }
        return "エラ－";//普通は通らない
    }

}
