package pring_if_else;

public class prac {
	public static void count(int per, int a_cnt, int k_cnt) {
		if(per >= 19) {
			a_cnt++;
		}
		else {
			k_cnt++;
		}
	}
	public static void main(String[] args) {
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		int adultOneWayFlightFare = 300_000;
		int kidOnlyWayFlightFare = 120_000;
		
		int a_cnt = 0;
		int k_cnt = 0;
		count(father, a_cnt, k_cnt);
		count(mother, a_cnt, k_cnt);
		count(daughter, a_cnt, k_cnt);
		
		if((money- (adultOneWayFlightFare*a_cnt)-(kidOnlyWayFlightFare*k_cnt)) > 0) {
			System.out.println("여행가자!");
		}
		else {
			System.out.println("다음에 가자");
		}
		
	}

}
