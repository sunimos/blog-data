package me.sunimos.study;

/**
 * 슈퍼 미니카 클래스
 * @author sunimohs
 * @see AbsMinicar
 */
public class SupMinicar extends AbsMinicar {
	@Override
	public String getMotorName() {
		return "Super Motor";
	}

	@Override
	public int getWheelDrive() {
		return FOUR_WHEEL_DRIVE;
	}

	@Override
	public String getFrame() {
		return "Iron";
	}

	@Override
	protected void printCreators() {
		System.out.println("superman, sunimohs");
	}
}
