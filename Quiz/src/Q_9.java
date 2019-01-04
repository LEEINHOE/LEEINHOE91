import java.util.Scanner;

public class Q_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("추출할 구구단을 입력하시오 : ");
		int num = sc.nextInt();
		
		
		for(int j=9; j>0; j--)	{
			System.out.printf( "%d x %d = %d \n", num, j, num*j);
			
			
		}
	}
	
		}


