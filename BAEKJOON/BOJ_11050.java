/**
 *	����
	�ڿ��� N�� ���� K�� �־����� �� ���� ��� (N,K)�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� �� �� �־�����. (1 �� N �� 10, 0 �� K �� N)

	���
 	(N,K)�� ����Ѵ�.
 */
package BAEKJOON;
import java.util.Scanner;

public class BOJ_11050 {
	static int bin(int n, int k) {
		if(k == 0 || k == n)
			return 1;
		else
			return bin(n-1, k-1) + bin(n-1, k);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		
		int result = bin(N, K);
		
		System.out.println(result);
	}

}
