package start_fix_issue_1_not_ok;

public class Decaf extends Beverage{

	@Override
	protected float consts() {
		float output = 11;
		if(this.milk) {
			output+=1;
		}
		if(this.mocha) {
			output+=2;
		}
		if(this.tea) {
			output+=3;
		}
		return output;
	}

}
