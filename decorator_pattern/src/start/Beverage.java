package start;

public abstract class Beverage { 

	protected String description;

	protected abstract float consts();
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}

/**
 *  
 *	type of drink and toping --> multiple class
 *	multiple class extend --> trouble 
 *   
 */
