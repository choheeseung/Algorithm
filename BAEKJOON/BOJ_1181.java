/**
 *	����
	���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	���̰� ª�� �ͺ���
	���̰� ������ ���� ������
	
	�Է�
	ù° �ٿ� �ܾ��� ���� N�� �־�����. (1��N��20,000) ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ �� �ٿ� �ϳ��� �־�����.
	�־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.

	���
	���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�. ��, ���� �ܾ ���� �� �Էµ� ��쿡�� �� ������ ����Ѵ�.
 */
package BAEKJOON;
import java.io.*;
import java.util.*;

public class BOJ_1181 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>();
		
		for (int i=0; i<num; i++) {
			set.add(br.readLine());
		}
		ArrayList<String> list = new ArrayList<String>(set);
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.length() > o2.length())
					return 1;
				else if (o1.length() < o2.length())
					return -1;
				else
					return o1.compareTo(o2);
			}
			
		});
		
		for (String s : list)
			System.out.println(s);
	}

}
