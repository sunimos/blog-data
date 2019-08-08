package me.sunimos.study;

/**
 * 일반 미니카 클래스
 * @author sunimohs
 * @see IMinicar
 */
public class NorMinicar implements IMinicar {
	private boolean isRunning = false;

	@Override
	public String getMotorName() {
		return "Basic Motor";
	}

	@Override
	public int getWheelDrive() {
		return TWO_WHEEL_DRIVE;
	}

	@Override
	public String getFrame() {
		return "Plastics";
	}

	@Override
	public void run() {
		if (isRunning) {
			System.out.println("이미 움직이고 있습니다.");
		} else {
			System.out.println("모터 : " + getMotorName() + " / " + getWheelDrive() + "륜 / 차체 : " + getFrame() + "의 미니카를 동작합니다.");
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
