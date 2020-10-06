package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¼ýÀÚ¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä: ");
		int num = sc.nextInt();
		
		System.out.println(num%2==0 ? "Â¦¼ö1" : "È¦¼ö1");

		if(num%2==0) {
			System.out.println("Â¦¼ö2");
		} else {
			System.out.println("È¦¼ö2");
		}
		
		if(num%2==0) System.out.println("Â¦¼ö3");
		else System.out.println("È¦¼ö3");
		
		String str="";
		if(num%2==0) {
			str = "Â¦¼ö";
		} else {
			str = "È¦¼ö";
		}
		System.out.println(str);
		
		sc.close();
	}

}
