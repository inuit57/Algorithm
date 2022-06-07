# 개요 
- "결정알고리즘"에 대해서 정리한다. 

## 사용하는 경우
- "결정 문제"로 풀면 쉽게 풀리는 문제 
- 어떤 시점까지는 조건을 만족하지만 그 이후로는 조건을 만족하지 않는 "최댓값" 찾기
- 어떤 시점까지는 조건을 만족하지않지만 그 이후로는 조건을 만족하는 "최솟값" 찾기

## 중요한 고려사항
- 매개변수(min, max , mid) 와 결정함수
```
# 매개변수란?
- 검사 범위를 지정해줘야 한다. 
- 시작값과 끝값을 설정하고 이분탐색을 하듯이 계속 절반씩 줄여가면서 조건을 확인한다.
```
```
# 결정함수란?
- 지정된 검사범위 안의 값이 만족하는지 판단하는 함수다.
- 여기에서의 판단 결과에 따라서 min과 max값을 변동시켜준다. 
- 일반적으로는 min = mid+1 , max = mid 로 값을 변동시킨다. 
```

## 구현 예시 
```java
solution(int[] arr, int n){ 
  int answer = Integer.MAX_VALUE ; // 또는 Integer.MIN_VALUE 
  int min, max, mid ; 
  
  // min, max 값 설정 
  while( min < max ) { 
    mid = (min+max)/2 ; 
    if( check( arr, mid ) ) { 
      // 결과가 참인 경우
      answer = mid
      // mid 가 우리가 찾으려는 해답값이 된다. 
      
      max = mid; 
      // 최댓값인지 최솟값인지에 따라 설정값이 달라진다. 
    }else{
      min = mid+1 ; 
    }
  }
}
```


## 예시문제 
- [뮤직비디오](https://cote.inflearn.com/contest/10/problem/06-09)
- [랜선자르기](https://www.acmicpc.net/problem/1654) 


### 참고자료 
- [자료1](https://m42-orion.tistory.com/70)
- [자료2](https://happyobo.github.io/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98/%EC%9D%B4%EB%B6%84%ED%83%90%EC%83%89/c++/algorithm0108-post/)
