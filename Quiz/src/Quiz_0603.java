import java.util.Scanner;

public class Quiz_0603 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		int num =0;
		int result = 1;
		
		System.out.print("팩토리얼 구할값 : ");
		num = sc.nextInt();
		
		System.out.printf("%d! = ", num);
		
	
		while(num>0) {
			if(num>1)
			{
				System.out.print(num+ "*");				
			}
			else
			{
				System.out.print(num+ "=");
			}
				
			result = result*num;
			num--;				} 
		
		
			System.out.println(result);		}	}


