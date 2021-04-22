# 모범 풀이 
```
int map[10][10] , ch[10][10]  ; 
int dx[4] = {-1, 0 , 1, 0} ; 
int dy[4] = {0, 1, 0, -1} ; 

int cnt = 0 ; 

void DFS( int x , int y ) { 
  int i, xx ,yy ; 
  if(x == 7 && y == 7) {
    cnt ++; 
  }
  else{
    for(i =0  ; i< 4; i++){
      xx = x+dx[i] ; 
      yy = y+dx[i]; 
      if( xx < 1 || xx >7 || yy <1 || yy>7)continue; 
      else if(map[xx][yy]==0 && ch[xx][yy]==0){
        ch[xx][yy] = 1; 
        DFS(xx,yy) ; 
        ch[xx][yy] = 0 ; 
      }
    }
  }
}

int main(){

  (...)
  ch[1][1] = 1; 
  DFS(1,1) ; 
}
```

----
- 주의깊게 볼만한 부분
    + 원본에 해당되는 map을 건드리지 않고 작업한 점
    + dx , dy 배열을 만들어서 반복문으로 깔끔하게 처리한 부분 
    + 원본에 해당되는 것보다 더 큰 크기의 맵을 선언하는 부분.
    (헷갈리지 않고 작업할 수 있다. 1->0 으로 바꾸는 등의 혼란의 여지가 적다.) 
    + 처음 시작할 때 시작점을 1로 체크하고 시작하는 부분! 
