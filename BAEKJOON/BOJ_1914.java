/**
 *	문제
	세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로 쌓여있다.
	이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.

	한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
	쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
	이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.

	입력
	첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 100)이 주어진다.

	출력
	첫째 줄에 옮긴 횟수 K를 출력한다.
	N이 20 이하인 입력에 대해서는 두 번째 줄부터 수행 과정을 출력한다.
	두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데, 이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
	N이 20보다 큰 경우에는 과정은 출력할 필요가 없다.
 */
package BAEKJOON;
import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1914 {
	private static int count = 0;

	static void move(int no, int x, int y, int z) { // no:원반개수, x번기둥에서 y번기둥으로 move
		if (no == 1) {
			System.out.println(x + " " + z);
			return;
		}
		
		if (no > 1)
			move(no-1, x, z, y);
		
		System.out.println(x + " " + z);
		
		if (no > 1)
			move(no-1, y, x, z);
		
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		
		BigInteger bi = new BigInteger("2");
        BigInteger c = bi.pow(N).subtract(BigInteger.ONE);
        System.out.println(c);

		if (N <= 20)
			move(N, 1, 2, 3);
	}

}
