package me.sunimos.study;

/**
 * {@link IMinicar}의 일부 공통 메소드를 구현한 추상 클래스.
 * 
 * @author sunimohs
 */
public abstract class AbsMinicar implements IMinicar {
	private boolean isRunning = false;
	
	/**
	 * 만든이 표시 하는 추상 메소드
	 */
	protected abstract void printCreators();
	
	@Override
	public void run() {
		if (isRunning) {
			System.out.println("이미 움직이고 있습니다.");
		} else {
			System.out.println("모터 : " + getMotorName() + " / " + getWheelDrive() + "륜 구동 / 차체 : " + getFrame() + "의 미니카를 동작합니다.");
			System.out.print("만든이 : ");
			printCreators();
			isRunning = true;
		}
	}

	@Override
	public void stop() {
		if (isRunning) {
			System.out.println("동작을 종료합니다.");
			isRunning = false;
		} else {
			System.out.println("이미 멈춰있는 상태입니다.");
		}
	}
}
