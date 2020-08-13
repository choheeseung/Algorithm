/**
 *	����
	�¶��� ������ ������ ������� ���̿� �̸��� ������ ������� �־�����.
	�̶�, ȸ������ ���̰� �����ϴ� ������, ���̰� ������ ���� ������ ����� �տ� ���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� �¶��� ���� ȸ���� �� N�� �־�����. (1 �� N �� 100,000)
	��° �ٺ��� N���� �ٿ��� �� ȸ���� ���̿� �̸��� �������� ���еǾ� �־�����.
	���̴� 1���� ũ�ų� ������, 200���� �۰ų� ���� �����̰�, �̸��� ���ĺ� ��ҹ��ڷ� �̷���� �ְ�, ���̰� 100���� �۰ų� ���� ���ڿ��̴�.
	�Է��� ������ ������ �־�����.

	���
	ù° �ٺ��� �� N���� �ٿ� ���� �¶��� ���� ȸ���� ���� ��, ���̰� ������ ������ ������ �� �ٿ� �� �� ���̿� �̸��� �������� ������ ����Ѵ�.
 */
package BAEKJOON;
import java.io.*;
import java.util.*;

public class BOJ_10814 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		String[][] x = new String[num][2];
		
		for (int i=0; i<num; i++) {
			for (int j=0; j<x[i].length; j++) {
				x[i][j] = stdIn.next();
			}
		}
		
		Arrays.sort(x, new Comparator<String[]>(){

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
			
		});
		
		for (int i=0; i<num; i++)
			System.out.println(x[i][0] + " " + x[i][1]);
	}

}
