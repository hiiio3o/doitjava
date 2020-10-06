package example;

import java.util.Scanner;

public class Exam23 {

	public static void main(String[] args) {
		//달의 마지막 일자를 출력하는 프로그램을 작성하세요.
		//switch case 구문을 사용해야 합니다.
		
		Scanner sc = new Scanner(System.in);
		int thisMon;
		
		System.out.println("몇 월의 마지막 일자를 출력할까요?");
		
		System.out.print(">> ");
		thisMon = sc.nextInt();
		
		switch(thisMon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(thisMon + "월의 마지막 일자는 31일입니다.");
			break;
		case 2:
			System.out.println(thisMon + "월의 마지막 일자는 28일입니다.");
			break;
		default:
			System.out.println(thisMon + "월의 마지막 일자는 30일입니다.");
		}
		sc.close();
	}

}
