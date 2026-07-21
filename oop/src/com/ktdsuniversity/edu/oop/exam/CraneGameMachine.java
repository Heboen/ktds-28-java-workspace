package com.ktdsuniversity.edu.oop.exam;

public class CraneGameMachine {
	boolean isInsertCoin = false;
	int dolls;
	
	public void insertCoin() {
		if(dolls <= 0) {
			return;
		}
		isInsertCoin = !isInsertCoin;
		doGame();
		
	}	
	/*
	 * public void insertCoin(){
	 * 	isInsertCoin = dolls > 0;
	 * }
	 * 위 조건식이 true면 값은 true로, false라면 false로 할당됨
	 */
	public int doGame() {
		if(isInsertCoin) {
			int getdoll = (int) (Math.random() * 2);
		
			/*
			 * dolls-=getdoll;
			 * isInsertCoin = !isInsertCoin;
			 * System.out.println(getdoll);
			 */
			if(getdoll == 1) {
				dolls -= 1;
				isInsertCoin = !isInsertCoin;
				System.out.println(getdoll);
				return getdoll;
			}
			else {
				isInsertCoin = !isInsertCoin;
				System.out.println(getdoll);
				return 0;
			}
		}
		System.out.println("동전을 넣어주세요.");
		return 0;
	}
	
	public static void main(String[] args) {
		CraneGameMachine CGM = new CraneGameMachine();
		
		CGM.dolls = 9;
		
		CGM.insertCoin();
		CGM.doGame();
	}

}
