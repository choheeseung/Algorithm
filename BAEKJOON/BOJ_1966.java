/**
 *	����
	�����е� �˴ٽ��� �������� ������ ���� �������� �μ��ϰ��� �ϴ� ������ �μ� ����� ���� ��������Ρ�, �� ���� ��û�� ���� ���� �μ��Ѵ�.
	���� ���� ������ ���δٸ� Queue �ڷᱸ���� �׿��� FIFO - First In First Out - �� ���� �μⰡ �ǰ� �ȴ�.
	������ ����̴� ���ο� �����ͱ� ���� ����Ʈ��� �����Ͽ��µ�, �� �����ͱ�� ������ ���� ���ǿ� ���� �μ⸦ �ϰ� �ȴ�.
	
	���� Queue�� ���� �տ� �ִ� ������ ���߿䵵���� Ȯ���Ѵ�.
	������ ������ �� ���� �������� �߿䵵�� ���� ������ �ϳ��� �ִٸ�, �� ������ �μ����� �ʰ� Queue�� ���� �ڿ� ���ġ �Ѵ�. �׷��� �ʴٸ� �ٷ� �μ⸦ �Ѵ�.
	���� ��� Queue�� 4���� ����(A B C D)�� �ְ�, �߿䵵�� 2 1 4 3 ��� C�� �μ��ϰ�, �������� D�� �μ��ϰ� A, B�� �μ��ϰ� �ȴ�.

	�������� �� ����, ���� Queue�� �ִ� ������ ���� �߿䵵�� �־����� ��, � �� ������ �� ��°�� �μ�Ǵ��� �˾Ƴ��� ���̴�.
	���� ��� ���� ������ C������ 1��°��, A������ 3��°�� �μ�ǰ� �ȴ�.

	�Է�
	ù �ٿ� test case�� ���� �־�����.
	�� test case�� ���ؼ� ������ �� N(100����)�� �� ��°�� �μ�Ǿ����� �ñ��� ������ ���� Queue�� � ��ġ�� �ִ����� �˷��ִ� M(0�̻� N�̸�)�� �־�����. �����ٿ� N�� ������ �߿䵵�� �־����µ�, �߿䵵�� 1 �̻� 9 �����̴�. �߿䵵�� ���� ������ ���� �� ���� ���� �ִ�. ���� ���� N=4, M=0(A������ �ñ��ϴٸ�), �߿䵵�� 2 1 4 3�� �ȴ�.

	���
	�� test case�� ���� ������ �� ��°�� �μ�Ǵ��� ����Ѵ�.
 */
package BAEKJOON;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		LinkedList<Integer> que = new LinkedList<Integer>();
		
		int num = stdIn.nextInt(); // �� �� Ȯ���� ���ΰ�?
		
		for (int i=0; i<num; i++) {
			int N = stdIn.nextInt(); // �� ���� ����?
			int M = stdIn.nextInt(); // �߿䵵 �� ��°?
			int count = 0;
			que.clear();
			
			for (int j=0; j<N; j++) {
				int priority = stdIn.nextInt(); // �� ������ �߿䵵
				que.add(priority);
			}
			
			while(!que.isEmpty()) {
				boolean isPriority = true;
				
				for (int j=1; j<que.size(); j++) {
					if(que.peek() < que.get(j)) {
						isPriority = false;
						break;
					}
				}
				
				if(isPriority) {
					count++;
					que.poll();
					
					if(M == 0)
						break;
					else
						M -= 1;
				}
				else {
					int temp = que.poll();
					que.add(temp);
					M = (M == 0)? que.size()-1 : --M;
				}
			}
			System.out.println(count);
		}
	}

}
