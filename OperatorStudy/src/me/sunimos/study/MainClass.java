package me.sunimos.study;

public class MainClass {
	
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		
		mc.printPlus();
		mc.printMinus();
		mc.printMultiply();
		mc.printDivide();
		mc.printObjectString();
	}

	private void printPlus() {
		// 문자열과 정수형이 +로 만나면 문자열로 자동 형변환된다. 나머지 연산자는 불가능.
		System.out.println("10 + 5 : " + 10 + 5);
	}
	
	private void printMinus() {
		// 문자열과 정수형이 -로 만나면 형변환이 되지 않아 오류가 발생한다. 주석해제하여 확인.
//		System.out.println("" - 5);
		System.out.println("10 - 5 : " + (10 - 5));
	}
	
	private void printMultiply() {
		// 문자열과 정수형이 *로 만나면 형변환이 되지 않아 오류가 발생한다. 주석해제하여 확인.
//		System.out.println("" * 5);
		System.out.println("10 * 5 : " + 10 * 5);
	}
	
	private void printDivide() {
		// 문자열과 정수형이 /로 만나면 형변환이 되지 않아 오류가 발생한다. 주석해제하여 확인.
//		System.out.println("" / 5);
		int intA = 9;
		int intB = 2;
		double doubleA = 9;
		double doubleB = 2;
		
		// int형은 소수점을 포함하지 않기 때문에 소수점 아래 자리는 버리게 됨.
		System.out.println("int형 9 / 2 : " + intA / intB);
		// double형은 소수점을 포함하고 있기 때문에 소수점까지 표시됨.
		System.out.println("int형 9 / 2 : " + doubleA / doubleB);
		
		// int형에서 나머지를 구하기 위해선 % 연산자를 이용해야함.
		System.out.println("int형 9 / 2의 나머지 : " + intA % intB);
	}
	
	private void printObjectString() {
		ToStringOverride obj = new ToStringOverride();
		
		System.out.println("객체 출력 : " + obj);
	}
}
