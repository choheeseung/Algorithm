/**
 *	����
	�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
	�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
	n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� n�� �־�����. n�� 45���� �۰ų� ���� �ڿ����̴�.

	���
	ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_2747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int F1 =0;
		int F2 = 1;
		int F3 = 1;
		
		for (int i=2; i<=n; i++) {
			F3 = F1+F2;
			F1 = F2;
			F2 = F3;
		}
		
		System.out.println(F3);
	}

}
