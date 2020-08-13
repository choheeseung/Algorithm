/**
 *	����
	N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� ���� ���� N(1 �� N �� 1,000,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����.
	�� ���� ������ 1,000,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.

	���
	ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
 */
package BAEKJOON;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2751 {
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void sort(int a[], int left, int right){
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);
		
		if (left < pr) sort(a, left, pr);
		if (pl < right) sort(a, pl, right);
    }
    
   public static void main(String[] args) throws Exception {
      // TODO Auto-generated method stub
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int n = Integer.parseInt(br.readLine()); 
      int [] sort = new int[n];
      
      for (int i = 0; i<n; i++)
         sort[i] = Integer.parseInt(br.readLine());
      
      sort(sort, 0, sort.length -1);
      
      for (int i = 0; i<n;i++)
         System.out.println(sort[i]);     
   }

}