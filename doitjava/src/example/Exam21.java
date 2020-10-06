package example;

import java.util.Random;
import java.util.Scanner;

public class Exam21 {

	public static void main(String[] args) {
		final int GA = 0;
		final int BA = 1;
		final int BO = 2;

		int user, com;
		int score = 0;
		int life = 3;
		Scanner sc = new Scanner(System.in);

		System.out.println("가위바위보 게임을 시작합니다.");
		while (true) {
			System.out.print("0: 가위, 1: 바위, 2: 보 >> ");
			user = sc.nextInt();
			com = (int) (Math.random() * 3);

			System.out.println("유저 : " + (user == 0 ? "가위" : (user == 1 ? "바위" : "보")));
			System.out.println("컴퓨터 : " + (com == 0 ? "가위" : (com == 1 ? "바위" : "보")));

			/* 결과값 */
			if ((com == GA && user == BA) || (com == BA && user == BO) || (com == BO && user == GA)) {
				System.out.println("유저 승");
				score += 100;
			} else if (com == user) {
				System.out.println("무승부");
			} else {
				System.out.println("컴퓨터 승");
				life--;
			}
			System.out.println();

			/* 현재 점수와 남은 목숨 출력 */
			System.out.println("현재 " + score + "점, 남은 목숨 " + life + "개 입니다.");

			/* 목숨이 0이 되면 게임을 종료 */
			if(life==0) {
				System.out.println();
				System.out.println("게임을 종료합니다.");
				break;
			}
		}

	}

}
