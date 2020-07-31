/**
 *	����
	�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
	�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.

	���
	ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.
 */

package BAEKJOON;
import java.util.Scanner;
import java.util.ArrayList;

public class BOJ_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> ArrayList = new ArrayList<>();
		
		int[] A = new int[10];
		int[] B = new int[10];
		
		for (int i=0; i<10; i++) {
			System.out.print(i+1 + "��° �� : ");
			A[i] = stdIn.nextInt();
			
			if (A[i] < 0 || A[i] > 1000) {
				System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է��ϼ��� : ");
				A[i] = stdIn.nextInt();
			}
			B[i] = A[i] % 42;
			
			if (!(ArrayList.contains(B[i])))
				ArrayList.add(B[i]);
		}
		System.out.println("���� �ٸ� �������� ������ : " + ArrayList.size() + "�� �Դϴ�.");
	}
}
