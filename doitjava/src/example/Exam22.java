package example;

import java.util.Random;
import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {

		int user, com;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		com = (int) (Math.random() * 100)+1;
		System.out.println("[���� : "+com+"]");
		System.out.println();
		
		System.out.println("������ ���ڴ� �����ΰ���?");
		
		while (true) {
			System.out.print(">> ");
			user = sc.nextInt();
			System.out.println(++cnt + "ȸ �Է�");
			
			/* ����� */
			if (com>user) {
				System.out.println("High(up)");
			} else if (com<user) {
				System.out.println("Low(down)");
			} else {
				System.out.println("����");
				sc.close();
				break;
			}
			System.out.println();

		}

	}

}
