/**
 *	문제
	배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

	입력
	첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

	출력
	첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 */
package BAEKJOON;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1427 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int size = num.length();
		Integer[] x = new Integer[size];
		
		for (int i=0; i<size; i++)
			x[i] = num.charAt(i) - '0';
		
		Arrays.sort(x, Collections.reverseOrder());
		
		for (int i=0; i<size; i++)
			System.out.print(x[i]);
	}

}
