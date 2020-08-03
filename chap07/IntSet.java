package chap07;

public class IntSet {
	private int max;
	private int num;
	private int[] set;
	
	public IntSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int capacity() { // ������ �ִ� ����
		return max;
	}
	
	public int size() { // ������ ���� ��� ����
		return num;
	}
	
	public int indexOf(int n) { // ��� �˻�
		for (int i=0; i<num; i++)
			if (set[i] == n)
				return i;
		return -1;
	}
	
	public boolean contains(int n) { //��� n�� �ִ��� Ȯ��
		return (indexOf(n) != -1)? true : false;
	}
	
	public boolean add(int n) { // ��� n�� ���տ� �߰�
		if (num >= max || contains(n) == true)
			return false;
		else {
			set[num++] = n;
			return true;
		}
	}
	
	public boolean remove(int n) { // ��� n�� ���տ��� ����
		int idx;
		
		if (num<=0 || (idx = indexOf(n)) == -1)
			return false;
		else {
			set[idx] = set[--num];
			return true;
		}
	}
	
	public void copyTo(IntSet s) { // �ٸ� �������� ����
		int n = (s.max < num)? s.max : num;
		for (int i=0; i<n; i++)
			s.set[i] = set[i];
		s.num = n;
	}
	
	public void copyFrom(IntSet s) { // �ٸ� ������ ����
		int n = (max < s.num)? max : s.num;
		for (int i=0; i<n; i++)
			set[i] = s.set[i];
		num = n;
	}
	
	public boolean equalTo(IntSet s) { // �ٸ� ���հ� ������ Ȯ��
		if (num != s.num)
			return false;
		
		for (int i=0; i<num; i++) {
			int j=0;
			for ( ; j<num; j++)
				if (set[i] == s.set[j])
					break;
			if (j == s.num)
				return false;
		}
		return true;
	}
	
	public void unionOf(IntSet s1, IntSet s2) { // �� ������ �������� ����
		copyFrom(s1);
		for (int i=0; i<s2.num; i++)
			add(s2.set[i]);
	}
	
	public String toString() { // ������ ���ڿ��� ��ȯ
		StringBuffer temp = new StringBuffer("{ ");
		for (int i=0; i<num; i++)
			temp.append(set[i] + " ");
		temp.append("}");
		return temp.toString();
	}
	
	public boolean isEmpty() { // ���������� Ȯ��
		return num==0;
	}
	
	public boolean isFull() { // ������ ���� á���� Ȯ��
		return num >= max;
	}
	
	public void clear() { // ���� �ʱ�ȭ
		num = 0;
	}
	
	public boolean add(IntSet s) { // ���� s�� ������
		boolean flag = false;
		for (int i = 0; i < num; i++)
			if (add(set[i]) == true)
				flag = true;
		return flag;
	}

	public boolean retain(IntSet s) { // ���� s�� ������
		boolean flag = false;
		for (int i = 0; i < num; i++)
			if (s.contains(set[i]) == false) {
				remove(set[i]);
				flag = true;
			}
		return flag;
	}

	public boolean remove(IntSet s) { // ���� s�� ������
		boolean flag = false;
		for (int i = 0; i < num; i++)
			if (s.contains(set[i]) == true) {
				remove(set[i]);
				flag = true;
			}
		return flag;
	}
}
