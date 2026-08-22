package lottery;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrLottery {
	public static void main(String[] args) {
		int[] lottery = new int[6];

		for (int i = 0; i < lottery.length; i++) {
			lottery[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (lottery[j] == lottery[i]) {
					i--;
					break;
				}
			}
		}

		String str = Arrays.stream(lottery) // Stream<Integer>
							.mapToObj(String::valueOf)//Stream<String>
							.collect(Collectors.joining(", ")); // String
		
		System.out.println(str);
	}
}
