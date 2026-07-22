package restaurant;

/**
 * 주류
 */
public class Drink {
	
	/** 주류 이름 */
	private String drinks;
	
	/** 주류의 도수 */
	private int alcohol;
	
	public Drink(String drinks, int alcohol) {
		this.drinks = drinks;
		this.alcohol = alcohol;
	}

	public String getDrinks() {
		return drinks;
	}

	public int getAlcohol() {
		return alcohol;
	}
	
	
}
