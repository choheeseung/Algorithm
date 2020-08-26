/**
 *	����
	RGB�Ÿ����� ���� N�� �ִ�. �Ÿ��� �������� ��Ÿ�� �� �ְ�, 1�� ������ N�� ���� ������� �ִ�.
	���� ����, �ʷ�, �Ķ� �� �ϳ��� ������ ĥ�ؾ� �Ѵ�.
	������ ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� �־����� ��, �Ʒ� ��Ģ�� �����ϸ鼭 ��� ���� ĥ�ϴ� ����� �ּڰ��� ���غ���.
	
	1�� ���� ���� 2�� ���� ���� ���� �ʾƾ� �Ѵ�.
	N�� ���� ���� N-1�� ���� ���� ���� �ʾƾ� �Ѵ�.
	i(2 �� i �� N-1)�� ���� ���� i-1��, i+1�� ���� ���� ���� �ʾƾ� �Ѵ�.
	
	�Է�
	ù° �ٿ� ���� �� N(2 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� �� ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� 1�� ������ �� �ٿ� �ϳ��� �־�����. ���� ĥ�ϴ� ����� 1,000���� �۰ų� ���� �ڿ����̴�.

	���
	ù° �ٿ� ��� ���� ĥ�ϴ� ����� �ּڰ��� ����Ѵ�.
 */
package BAEKJOON;
import java.io.*;
import java.util.*;

public class BOJ_1149 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		int[][] RGB = new int[N][3];
		int[][] dp = new int[N][3];
		
		for (int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j=0; j<3; j++) {
				RGB[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = RGB[i][j];
			}
		}
		for (int i=1; i<N; i++) {
			for (int j=0; j<3; j++) {
				dp[i][0] = Math.min(dp[i-1][1] + RGB[i][0], dp[i-1][2] + RGB[i][0]);
				dp[i][1] = Math.min(dp[i-1][0] + RGB[i][1], dp[i-1][2] + RGB[i][1]);
				dp[i][2] = Math.min(dp[i-1][0] + RGB[i][2], dp[i-1][1] + RGB[i][2]);
			}
		}
		int answer = Integer.MAX_VALUE;
		for (int i=0; i<3; i++)
			if (dp[N-1][i] < answer)
				answer = dp[N-1][i];
		System.out.println(answer);
	}

}
