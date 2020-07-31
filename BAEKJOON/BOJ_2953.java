/**
 * 문제
	"나는 요리사다"는 다섯 참가자들이 서로의 요리 실력을 뽐내는 티비 프로이다.
	각 참가자는 자신있는 음식을 하나씩 만들어오고, 서로 다른 사람의 음식을 점수로 평가해준다. 점수는 1점부터 5점까지 있다.
	각 참가자가 얻은 점수는 다른 사람이 평가해 준 점수의 합이다. 이 쇼의 우승자는 가장 많은 점수를 얻은 사람이 된다.
	각 참가자가 얻은 평가 점수가 주어졌을 때, 우승자와 그의 점수를 구하는 프로그램을 작성하시오.

	입력
	총 다섯 개 줄에 각 참가자가 얻은 네 개의 평가 점수가 공백으로 구분되어 주어진다.
	첫 번째 참가자부터 다섯 번째 참가자까지 순서대로 주어진다. 항상 우승자가 유일한 경우만 입력으로 주어진다.

	출력
	첫째 줄에 우승자의 번호와 그가 얻은 점수를 출력한다.
 */
package BAEKJOON;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2953 {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i=1; i<a.length; i++)
			if (a[i]>max)
				max = a[i];
		return max;
	}
	
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if (i == n)
				return -1;
			if (a[i] == key)
				return i+1;
			i++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int[][] score = new int[5][4];
		int[] plus = new int[5];
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<4; j++) {
				score[i][j] = stdIn.nextInt();
				plus[i] += score[i][j];
			}
		}
		
		int idx = seqSearch(plus, 5, maxOf(plus));
		System.out.println(idx + " " + maxOf(plus));
	}

}
