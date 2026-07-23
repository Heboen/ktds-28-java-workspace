package com.ktdsuniversity.edu.oop.exam.statics;
/**
 * 사칙 연산기
 * */
public class MathCalculator {
	
	/**계산하려는 첫번째 정수*/
	private int firstnum;
	/**계산하려는 두번째 정수*/
	private int secondnum;
	
	public MathCalculator(int firstnum, int secondnum) {
		this.firstnum = firstnum;
		this.secondnum = secondnum;
	}
	
	/**
	 * 숫자 2개를 연산하여 반환한다.
	 * @param operator 연산 종류 (0: 더하기, 1: 빼기, 2:곱하기, 3: 나누기, 4: 나머지)
	 * @see com.ktdsuniversity.deu.oop.exam.statics.Operators
	 * @return operator의 값에 따른 결과를 반환
	 */
	public int getComputeResult(int operator) {
		if(operator == Operators.ADD) {
			return this.firstnum+this.secondnum;
		}
		else if(operator == Operators.SUB) {
			return this.firstnum-this.secondnum;
		}
		else if(operator == Operators.MUL) {
			return this.firstnum*this.secondnum;
		}
		else if(operator == Operators.DIV) {
			return this.firstnum/this.secondnum;
		}
		else if(operator == Operators.MOD) {
			return this.firstnum%this.secondnum;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		MathCalculator math = new MathCalculator(10, 2);
//		System.out.println(math.getComputeResult(0));
//		System.out.println(math.getComputeResult(1));
//		System.out.println(math.getComputeResult(2));
//		System.out.println(math.getComputeResult(3));
//		System.out.println(math.getComputeResult(4));
		System.out.println(math.getComputeResult(Operators.ADD));
		System.out.println(math.getComputeResult(Operators.SUB));
		System.out.println(math.getComputeResult(Operators.MUL));
		System.out.println(math.getComputeResult(Operators.DIV));
		System.out.println(math.getComputeResult(Operators.MOD));
	}
}
