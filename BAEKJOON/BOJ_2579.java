/**
 *	문제
 	계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다. 즉, 한 계단을 밟으면서 이어서 다음 계단이나, 다음 다음 계단으로 오를 수 있다.
	연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
	마지막 도착 계단은 반드시 밟아야 한다.
	따라서 첫 번째 계단을 밟고 이어 두 번째 계단이나, 세 번째 계단으로 오를 수 있다.
	하지만, 첫 번째 계단을 밟고 이어 네 번째 계단으로 올라가거나, 첫 번째, 두 번째, 세 번째 계단을 연속해서 모두 밟을 수는 없다.

	각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램을 작성하시오.

	입력
	입력의 첫째 줄에 계단의 개수가 주어진다.
	둘째 줄부터 한 줄에 하나씩 제일 아래에 놓인 계단부터 순서대로 각 계단에 쓰여 있는 점수가 주어진다.
	계단의 개수는 300이하의 자연수이고, 계단에 쓰여 있는 점수는 10,000이하의 자연수이다.

	출력
	첫째 줄에 계단 오르기 게임에서 얻을 수 있는 총 점수의 최댓값을 출력한다.
 */
package BAEKJOON;
import java.util.*;

public class BOJ_2579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] score = new int[n+1];
		int[][] dp = new int[n+1][2];
		
		for (int i=0; i<n; i++)
			score[i] = stdIn.nextInt();
		
		dp[0][0] = score[0];
		dp[1][0] = dp[0][0] + score[1];
		dp[1][1] = score[1];
		
		for (int i=2; i<n; i++) {
			dp[i][0] = dp[i-1][1] + score[i];
			dp[i][1] = Math.max(dp[i-2][0], dp[i-2][1]) + score[i];
		}
		System.out.println(Math.max(dp[n-1][0], dp[n-1][1]));
	}

}
