```

...
 
// next 방향 전환을 위한 4x2 배열
int [][]direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
 
...
 
// (0, 0)에서 시작
int curX = 0;
int curY = 0;
 
...
 
for(int i = 0; i < 4; i++){
    int nextX = curX + direction[i][1];
    int nextY = curY + direction[i][0];
 
    if(/* 배열 범위를 벗어나지 않았는지 check */ && 
       /* check 배열을 통해 방문한 적이 없는지 check*/ &&
       /* 다음 좌표에 길이 있는지 check */){
            // To Do Something..
    }
 

...

```

출처 : https://hanxxang.tistory.com/70
