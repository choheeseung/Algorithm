/**
 *	����
	������ �׸��� ���� �ﰢ���� ���� ������� ������ �ִ�. ù �ﰢ���� ���ﰢ������ ���� ���̴� 1�̴�.
	�� �������� ������ ���� �������� ���ﰢ���� ��� �߰��Ѵ�.
	�������� ���� �� ���� ���̸� k�� ���� ��, �� ���� ���̰� k�� ���ﰢ���� �߰��Ѵ�.
	�ĵ��� ���� P(N)�� ������ �ִ� ���ﰢ���� ���� �����̴�. P(1)���� P(10)���� ù 10�� ���ڴ� 1, 1, 1, 2, 2, 3, 4, 5, 7, 9�̴�.
	N�� �־����� ��, P(N)�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, N�� �־�����. (1 �� N �� 100)

	���
	�� �׽�Ʈ ���̽����� P(N)�� ����Ѵ�.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_9461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn= new Scanner(System.in);
		
		long[] tri = new long[101];
		int N = 0;
		
		tri[1] = tri[2] = tri[3] = 1;
		tri[4] = tri[5] = 2;
		
		for (int j=6; j<=100; j++)
			tri[j] = tri[j-1] + tri[j-5];
		
		int test = stdIn.nextInt();
		
		for (int i=0; i<test; i++) {
			N = stdIn.nextInt();
			System.out.println(tri[N]);
		}
	}

}
