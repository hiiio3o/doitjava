package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��� �ּ���: ");
		int num = sc.nextInt();
		
		System.out.println(num%2==0 ? "¦��1" : "Ȧ��1");

		if(num%2==0) {
			System.out.println("¦��2");
		} else {
			System.out.println("Ȧ��2");
		}
		
		if(num%2==0) System.out.println("¦��3");
		else System.out.println("Ȧ��3");
		
		String str="";
		if(num%2==0) {
			str = "¦��";
		} else {
			str = "Ȧ��";
		}
		System.out.println(str);
		
		sc.close();
	}

}
