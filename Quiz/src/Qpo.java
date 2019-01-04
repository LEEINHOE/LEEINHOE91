import java.util.Scanner;

public class Qpo {

	public static void main(String[] args) {
		System.out.println("두개의 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt();
		
		int result1 = num1 / num2;
		int result2 = num1 % num2;
		
		System.out.println(num1+ " 나누기  " + num2 + " 의 몫은 " + result1 + "입니다.");
		System.out.println(num1+ " 나누기  " + num2 + " 의 나머지는 " + result2 + "입니다.");
                        sc.close();
	}

}
