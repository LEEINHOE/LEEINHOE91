import java.util.Scanner;

public class E0603 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하여라 : ");
		int num = sc.nextInt();
		
		int result = 1;
		
		
		while(num >= 1) {
			
			
			result = result * num;
			num--;}
			
		 System.out.println(result);
		



	}
}