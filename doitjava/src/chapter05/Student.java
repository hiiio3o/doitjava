package chapter05;

public class Student {
	/* �ʵ� - ��� ���� */
	int studentID;
	String studentName;
	int grade;
	String address;

	/* ������ - ��ü�� ������ �� �����ϴ� ��� */
	Student(int num1, long num2) {	//�Ű������� ���� ������
		System.out.println("Student ��ü�� �����մϴ�.");
	} //����Ʈ �����ڴ� �Ű������� ���� ���� �ڵ尡 ���� ������
	Student(int num3, int num4) {
		System.out.println("Student ��ü�� �����մϴ�.");
	}
	Student(long num5, int num6) {
		System.out.println("Student ��ü�� �����մϴ�.");
	}
//	Student() {}	//����Ʈ ������: �����ڸ� ������� ������ �ڵ����� ����
	Student(long num) {
		System.out.println("Student ��ü�� �����մϴ�. " + num);
	}
	Student() {
		System.out.println("����Ʈ �����ڷ� Student ��ü�� �����մϴ�.");
	}

	/* �޼ҵ�(�޼���) - ��� �Լ� */
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
}
