//배열에 넣고 처리하는 것이 제일 간단. 

int arr[100] = {0} ; //0으로 초기화 
vector<int> answer  ; // 이거는 제일 큰 놈들 넣어줄 배열.

/*
arr에 값들을 넣어주는 부분.
*/

int max = - 1 ; 
for(int i = 0 ; i< 100 ; i++){
  if( arr[i] > max) {
    max = arr[i]; 
  }
}

for(int i = 0 ; i< 100; i++){
  if ( arr[i] == max){
    answer.push_back(i);  //동일등수가 있다고 하더라도 O(n)만큼만 더 돌면은 다 넣어줄 수 있다. 순서대로. 
  }
}
