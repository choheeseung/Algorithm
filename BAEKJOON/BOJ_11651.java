/**
 *	문제
	2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

	입력
	첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다.
	(-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

	출력
	첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_11651 {

	public static void main(String[] args) {
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
				if (o1[1] == o2[1])
					return Integer.compare(o1[0], o2[0]);
				return Integer.compare(o1[1], o2[1]);
			}
			
		});
		
		for (int i=0; i<arr.length; i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);
	}

}
