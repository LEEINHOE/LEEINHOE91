import java.util.Scanner;

public class Quiz_0604 {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 1개를 입력하시오.");
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();
			int result = 1;
			
			while(num > 0) {
				result = result * num;
				System.out.print(num);			
				num--;
				if(num == 0)
					break;
				System.out.print(" * ");
			}
			System.out.print(" = " + result);
		}
	}
