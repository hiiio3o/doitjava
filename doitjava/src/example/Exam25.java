package example;

public class Exam25 {

	public static void main(String[] args) {
		for(int i=5; i>0; i--) {
			for(int j=1; j<=i; j++)	{
				if(i==j) {
					System.out.print(i);
				} else {
				System.out.print("@");
				}
			}
			System.out.println();
		}

	}

}
