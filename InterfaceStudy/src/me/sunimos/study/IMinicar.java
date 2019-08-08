package me.sunimos.study;

/**
 * 미니카의 뼈대가 되는 인터페이스
 * @author sunimohs
 */
public interface IMinicar {
	public final int TWO_WHEEL_DRIVE = 2;
	public final int FOUR_WHEEL_DRIVE = 4;
	
	/**
	 * 미니카의 모터 이름 반환 메소드
	 * @return 모터 이름 
	 */
	public String getMotorName();
	/**
	 * 미니카가 2륜인지 4륜인지 반환하는 메소드
	 * @return 2륜 : 2, 4륜 : 4
	 */
	int getWheelDrive();
	/**
	 * 미니카의 차체가 어떤 종류인지 반환하는 메소드
	 * @return 미니카 차체 종류
	 */
	String getFrame();
	
	/**
	 * 미니카 움직이기 시작
	 */
	void run();
	/**
	 * 미니카 멈추기
	 */
	void stop();
}
