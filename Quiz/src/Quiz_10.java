import java.util.Scanner;

public class Quiz_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하시오\n");
		
		int i =0;
		int num;
		int sum = 0;
		while( i<5) {
		System.out.print("정수 1 : ");
		num = sc.nextInt();
		if(num <1) {
			System.out.println("숫자작음.");
			continue;
		}
		sum = sum + num;
		i++;
		
		
		
		}System.out.println("합: " + sum);
		
		
		
		/*System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		System.out.print("정수 3 : ");
		int num3 = sc.nextInt();
		System.out.print("정수 4 : ");
		int num4 = sc.nextInt();
		System.out.print("정수 5 : ");
		int num5 = sc.nextInt();
		
	
	
	int sum =  num1 + num2 + num3 + num4 + num5;
	while(true) {
		if((num <1)&&(num2<1)&&(num3<1)&&(num4<1)&&(num<1))
			continue;
	}
			System.out.println();*/
		
	
	}

}
