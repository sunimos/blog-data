package me.sunimos.study;

public class Main {

	/**
	 * 응용 프로그램 시작점
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AndOperator ao = new AndOperator();
		OrOperator oo = new OrOperator();
		
		ao.printAndOperatorResult();
		ao.printAndOperatorResult2();
		
		oo.printOrOperatorResult();
		oo.printOrOperatorResult2();
	}
}
