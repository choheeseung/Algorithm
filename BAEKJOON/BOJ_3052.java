/**
 *	문제
	두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
	수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

	출력
	첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 */

package BAEKJOON;
import java.util.Scanner;
import java.util.ArrayList;

public class BOJ_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> ArrayList = new ArrayList<>();
		
		int[] A = new int[10];
		int[] B = new int[10];
		
		for (int i=0; i<10; i++) {
			System.out.print(i+1 + "번째 수 : ");
			A[i] = stdIn.nextInt();
			
			if (A[i] < 0 || A[i] > 1000) {
				System.out.println("범위를 초과하였습니다. 다시 입력하세요 : ");
				A[i] = stdIn.nextInt();
			}
			B[i] = A[i] % 42;
			
			if (!(ArrayList.contains(B[i])))
				ArrayList.add(B[i]);
		}
		System.out.println("서로 다른 나머지의 개수는 : " + ArrayList.size() + "개 입니다.");
	}
}
