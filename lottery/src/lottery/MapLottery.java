package lottery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapLottery {
	public static List<Integer> lottery() {
		List<Integer> lotto = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			if (lotto.contains(num)) {
				i--;
			} else {
				lotto.add(num);
			}
		}
		return lotto;
	}

	public static void playing(Map<Integer, List<Integer>> lotteryMap, int round) {
		List<Integer> lotto = lottery();

		lotteryMap.put(round, lotto);

		System.out.println(round + "회차 ==> " + lotteryMap.get(round));
	}

	public static void printLottery(Map<Integer, List<Integer>> lotteryMap) {
		System.out.println();
		for (int r : lotteryMap.keySet()) {
			System.out.println(r + "회차 ==> " + lotteryMap.get(r));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, List<Integer>> lotteryMap = new HashMap<>();

		int round = 1;

		List<Integer> lotto = lottery();
		playing(lotteryMap, round);

		while (true) {
			System.out.println();
			System.out.println("1.다음 회차 진행");
			System.out.println("2.회차별 결과 출력");
			System.out.println("3. 종료");
			System.out.print("번호를 입력하세요. => ");
			int menu = sc.nextInt();

			if (menu == 1) {
				round += 1;
				System.out.println();
				playing(lotteryMap, round);
			} else if (menu == 2) {
				printLottery(lotteryMap);
			} else if (menu == 3) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("1~3까지의 번호를 입력헤주세요.");
			}
		}

	}
}
