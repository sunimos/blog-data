package me.sunimos.study;

import java.util.Calendar;
import java.util.Locale;

public class IfStudy {
	public void printIfStudy() {
		// Calendar를 통해 현재 시각을 구한다.
		Calendar c = Calendar.getInstance(Locale.KOREA);

		int hourOfDay = c.get(Calendar.HOUR_OF_DAY);

		// 현재 시간이 12시일 경우
		if (hourOfDay == 12) {
			// 점심먹으러 가자
			goForLunch();
		} else if (hourOfDay == 19) { // 현재 시간이 오후 7시일 경우
			goForDiner();
		} else { // 위의 조건에 포함되지 않는 경우
			getSomeRest();
		}
	}

	// 점심 먹자 표시
	private void goForLunch() {
		System.out.println("점심 먹자");
	}

	// 저녁 먹자 표시
	private void goForDiner() {
		System.out.println("저녁 먹자");
	}

	// 쉬자 표시
	private void getSomeRest() {
		System.out.println("쉬자");
	}
}
