/**
 *	����
	���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	���� ���, ���� A = {10, 20, 10, 30, 20, 50} �� ��쿡 ���� �� �����ϴ� �κ� ������ 
	A = {10, 20, 10, 30, 20, 50} �̰�, ���̴� 4�̴�.

	�Է�
	ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.
	��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)

	���
	ù° �ٿ� ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ����Ѵ�.
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
