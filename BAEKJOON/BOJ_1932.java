/**
 *	문제
 	맨 위층부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라.
 	아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
	삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.

	입력
	첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.

	출력
	첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_1932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[][] tri = new int[n+1][n+1];
		int[][] res = new int[n+1][n+1];
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				tri[i][j] = stdIn.nextInt();
			}
		}
		
		res[1][1] = tri[1][1];
		
		for (int i=2; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				if (j==1)
					res[i][j] = tri[i][j] + res[i-1][j];
				else
					res[i][j] = tri[i][j] + Math.max(res[i-1][j], res[i-1][j-1]);
			}
		}
		
		int max = Integer.MIN_VALUE;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				if (max < res[i][j])
					max = res[i][j];
			}
		}
		System.out.println(max);
	}

}
