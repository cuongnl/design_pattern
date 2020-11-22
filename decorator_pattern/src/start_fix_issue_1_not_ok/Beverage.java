package start_fix_issue_1_not_ok;

public abstract class Beverage { 

	protected String description;
	
	//toping
	protected boolean milk;
	protected boolean tea;
	protected boolean mocha;

	protected abstract float consts();
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}

/**
 *  
 *	fix issue --> add topping to base class --> limit the number of class --> not trouble
 *	BUT
 *  -change topping price --> change code --> bug
 *  -add toping --> change code --> bug
 *  -beverage not topping --> redundant source code topping
 *  
 *   
 */
