package lottery;

import java.util.ArrayList;
import java.util.List;

public class Lottery {
	public static void main(String[] args) {
		List<Integer> lotto = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			if (lotto.contains(num)) {
				i--;
			} else {
				lotto.add(num);
			}
		}
		System.out.println(lotto);
	}
}
