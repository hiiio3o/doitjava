package example;

import java.util.Scanner;

public class Exam24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��� �ּ���: ");
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i=2; i<=n; i++) {
			cnt++;
			for(int j=2; j<=i/2; j++) {
				if(i % j ==0) {
					cnt--;
					break;
				}
			}
		}
		
		System.out.println("�Է��� ������ �Ҽ��� ������ " + cnt + "���Դϴ�.");
		sc.close();
		
		
//		int cnt=0;
//		int cnt2=0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("n >> ");
//		int n = sc.nextInt();
//		
//		for(int i=2; i<=n; i++) {
//			cnt=0;
//			for(int j=2; j<=(i/2); j++) {
//				if(i%j==0) {
//					cnt++;
//				}
//			} if(cnt==0) {
//				cnt2++;
//			}
//		}
//		System.out.println("1���� " + n + "������ �Ҽ��� ������ " + cnt2 + "���Դϴ�.");
		
		
//		Scanner sc = new Scanner(System.in);
//		int n, i;
//		int cnt = 0;
//		int cnt2 = 0;
//
//		System.out.println("n���� �Է��ϼ���");
//		System.out.print(">> ");
//		n = sc.nextInt();
//
//		for (i = 1; i <= n; i++) {
//			cnt = 0;
//			for (int j = 1; j <= i; j++) {
//				if (i % j == 0) {
//					cnt++;
//				}
//				if (cnt > 2) {
//					break;
//				}
//			}
//			if (cnt == 2) {
//				cnt2++;
//			}
//		}
//		System.out.println("1�� " + n + "���̿� �ִ� �Ҽ��� ������ " + cnt2 + "���Դϴ�.");
		
		
		
	}

}
