/**
 *	����
 	�� �������� �����ؼ� �Ʒ��� �ִ� �� �� �ϳ��� �����Ͽ� �Ʒ������� ������ ��, �������� ���õ� ���� ���� �ִ밡 �Ǵ� ��θ� ���ϴ� ���α׷��� �ۼ��϶�.
 	�Ʒ����� �ִ� ���� ���� ������ ���õ� ���� �밢�� ���� �Ǵ� �밢�� �����ʿ� �ִ� �� �߿����� ������ �� �ִ�.
	�ﰢ���� ũ��� 1 �̻� 500 �����̴�. �ﰢ���� �̷�� �ִ� �� ���� ��� �����̸�, ������ 0 �̻� 9999 �����̴�.

	�Է�
	ù° �ٿ� �ﰢ���� ũ�� n(1 �� n �� 500)�� �־�����, ��° �ٺ��� n+1��° �ٱ��� ���� �ﰢ���� �־�����.

	���
	ù° �ٿ� ���� �ִ밡 �Ǵ� ��ο� �ִ� ���� ���� ����Ѵ�.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_1932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[][] tri = new int[n+1][n+1];
		int[][] res = new int[n+1][n+1];
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				tri[i][j] = stdIn.nextInt();
			}
		}
		
		res[1][1] = tri[1][1];
		
		for (int i=2; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				if (j==1)
					res[i][j] = tri[i][j] + res[i-1][j];
				else
					res[i][j] = tri[i][j] + Math.max(res[i-1][j], res[i-1][j-1]);
			}
		}
		
		int max = Integer.MIN_VALUE;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				if (max < res[i][j])
					max = res[i][j];
			}
		}
		System.out.println(max);
	}

}
