/**
 *	문제
	피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
	이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
	n=17일때 까지 피보나치 수를 써보면 다음과 같다.
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

	입력
	첫째 줄에 n이 주어진다. n은 1,000,000,000,000,000,000보다 작거나 같은 자연수이다.

	출력
	첫째 줄에 n번째 피보나치 수를 1,000,000으로 나눈 나머지를 출력한다.
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
