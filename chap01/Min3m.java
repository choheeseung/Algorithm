package chap01;

public class Min3m {
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("min3(3,2,1) = " + min3(3,2,1));
		System.out.println("min3(2,1,3) = " + min3(2,1,3));
		System.out.println("min3(1,3,2) = " + min3(1,3,2));
	}

}
