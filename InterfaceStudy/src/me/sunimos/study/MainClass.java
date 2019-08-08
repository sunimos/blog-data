package me.sunimos.study;

public class MainClass {
	public static void main(String[] args) {
		// 일반 미니카 생성하여 인터페이스에 할당
		IMinicar minicar = MinicarFactory.createMinicar(NorMinicar.class);
		
		// 시작
		minicar.run();
		// 이미 시작됨
		minicar.run();
		
		// 종료
		minicar.stop();
		// 이미 종료됨
		minicar.stop();
		
		// 슈퍼 미니카 생성하여 인터페이스에 할당
		minicar = MinicarFactory.createMinicar(SupMinicar.class);

		// 시작 내용이 슈퍼카인지 확인
		minicar.run();
		// 이미 시작됨
		minicar.run();
		
		// 종료
		minicar.stop();
		// 이미 종료됨
		minicar.stop();
	}
}
