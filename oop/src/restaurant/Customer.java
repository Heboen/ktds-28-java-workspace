package restaurant;

/**
 * 손님
 */
public class Customer {
	
	/** 손님 나이 */
	private int age;
	
	/** 손님 취기 */
	private int drunken;
	
	/** 손님 포만감 */
	private int stomach;
	
	/** 손님 부모님 동반 여부 */
	private boolean withparent;

	
	public Customer(int age, boolean withparant) {
		this.age = age;
		this.drunken = 0;
		this.stomach = 0;
		this.withparent = withparant;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getDrunken() {
		return drunken;
	}
	
	public int getStomach() {
		return stomach;
	}
	
	public boolean isWithparent() {
		return withparent;
	}

	public void fullness(Food food) {
		this.stomach += food.getFullness();
	}
	
	public void frutvegi() { //취기 감소
		System.out.println("===취기 감소===");
		if(this.getDrunken() < 5) {
			this.drunken -= this.drunken;
		}
		else {
			this.drunken -= 5;
		}
	}
	
	public void drunk(Drink drink) {
		this.drunken += drink.getAlcohol();
	}
	
	public void digest() { //포만감 감소
		System.out.println("===포만감 7감소===");
		if(this.getStomach() < 7) {
			this.stomach -= this.stomach;
		}
		else {
			this.stomach -= 7;
		}
	}
	
	/**
	 * 음식 주문
	 * @param food 주문한 음식
	 */
	public void orderFood(Food food) { //음식 주문
		if (this.stomach >= 100) { //포만감이 100이상 일 때 주문 불가
			System.out.println("더 이상 음식을 드실 수 없습니다.");
			return;
		}
		//100 미만이면 주문
		System.out.println(food.getFood() + " 주문~~");
		fullness(food);
		if(food.getFood().equals("과일") || food.getFood().equals("채소")) {//주문 메뉴가 과일 혹은 채소일 경우 취기 감소
			frutvegi();
		}

	}
	
	/** 주류 주문
	 * @param drink 주문한 주류
	 */
	public void orderDrink(Drink drink) {
		if (this.getDrunken() > 60) {
			System.out.println("더 이상 주류를 드실 수 없습니다.");
			return;
		}
		if (this.age < 19) { 
			System.out.println("미성년자는 술을 주문할 수 없습니다.");//손님의 나이가 19세 미만일 때 고정적으로 미성년자 주류 구매 불가 안내
			if (this.isWithparent()) { //미성년자의 부모 동반 여부가 확인 되었을때 주류 주문
				System.out.println("부모 동반 확인되었습니다.");
				System.out.println(drink.getDrinks() + " 주문~~");
				drunk(drink);
				if (drink.getDrinks().equals("맥주")) { //주류가 맥주일때는 그냥 넘어감
					return;
				} else { //단, 맥주를 제외한 주류일 경우 
					digest(); // 포만감 감소
				}
			}
		} else { //성인일 때 주류 정상 주문
			System.out.println("부모 동반 확인되었습니다.");
			System.out.println(drink.getDrinks() + "주문~~");
			drunk(drink);
			if (drink.getDrinks().equals("맥주")) {
				return;
			} else {
				digest();
			}
		}
	}
	
	/** 손님의 현재 상태 출력	 */
	public void displayStatus() {
		System.out.println("===손님 상태 확인===");
		System.out.println("현재 포만감: " + this.getStomach());
		System.out.println("현재 취기: " + this.getDrunken());
	}

}
