import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		int num = 0;
		int num2 = 1;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		while(num > 1) {
			num2 = num2 * num;
			num--;
		}

		System.out.println("팩토리얼 함수 결과 : " + num2);
		
		sc.close();
	}

}

