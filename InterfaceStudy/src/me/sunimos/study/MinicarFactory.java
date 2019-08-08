package me.sunimos.study;

/**
 * 미니카를 생성하는 부분을 담당하는 팩토리 클래스
 * @author sunimohs
 */
public final class MinicarFactory {
	/**
	 * 생성자를 막아놓아 직접 생성하지 못하게 합니다.
	 */
	private MinicarFactory() {
		
	}

	/**
	 * 입력받은 클래스의 미니카 객체를 생성해주는 메소드
	 * @param cls 미니카의 인터페이스를 구현한 클래스
	 * @return 클래스의 인스턴스
	 */
	public static final IMinicar createMinicar(Class<? extends IMinicar> cls) {
		IMinicar minicar = null;
		
		try {
			minicar = cls.newInstance();
		} catch(IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
		return minicar;
	}
}
