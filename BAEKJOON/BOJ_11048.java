/**
 *	����
	�رԴ� N��M ũ���� �̷ο� �����ִ�. �̷δ� 1��1ũ���� ������ �������� �ְ�, �� �濡�� ������ ������ �ִ�.
	�̷��� ���� ���� �� ���� (1, 1)�̰�, ���� ������ �Ʒ� ���� (N, M)�̴�.
	�رԴ� ���� (1, 1)�� �ְ�, (N, M)���� �̵��Ϸ��� �Ѵ�.
	�ر԰� (r, c)�� ������, (r+1, c), (r, c+1), (r+1, c+1)�� �̵��� �� �ְ�, �� ���� �湮�� ������ �濡 �������ִ� ������ ��� ������ �� �ִ�.
	��, �̷� ������ ���� ���� ����.
	�ر԰� (N, M)���� �̵��� ��, ������ �� �ִ� ���� ������ �ִ��� ���Ͻÿ�.

	�Է�
	ù° �ٿ� �̷��� ũ�� N, M�� �־�����. (1 �� N, M �� 1,000)
	��° �ٺ��� N�� �ٿ��� �� M���� ���ڰ� �־�����, r��° ���� c��° ���� (r, c)�� ������ �ִ� ������ �����̴�.
	������ ������ 0���� ũ�ų� ����, 100���� �۰ų� ����.

	���
	ù° �ٿ� �ر԰� (N, M)���� �̵��� ��, ������ �� �ִ� ���� ������ ����Ѵ�.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_11048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		
		int[][] location = new int[N+1][M+1];

		for (int i=1; i<=N; i++) {
			for (int j=1; j<=M; j++) {
				location[i][j] = stdIn.nextInt();
			}
		}
		
		for (int i=1; i<=N; i++) {
			for (int j=1; j<=M; j++) {
				location[i][j] += Math.max(location[i-1][j], Math.max(location[i][j-1], location[i-1][j-1]));
			}
		}
		
		System.out.println(location[N][M]);
	}

}
