package restaurant;

/**
 * 음식
 */
public class Food {
	
	/** 음식 */
	private String food;
	/** 음식의 포만감 */
	private int fullness;
	
	
	public Food(String food, int fullness) {
		this.food = food;
		this.fullness = fullness;
	}

	public String getFood() {
		return food;
	}

	public int getFullness() {
		return fullness;
	}
	
	
}
