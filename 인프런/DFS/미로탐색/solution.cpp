#include<iostream>
#include<vector>
#include<stdio.h>
#include<algorithm>

using namespace std; 

bool maze[7][7] ;
int cnt = 0 ; 

void dfs(int x, int y){
    if( x == 6 && y == 6) {
        cnt++; 
        return ;
    }else{
        if( x < 6 ){
            if(maze[x+1][y] != 1){
                maze[x+1][y] = 1; 
                dfs(x+1, y) ;
                maze[x+1][y] = 0; 
            }
            
        }
        if (x > 0) {
            if(maze[x-1][y] != 1){
                maze[x-1][y] = 1; 
                dfs(x-1 ,y) ;
                maze[x-1][y] = 0; 
            }
        }
        if( y < 6){
            if(maze[x][y+1] != 1){
                maze[x][y+1] = 1; 
                dfs(x, y+1) ;
                maze[x][y+1] = 0 ; 
            }
        }
        if ( y >0) {
            if (maze[x][y-1] != 1){
                maze[x][y-1] = 1; 
                dfs(x , y-1) ; 
                maze[x][y-1] = 0 ; 
            }
        }
         

    }
}

int main(){
    //freopen("input.txt", "rt", stdin); 

   
    for(int i =0 ; i< 7 ; i++){
        for(int j =0 ; j< 7 ; j++){
            scanf("%d", &maze[i][j]) ; 
        }
    }

    dfs(0,0) ; 

    printf("%d", cnt/2); 
}


