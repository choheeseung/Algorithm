/**
 *	����
	�迭�� �����ϴ� ���� ����. ���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.

	�Է�
	ù° �ٿ� �����ϰ����ϴ� �� N�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ����̴�.

	���
	ù° �ٿ� �ڸ����� ������������ ������ ���� ����Ѵ�.
 */
package BAEKJOON;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1427 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int size = num.length();
		Integer[] x = new Integer[size];
		
		for (int i=0; i<size; i++)
			x[i] = num.charAt(i) - '0';
		
		Arrays.sort(x, Collections.reverseOrder());
		
		for (int i=0; i<size; i++)
			System.out.print(x[i]);
	}

}
