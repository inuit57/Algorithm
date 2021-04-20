#include<stdio.h>

int arr[30][30] , chk[30] , cnt = 0 , n ; 

void DFS(int v){
  if( v == n) {
    cnt++ ; 
    return; 
  }else{
    for(int i = 2; i<= n; i++){
      if ( arr[v][i] == 1 && chk[i]!=1){
        //간선이 연결되어있고 아직 방문하지 않은 경우라면. 
        chk[i] = 1; 
        DFS(i) ; // i번째 점에 표시하고 다시 DFS를 돌린다.
        chk[i] = 0 ; // 방문했던 것을 다시 지워버린다. 
      }
    }
  }
}
    
int main(){
  int m , a,b ; 
  scanf("%d %d",&n, &m) ; 
  
  for(int i = 0; i< m ; i++){
    scanf("%d %d", &a , &b) ; 
    arr[a][b] = 1; 
  }
  
  chk[1] = 1; 
  DFS(1) ; 
  printf("%d", cnt); 
  
  return 0; 
}
  
