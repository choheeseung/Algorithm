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
	
	public int capacity() { // 집합의 최대 개수
		return max;
	}
	
	public int size() { // 집합의 현재 요수 개수
		return num;
	}
	
	public int indexOf(int n) { // 요소 검색
		for (int i=0; i<num; i++)
			if (set[i] == n)
				return i;
		return -1;
	}
	
	public boolean contains(int n) { //요소 n이 있는지 확인
		return (indexOf(n) != -1)? true : false;
	}
	
	public boolean add(int n) { // 요소 n을 집합에 추가
		if (num >= max || contains(n) == true)
			return false;
		else {
			set[num++] = n;
			return true;
		}
	}
	
	public boolean remove(int n) { // 요소 n을 집합에서 삭제
		int idx;
		
		if (num<=0 || (idx = indexOf(n)) == -1)
			return false;
		else {
			set[idx] = set[--num];
			return true;
		}
	}
	
	public void copyTo(IntSet s) { // 다른 집합으로 복사
		int n = (s.max < num)? s.max : num;
		for (int i=0; i<n; i++)
			s.set[i] = set[i];
		s.num = n;
	}
	
	public void copyFrom(IntSet s) { // 다른 집합을 복사
		int n = (max < s.num)? max : s.num;
		for (int i=0; i<n; i++)
			set[i] = s.set[i];
		num = n;
	}
	
	public boolean equalTo(IntSet s) { // 다른 집합과 같은지 확인
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
	
	public void unionOf(IntSet s1, IntSet s2) { // 두 집합의 합집합을 복사
		copyFrom(s1);
		for (int i=0; i<s2.num; i++)
			add(s2.set[i]);
	}
	
	public String toString() { // 집합을 문자열로 변환
		StringBuffer temp = new StringBuffer("{ ");
		for (int i=0; i<num; i++)
			temp.append(set[i] + " ");
		temp.append("}");
		return temp.toString();
	}
	
	public boolean isEmpty() { // 공집합인지 확인
		return num==0;
	}
	
	public boolean isFull() { // 집합이 가득 찼는지 확인
		return num >= max;
	}
	
	public void clear() { // 집합 초기화
		num = 0;
	}
	
	public boolean add(IntSet s) { // 집합 s와 합집합
		boolean flag = false;
		for (int i = 0; i < num; i++)
			if (add(set[i]) == true)
				flag = true;
		return flag;
	}

	public boolean retain(IntSet s) { // 집합 s와 교집합
		boolean flag = false;
		for (int i = 0; i < num; i++)
			if (s.contains(set[i]) == false) {
				remove(set[i]);
				flag = true;
			}
		return flag;
	}

	public boolean remove(IntSet s) { // 집합 s와 차집합
		boolean flag = false;
		for (int i = 0; i < num; i++)
			if (s.contains(set[i]) == true) {
				remove(set[i]);
				flag = true;
			}
		return flag;
	}
}
