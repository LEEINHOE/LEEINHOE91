import java.util.Scanner;

public class Quiz_0601 {

	public static void main(String[] args) {
		System.out.println("두개의 정수 차의 절댓값을 구하시오.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : " );
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		
		int num2 = sc.nextInt();
		
		int diff;
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("절댓값 : " + diff);
		
		// int diff = num1 -num2;
		// if(diff <0)
		// diff = diff * -1
		
		}
		

	}

