import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		int result = num1*num1;
		
		System.out.printf("정수의 곱은 %d" , result);
		
	}

}
