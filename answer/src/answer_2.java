import java.util.Scanner;

public class answer_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int nInput; //입력받은수
		int nsum = 0;  // 합
		while(true) {
			System.out.print("숫자입력 : ");
			nInput =sc.nextInt();
			
			if( nInput == 0) {
				
				nsum = nsum + nInput;
			
				
				
			}
			System.out.println("총합 : " + nsum);
			
		}
		
	}
	
	/* ninput = -1;
	 * 
	 * whit( nInput !=0) 
	 */

}
