/**
 *	����
	���� 4�� 1, 2, 3�� ������ ��Ÿ���� ����� �� 7������ �ִ�. ���� ��Ÿ�� ���� ���� 1�� �̻� ����ؾ� �Ѵ�.

	1+1+1+1
	1+1+2
	1+2+1
	2+1+1
	2+2
	1+3
	3+1
	���� n�� �־����� ��, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� n�� �־�����. n�� ����̸� 11���� �۴�.

	���
	�� �׽�Ʈ ���̽�����, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ����Ѵ�.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int ca = stdIn.nextInt();
		int[] dp = new int[11];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for (int i=4; i<=10; i++)
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		
		for (int k=0; k<ca; k++) {
			int n = stdIn.nextInt();
			System.out.println(dp[n]);
		}
	}

}
