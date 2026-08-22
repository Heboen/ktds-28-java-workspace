package lottery;

public class ArrLottery {
	public static void main(String[] args) {
		int[] lottery = new int[6];
		
		for(int i = 0; i < lottery.length; i++) {
			lottery[i] = (int)(Math.random()*45 + 1);
			for(int j = 0; j < i; j++) {
				if(lottery[j] == lottery[i]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < lottery.length; i++) {
			System.out.println(lottery[i]);
		}
		
	}
}
