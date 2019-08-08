package me.sunimos.study;

/**
 * 일반 미니카 클래스
 * @author sunimohs
 * @see AbsMinicar
 */
public class NorMinicar extends AbsMinicar {
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
	protected void printCreators() {
		System.out.println("normal person, sunimohs");
	}
}
