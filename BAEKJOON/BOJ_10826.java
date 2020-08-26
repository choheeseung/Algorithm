/**
 *	����
	�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
	�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
	n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� n�� �־�����. n�� 10,000���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.

	���
	ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
 */
package BAEKJOON;
import java.io.*;
import java.math.BigInteger;

public class BOJ_10826 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger[] dp = new BigInteger[n+3];
		
		dp[0] = BigInteger.ZERO;
		dp[1] = BigInteger.ONE;
		
		for (int i=2; i<=n; i++) {
			dp[i] = dp[i-1].add(dp[i-2]);
		}
		System.out.println(dp[n]);
	}

}
