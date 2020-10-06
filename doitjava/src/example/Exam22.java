package example;

import java.util.Random;
import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {

		int user, com;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		com = (int) (Math.random() * 100)+1;
		System.out.println("[정답 : "+com+"]");
		System.out.println();
		
		System.out.println("생성된 숫자는 무엇인가요?");
		
		while (true) {
			System.out.print(">> ");
			user = sc.nextInt();
			System.out.println(++cnt + "회 입력");
			
			/* 결과값 */
			if (com>user) {
				System.out.println("High(up)");
			} else if (com<user) {
				System.out.println("Low(down)");
			} else {
				System.out.println("정답");
				sc.close();
				break;
			}
			System.out.println();

		}

	}

}
