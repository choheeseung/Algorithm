/**
 *	����
	n���� ������ ������ �ִ�. ������ ������ ��Ÿ���� ��ġ�� �ٸ���.
	�� ������ ������ ����ؼ�, �� ��ġ�� ���� k���� �ǵ��� �ϰ� �ʹ�. �� ����� ���� ���Ͻÿ�. ������ ������ �� ���� ����� �� �ִ�.

	����� ������ ������ ������, ������ �ٸ� ���� ���� ����̴�.

	�Է�
	ù° �ٿ� n, k�� �־�����. (1 �� n �� 100, 1 �� k �� 10,000) ���� n���� �ٿ��� ������ ������ ��ġ�� �־�����. ������ ��ġ�� 100,000���� �۰ų� ���� �ڿ����̴�.

	���
	ù° �ٿ� ����� ���� ����Ѵ�. ����� ���� 2^31���� �۴�.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_2293 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		int[] coin = new int[n+1];
		int[] dp = new int[k+2];
		
		dp[0] = 1;
		
		for (int i=1; i<=n; i++)
			coin[i] = stdIn.nextInt();
		
		for (int i=1; i<=n; i++)
			for (int j=1; j<=k; j++)
				if (j-coin[i] >= 0)
					dp[j] += dp[j-coin[i]];
		
		System.out.println(dp[k]);
	}

}
