/**
 *	����
	�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
	�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
	n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� n�� �־�����. n�� 90���� �۰ų� ���� �ڿ����̴�.

	���
	ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_2748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		long[] dp = new long[91];
		
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i=2; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(dp[n]);
	}

}