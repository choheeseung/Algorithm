# Comparable & Comparator

1. Comparable

   - 정렬 수행 시 기본적으로 적용되는 정렬 기준이 되는 메서드를 정의하는 인터페이스

   - Comparable interface를 implements 후 CompareTo() 메서드 오버라이드

     - 현재 객체 < 파라미터로 넘어온 객체 : 음수 리턴
     - 현재 객체 == 파라미터로 넘어온 객체 : 0 리턴
     - 현재 객체 > 파라미터로 넘어온 객체 : 양수 리너
     - 음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다.

   - 사용 방법

     - Arrays.sort(array) : 배열 정렬의 경우
     - Collections.sort(list) : List Collection 정렬의 경우

     ```
     class Point implements Comparable<Point> {
     	int x, y;
     	
     	@Override
     	public int compareTo(Point p) {
     		if (this.x > p.x)
     			return 1;
     		else if (this.x == p.x) {
     			if (this.y < p.y)
     				return 1;
     		}
     		return -1;
     	}
     }
     #Main
     List<Point> pointList = new ArrayList<>();
     pointList.add(new Point(x, y));
     Collections.sort(pointList);
     ```

     

2. Comparator
   - 정렬 가능한 클래스(Comparable 인터페이스를 구현한 클래스)들의 기본 정렬 기준과 다르게 정렬하고 싶을 때 사용하는 인터페이스

   - 내림차순으로 정렬할 때 많이 사용

   - Comparator interface를 implements 후 compare() 메서드 오버라이드
     - 현재 객체 < 파라미터로 넘어온 객체: 음수 리턴
     - 현재 객체 == 파라미터로 넘어온 객체: 0 리턴
     - 현재 객체 > 파라미터로 넘어온 객체: 양수 리턴
     - 음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다.
       - 즉, Integer.compare(x, y) (오름차순 정렬)와 동일한 개념이다.
         - return (x < y) ? -1 : ((x == y) ? 0 : 1);
       - 내림차순 정렬의 경우 두 파라미터의 위치를 바꿔준다.
         - Integer.compare(y, x) (내림차순 정렬)

   - 사용 방법
     - Arrays.sort(array) : 배열 정렬의 경우
     - Collections.sort(list) : List Collection 정렬의 경우
     
     ```
     class MyComparator implements Comparator<Point> {
     	@Override
     	public int compare(Point p1, Point p2) {
     		if (p1.x > p2.x)
     			return 1
     		else if (p1.x == p2.x) {
     			if (p1.y < p2.y)
     				return 1;
     		}
     		return -1;
     	}
     }
     #main
     List<Point> pointList = new ArrayList<>();
     pointList.add(new Point(x, y));
     MyComparator myComparator = new MyComparator();
     Collections.sort(pointList, myComparator);
     ```
     
     - Comparator 익명 클래스 이용
     
     ```
     Comparator<Point> myComparator = new Comparator<Point>() {
     	@Override
     	public int compare(Point p1, Point p2) { 위와 동일 }
     }
     #main
     List<Point> pointList = new ArrayList<>();
     pointList.add(new Point(x, y));
     Collections.sort(pointList, myComparator);
     ```
     
     