/**
 *	문제
	자연수 N과 정수 K가 주어졌을 때 이항 계수 (N,K)를 10,007로 나눈 나머지를 구하는 프로그램을 작성하시오.

	입력
	첫째 줄에 과 가 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ K ≤ N)

	출력
 	(N,K)를 10,007로 나눈 나머지를 출력한다.
 */
package BAEKJOON;
import java.util.Scanner;

public class BOJ_11051 {
	
	public static int dp[][] = new int[1001][1001];
	
	static int bin(int n, int k) {
		if(k == 0 || k == n)
			return 1;
		if(dp[n][k] > 0)
			return dp[n][k];
		dp[n][k] = bin(n-1, k-1) + bin(n-1, k);
		
		return dp[n][k] % 10007;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		
		int result = bin(N, K);
		
		System.out.println(result);
	}

}
