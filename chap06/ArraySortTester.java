package chap06;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		Arrays.sort(x);
		
		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < num; i++)
			System.out.println("x[" + i +"] = " + x[i]);
	}

}
