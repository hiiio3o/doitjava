package example;

import java.util.Scanner;

public class Exam23 {

	public static void main(String[] args) {
		//���� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		//switch case ������ ����ؾ� �մϴ�.
		
		Scanner sc = new Scanner(System.in);
		int thisMon;
		
		System.out.println("�� ���� ������ ���ڸ� ����ұ��?");
		
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
			System.out.println(thisMon + "���� ������ ���ڴ� 31���Դϴ�.");
			break;
		case 2:
			System.out.println(thisMon + "���� ������ ���ڴ� 28���Դϴ�.");
			break;
		default:
			System.out.println(thisMon + "���� ������ ���ڴ� 30���Դϴ�.");
		}
		sc.close();
	}

}
