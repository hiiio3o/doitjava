package example;

import java.util.Scanner;

public class Exam24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요: ");
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
		
		System.out.println("입력한 숫자의 소수의 개수는 " + cnt + "개입니다.");
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
//		System.out.println("1부터 " + n + "사이의 소수의 개수는 " + cnt2 + "개입니다.");
		
		
//		Scanner sc = new Scanner(System.in);
//		int n, i;
//		int cnt = 0;
//		int cnt2 = 0;
//
//		System.out.println("n값을 입력하세요");
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
//		System.out.println("1과 " + n + "사이에 있는 소수의 개수는 " + cnt2 + "개입니다.");
		
		
		
	}

}
