# Dynamic Programming

- 문제의 입력사례를 분할하여 문제를 푼다
- 가장 작은 입력사례의 답을 구하여 저장해놓고, 필요하면 꺼내 쓴다
- 상향식(bottom-up) 접근방법

1. 이항계수 구하기

   - 분할정복

     ```
     int bin (int n, int k) {
     	if (k == 0 || n == k)
     		return 1;
     	else
     		return bin(n-1, k-1) + bin(n-1, k);
     }
     ```

   - 동적계획

     ```
     int bin2 (int n, int k) {
     	index i, j
     	int B[0..n][0..k];
     	
     	for (i = 0; i <= n; i++)
     		for (j = 0; j <= minimum(i, k); j++)
     			if (j == 0 || j == i)
     				B[i][j] = 1;
     			else
     				B[i][j] = B[i-1][j-1] + B[i-1][j];
     	return B[n][k];
     }
     ```

     