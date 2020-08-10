# Queue

- 데이터를 일시적으로 쌓아 두기 위한 자료구조

- 선입선출(FIFO)

- 메서드

  - enque : 큐에 데이터를 인큐, 성공하면 인큐한 값을 그대로 반환

    ```
    if (num >= max)
    	throw new OverflowIntQueueException(); // 큐가 가득 참
    que[rear++] = x;
    num++;
    if (rear == max)
    	rear = 0;
    return x;
    ```

  - deque : 큐에서 데이터를 디큐하고 그 값을 반환

    ```
    if (num <= 0)
    	throw new EmptyIntQueueException(); // 큐가 비어 있음
    int x = que[front++];
    num--;
    if (front == max)
    	front = 0;
    return x;
    ```

  - peek : 맨 앞의 데이터(디큐에서 꺼낼 데이터)를 "몰래 엿보는" 메서드

    ```
    if (num <= 0)
    	throw new EmptyIntQueueException();
    return que[front];
    ```

  - indexOf : 큐의 배열에서 x와 같은 데이터가 저장되어 있는 위치를 알아내는 메서드

    ```
    for (int i = 0; i < num; i++) {
    	int idx = (i + front) % max;
    	if (que[idx] == x)
    		return idx;
    }
    return -1;
    ```

  - clear : 모든 데이터 삭제

    ```
    num = front = rear = 0;
    ```

  - capacity : 최대 용량 확인

    ```
    return max;
    ```

  - size : 데이터 수 확인

    ```
    return num;
    ```

  - isEmpty : 큐가 비어 있는지 판단

    ```
    return num <= 0;
    ```

  - isFull : 큐가 가득 찼는지 판단

    ```
    return num >= max;
    ```

  - dump : 모든 데이터 출력

    ```
    if (num <= 0)
    	System.out.println("큐가 비어 있습니다.");
    else {
    	for (int i = 0; i < num; i++)
    		System.out.print(que[(i + front) % max] + " ");
    	System.out.println();
    }
    ```



- 링 버퍼의 활용
  - 오래된 데이터를 버리는 용도로 사용
  - 요소의 개수가 n인 배열에 계속 데이터가 입력될 때 가장 최근에 들어온 데이터 n개만 저장하고 오래된 데이터는 버린다.