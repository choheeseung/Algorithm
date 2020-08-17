/**
 *	����
	�ڿ��� N�� ���� K�� �־����� �� ���� ��� (N,K)�� 10,007�� ���� �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� �� �� �־�����. (1 �� N �� 1,000, 0 �� K �� N)

	���
 	(N,K)�� 10,007�� ���� �������� ����Ѵ�.
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
