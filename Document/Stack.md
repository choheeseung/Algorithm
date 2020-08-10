# Stack

- 데이터를 일시적으로 저장하기 위해 사용하는 자료구조
- LIFO(Last in First Out)

- 메서드

  - push : 스택에 데이터를 푸시하는 메서드

    ```
    if (ptr >= max) // 스택이 가득 참
    	throw new OverflowIntStackException();
    return stk[ptr++] = x;
    ```

  - pop : 스택의 꼭대기에서 데이터를 팝(제거)하고 그 값을 반환하는 메서드

    ```
    if (ptr <= 0) // 스택이 비어 있음
    	throw new EmptyIntStackException();
    return stk[--ptr];
    ```

  - peek : 스택의 꼭대기에 있는 데이터를 "몰래 엿보는" 메서드

    ```
    if (ptr <= 0) //스택이 비어 있음
    	throw new EmptyIntStackException();
    return stk[ptr -1];
    ```

  - indexOf : 스택에 x와 같은 값의 데이터가 포함되어 있는지, 포함되어 있다면 어디에 들어 있는지 조사하는 메서드

    ```
    for (int i = ptr-1; i >= 0; i--)
    	if (stk[i] == x)
    		return i;
    return -1;
    ```

  - clear : 모든 데이터 삭제

    ```
    ptr = 0;
    ```

  - capacity : 용량 확인

    ```
    return max;
    ```

  - size : 데이터 수 확인

    ```
    return ptr;
    ```

  - isEmpty : 스택이 비어 있는지 검사

    ```
    return ptr <= 0;
    ```

  - isFull : 스택이 가득 찼는지 검사

    ```
    return ptr >= max;
    ```

  - dump : 스택 안에 있는 모든 데이터 표시

    ```
    if (ptr <= 0)
    	System.out.println("스택이 비어 있습니다.");
    else {
    	for (int i = 0; i < ptr; i++)
    		System.out.print(stk[i] + " ");
    	System.out.println();
    }
    ```

    