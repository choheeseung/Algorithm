/**
 *	문제
	N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

	입력
	첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다.
	이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

	출력
	첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */
package BAEKJOON;
import java.util.Scanner;

public class BOJ_2750 {
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void quickSort(int a[], int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);
		
		if (left < pr) quickSort(a, left, pr);
		if (pl < right) quickSort(a, pl, right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i=0; i<num; i++) {
			x[i] = stdIn.nextInt();
		}
		quickSort(x, 0, num-1);
		
		for (int i=0; i<num; i++)
			System.out.println(x[i]);
	}

}
