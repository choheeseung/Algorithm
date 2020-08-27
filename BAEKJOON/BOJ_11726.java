/**
 *	����
	2��n ũ���� ���簢���� 1��2, 2��1 Ÿ�Ϸ� ä��� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� n�� �־�����. (1 �� n �� 1,000)

	���
	ù° �ٿ� 2��n ũ���� ���簢���� ä��� ����� ���� 10,007�� ���� �������� ����Ѵ�.
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
