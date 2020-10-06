package example;

/*
 * 국어 영어 수학 점수를 입력받아서
 * 평균을 출력한 후
 * 100 ~ 91 A등급
 * 90 ~ 81 B등급
 * 80 ~ 71 C등급
 * 나머지는 F등급
 * 
 * 평균 점수와 등급을 출력하세요.
 */

public class Score {

	public static void main(String[] args) {

		int ko, en, ma;
		
		ko = (int)(Math.random()*101);
		System.out.println("국어점수 : " + ko + "점");
		en = (int)(Math.random()*101);
		System.out.println("영어점수 : " + en + "점");
		ma = (int)(Math.random()*101);
		System.out.println("수학점수 : " + ma + "점");
		
		int sum = ko+en+ma;
		
		double avg = sum/3.0;
		
		char grade = 0;
		
//		if(avg>=91) {
//			grade = 'A';
//		} else if(avg>=81) {
//			grade = 'B';
//		} else if(avg>=71) {
//			grade = 'C';
//		} else {
//			grade = 'F';
//		}
		
		switch((int)avg/10) {
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		default:
			grade='F';
		}
		
		System.out.println();
		
		System.out.println("평균점수 " + avg + "점, " + grade + "등급입니다.");
		
	}

}
