package lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		String str = lotto.stream() //Stream<Integer>
							.map(String::valueOf)//Stream<String>
							.collect(Collectors.joining(", ")); //String
		
		System.out.println(str);
	}
}
