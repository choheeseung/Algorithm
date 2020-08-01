package chap05;
import java.util.Scanner;

public class Q1 {
	static int factorial(int n) {
		if (n>0) {
			int num = 1;
			for (int i=n; i>0; i--) {
				num *= i;
			}
			return num;
		}
		else
			return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}

}