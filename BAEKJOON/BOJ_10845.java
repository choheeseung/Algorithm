/**
 *	����
	������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	����� �� ���� �����̴�.

	push X: ���� X�� ť�� �ִ� �����̴�.
	pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	size: ť�� ����ִ� ������ ������ ����Ѵ�.
	empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
	front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

	�Է�
	ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
	�־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.

	���
	����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 */
package BAEKJOON;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<Integer>();
		int item = 0;
		int num = stdIn.nextInt();
		
		for (int i=0; i<num; i++) {
			String menu = stdIn.next();
			
			switch(menu) {
				case "push":
					item = stdIn.nextInt();
					que.add(item);
					break;
				case "pop":
					if (que.isEmpty())
						System.out.println("-1");
					else
						System.out.println(que.poll());
					break;
				case "size":
					System.out.println(que.size());
					break;
				case "empty":
					if (que.isEmpty())
						System.out.println("1");
					else
						System.out.println("0");
					break;
				case "front":
					if (que.isEmpty())
						System.out.println("-1");
					else
						System.out.println(que.peek());
					break;
				case "back":
					if(que.isEmpty())
						System.out.println("-1");
					else
						System.out.println(item);
					break;
			}
		}
	}

}
