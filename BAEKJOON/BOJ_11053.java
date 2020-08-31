/**
 *	문제
	수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
	예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 
	A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.

	입력
	첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
	둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

	출력
	첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] dp = new int[N+1];
		int[] cost = new int[N+1];
		
		for (int i=1; i<=N; i++)
			cost[i] = stdIn.nextInt();
		
		dp[1] = 1;
		
		for (int i=2; i<=N; i++) {
			dp[i] = 1;
			for (int j=1; j<i; j++) {
				if (cost[i] > cost[j])
					dp[i] = Math.max(dp[j]+1, dp[i]);
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for (int j=1; j<=N; j++)
			if (dp[j] > max)
				max = dp[j];
		
		System.out.println(max);
	}

}
