package example;

/*
 * ���� ���� ���� ������ �Է¹޾Ƽ�
 * ����� ����� ��
 * 100 ~ 91 A���
 * 90 ~ 81 B���
 * 80 ~ 71 C���
 * �������� F���
 * 
 * ��� ������ ����� ����ϼ���.
 */

public class Score {

	public static void main(String[] args) {

		int ko, en, ma;
		
		ko = (int)(Math.random()*101);
		System.out.println("�������� : " + ko + "��");
		en = (int)(Math.random()*101);
		System.out.println("�������� : " + en + "��");
		ma = (int)(Math.random()*101);
		System.out.println("�������� : " + ma + "��");
		
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
		
		System.out.println("������� " + avg + "��, " + grade + "����Դϴ�.");
		
	}

}
