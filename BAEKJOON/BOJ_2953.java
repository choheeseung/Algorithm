/**
 * ����
	"���� �丮���"�� �ټ� �����ڵ��� ������ �丮 �Ƿ��� �˳��� Ƽ�� �����̴�.
	�� �����ڴ� �ڽ��ִ� ������ �ϳ��� ��������, ���� �ٸ� ����� ������ ������ �����ش�. ������ 1������ 5������ �ִ�.
	�� �����ڰ� ���� ������ �ٸ� ����� ���� �� ������ ���̴�. �� ���� ����ڴ� ���� ���� ������ ���� ����� �ȴ�.
	�� �����ڰ� ���� �� ������ �־����� ��, ����ڿ� ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	�� �ټ� �� �ٿ� �� �����ڰ� ���� �� ���� �� ������ �������� ���еǾ� �־�����.
	ù ��° �����ں��� �ټ� ��° �����ڱ��� ������� �־�����. �׻� ����ڰ� ������ ��츸 �Է����� �־�����.

	���
	ù° �ٿ� ������� ��ȣ�� �װ� ���� ������ ����Ѵ�.
 */
package BAEKJOON;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2953 {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i=1; i<a.length; i++)
			if (a[i]>max)
				max = a[i];
		return max;
	}
	
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if (i == n)
				return -1;
			if (a[i] == key)
				return i+1;
			i++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int[][] score = new int[5][4];
		int[] plus = new int[5];
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<4; j++) {
				score[i][j] = stdIn.nextInt();
				plus[i] += score[i][j];
			}
		}
		
		int idx = seqSearch(plus, 5, maxOf(plus));
		System.out.println(idx + " " + maxOf(plus));
	}

}
