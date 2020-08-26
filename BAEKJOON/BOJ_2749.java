/**
 *	����
	�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
	�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
	n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� n�� �־�����. n�� 1,000,000,000,000,000,000���� �۰ų� ���� �ڿ����̴�.

	���
	ù° �ٿ� n��° �Ǻ���ġ ���� 1,000,000���� ���� �������� ����Ѵ�.
 */
package BAEKJOON;
import java.io.*;

public class BOJ_2749 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		int mod = 1000000;
		int period = pisano_period(mod);
		long[] dp = new long[period+1];
		
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i=2; i<period; i++) {
			dp[i] = dp[i-1] + dp[i-2];
			dp[i] %= mod;
		}
		System.out.println(dp[(int)(n % period)]);
	}
	
	public static int pisano_period(int m) {
		int period = 0;
		int n1 = 1;
		int n2 = 1;
		do {
			int temp = n1;
			n1 = n2;
			n2 = (temp + n2) % m;
			period++;
		} while (!(n1==1 && n2==1));
		return period;
	}

}
