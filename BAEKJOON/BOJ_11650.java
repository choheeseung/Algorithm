/**
 *	����
	2���� ��� ���� �� N���� �־�����. ��ǥ�� x��ǥ�� �����ϴ� ������, x��ǥ�� ������ y��ǥ�� �����ϴ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� ���� ���� N (1 �� N �� 100,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� i������ ��ġ xi�� yi�� �־�����.
	(-100,000 �� xi, yi �� 100,000) ��ǥ�� �׻� �����̰�, ��ġ�� ���� �� ���� ����.

	���
	ù° �ٺ��� N���� �ٿ� ���� ������ ����� ����Ѵ�.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_11650 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		int arr[][] = new int[num][2];
		
		for (int i=0; i<num; i++) {
			for (int j=0; j<arr[i].length; j++)
				arr[i][j] = stdIn.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if (o1[0] == o2[0])
					return Integer.compare(o1[1], o2[1]);
				return Integer.compare(o1[0], o2[0]);
			}
			
		});
		
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);
	}

}
