package AngAppPk;

import java.util.Scanner;

import AngSet.AngPoint;

public class AngApp {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println();
			System.out.println("===================================================");
			System.out.println("★★★★★★★★★★★ ANGRY했던 순간이 ANG으로 ★★★★★★★★★★★");
			System.out.println("===================================================");
			System.out.println();
			System.out.println("1.분노적립 | 2.캐릭터보기 | 3.갤러리 | 4.ANG+GAME | 5.종료");
			System.out.println("메뉴 선택 >>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				AngPoint();
			} else if (selectNo == 2) {

			} else if (selectNo == 3) {

			} else if (selectNo == 4) {

			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료.");
		System.out.println();

	}

	private static void AngPoint() {

		System.out.println("===================================================");
		System.out.println("당신의 현재 분노 상태는?");
		System.out.println("1.소노 小怒 | 2.중노 中怒 | 3.대노 大怒 | 4.극대노 極大怒 | 5.돌아가기");
		System.out.println("분노지수 선택 >>");

		int selectNo = scanner.nextInt();
		// point
		if (selectNo == 1) {
			System.out.println("小怒 18점 Point가 적립 됐습니다.");
		} else if (selectNo == 2) {
			System.out.println("中怒 1818 Point가 적립 됐습니다.");
		} else if (selectNo == 3) {
			System.out.println("大怒 181818 Point가 적립 됐습니다.");
		} else if (selectNo == 4) {
			System.out.println("極大怒 18181818 Point가 적립 됐습니다.");
		} else if (selectNo == 5) {
			System.out.println("메뉴로 돌아가기");
		}

	}

}
