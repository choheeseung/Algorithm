/**
 *	문제
	2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

	입력
	첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

	출력
	첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_11726 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] dp = new int[n+1];
		
		dp[1] = 1;
		if (n >= 2)
			dp[2] = 2;
		
		for (int i=3; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
			dp[i] = dp[i] % 10007;
		}
		
		System.out.println(dp[n]);
	}

}
