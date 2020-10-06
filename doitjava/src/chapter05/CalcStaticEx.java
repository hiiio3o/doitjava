package chapter05;

public class CalcStaticEx {

	public static void main(String[] args) {
		double result1 = 10 * 10 * CalcStatic.pi;
		int result2 = CalcStatic.plus(10, 5);
		int result3 = CalcStatic.minus(10, 5);

		CalcStatic calcs = new CalcStatic();

		System.out.println("rusult1: " + result1);
		System.out.println("rusult2: " + result2);
		System.out.println("rusult3: " + result3);
		System.out.println("calcs.pi: " + calcs.pi);

		CalcStatic calc2 = new CalcStatic();

		calcs.num1 = 20;
		calc2.num1 = 200;
		System.out.println(calcs.num1);
		System.out.println(calc2.num1);

		System.out.println(calcs.num2);
		System.out.println(calc2.num2);

		calcs.num2 = 30;
		System.out.println(calcs.num2);

		calc2.num2 = 300;
		System.out.println(calc2.num2);

		System.out.println(calcs.num2);

	}

}
