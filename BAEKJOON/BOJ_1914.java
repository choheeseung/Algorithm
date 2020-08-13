/**
 *	����
	�� ���� ��밡 �ְ� ù ��° ��뿡�� �ݰ��� ���� �ٸ� n���� ������ �׿� �ִ�. �� ������ �ݰ��� ū ������� �׿��ִ�.
	���� �����µ��� ���� ��Ģ�� ���� ù ��° ��뿡�� �� ��° ���� �ű�� �Ѵ�.

	�� ���� �� ���� ���Ǹ��� �ٸ� ž���� �ű� �� �ִ�.
	�׾� ���� ������ �׻� ���� ���� �Ʒ��� �ͺ��� �۾ƾ� �Ѵ�.
	�� �۾��� �����ϴµ� �ʿ��� �̵� ������ ����ϴ� ���α׷��� �ۼ��϶�. ��, �̵� Ƚ���� �ּҰ� �Ǿ�� �Ѵ�.

	�Է�
	ù° �ٿ� ù ��° ��뿡 ���� ������ ���� N (1 �� N �� 100)�� �־�����.

	���
	ù° �ٿ� �ű� Ƚ�� K�� ����Ѵ�.
	N�� 20 ������ �Է¿� ���ؼ��� �� ��° �ٺ��� ���� ������ ����Ѵ�.
	�� ��° �ٺ��� K���� �ٿ� ���� �� ���� A B�� ��ĭ�� ���̿� �ΰ� ����ϴµ�, �̴� A��° ž�� ���� ���� �ִ� ������ B��° ž�� ���� ���� �ű�ٴ� ���̴�.
	N�� 20���� ū ��쿡�� ������ ����� �ʿ䰡 ����.
 */
package BAEKJOON;
import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1914 {
	private static int count = 0;

	static void move(int no, int x, int y, int z) { // no:���ݰ���, x����տ��� y��������� move
		if (no == 1) {
			System.out.println(x + " " + z);
			return;
		}
		
		if (no > 1)
			move(no-1, x, z, y);
		
		System.out.println(x + " " + z);
		
		if (no > 1)
			move(no-1, y, x, z);
		
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		
		BigInteger bi = new BigInteger("2");
        BigInteger c = bi.pow(N).subtract(BigInteger.ONE);
        System.out.println(c);

		if (N <= 20)
			move(N, 1, 2, 3);
	}

}
