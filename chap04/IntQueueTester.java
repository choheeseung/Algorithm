package chap04;
import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64);
		
		while(true) {
			System.out.println("���� ������ �� : " + s.size() + " / " + s.capacity());
			System.out.print("(1)��ť (2)��ť (3)��ũ (4)���� (0)���� : ");
			
			int menu = stdIn.nextInt();
			if (menu == 0) break;
			
			int x;
			switch(menu) {
				case 1:
					System.out.print("������ : ");
					x = stdIn.nextInt();
					try {
						s.eque(x);
					} catch (IntQueue.OverflowIntQueueException e) {
						System.out.println("ť�� ���� á���ϴ�.");
					}
					break;
					
				case 2:
					try {
						x = s.deque();
						System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("ť�� ��� �ֽ��ϴ�.");
					}
					break;
				case 3:
					try {
						x = s.peek();
						System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("ť�� ��� �ֽ��ϴ�.");
					}
					break;
				case 4:
					s.dum();
					break;
			}
		}
	}

}