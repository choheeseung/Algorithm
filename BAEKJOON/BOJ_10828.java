/**
 *	����
	������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	����� �� �ټ� �����̴�.

	push X: ���� X�� ���ÿ� �ִ� �����̴�.
	pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
	empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
	top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

	�Է�
	ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
	�־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.

	���
	����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 */
package BAEKJOON;
import java.util.Scanner;
import java.util.Stack;
public class BOJ_10828 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int num = stdIn.nextInt();
		
		for (int i=0; i<num; i++) {
			String menu = stdIn.next();
			
			switch (menu) {
				case "push":
					int item = stdIn.nextInt();
					stack.push(item);
					break;
				case "top":
					if (stack.isEmpty())
						System.out.println("-1");
					else
						System.out.println(stack.peek());
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					if (stack.isEmpty())
						System.out.println("1");
					else
						System.out.println("0");
					break;
				case "pop":
					if (stack.isEmpty())
						System.out.println("-1");
					else {
						if (stack.isEmpty())
							System.out.println("-1");
						else {
							System.out.println(stack.peek());
							stack.pop();
						}
					}
					break;
			}
		}
	}

}
