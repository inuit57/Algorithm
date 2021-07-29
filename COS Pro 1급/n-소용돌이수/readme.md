```
// You may use import as below.
//import java.util.*;

class Solution {
    public int solution(int n) {
        // Write code here.
        int answer = 0;

        int[][] arr = new int[100][100] ; 
        // 크기 100x100짜리 만들고 채우는 식으로 하자. 

        int num = 0; 
        int x = 0 ; 
        int y = 0 ; 
        
        int dir = 0;  

        while(num++ <= n*n){

            if( arr[y][x] == 0) arr[y][x] = num ; 
            else{
                dir = (dir+1)%4;  // 방향 돌려주기 
            }
            switch(dir){
                case 0 :  //좌측
                    if(x < n-1 && (arr[y][x+1] == 0) ){
                        x ++ ; 
                    }else{
                        dir = 1 ; 
                        y++;
                    }
                    break; 
                case 1 : 
                    if( y < n-1 && (arr[y+1][x] == 0) ){
                        y ++ ; 
                    }else{
                        dir =2 ; 
                        x--;
                    }                    
                    break; 
                case 2 : 
                    if( x > 0 && (arr[y][x-1] == 0) ){
                        x --; 
                    }else{
                        dir = 3; 
                        y--; 
                    }
                    break;
                case 3 : 
                    if( y > 0 && (arr[y-1][x] == 0)  ){
                        y--; 
                    }else{
                        dir = 0; 
                        x++; 
                        
                    }
                    
                    break; 
            }

        }

        for(int i =0 ; i < n; i++){
            for(int j= 0 ; j< n ; j++){
                System.out.print("[ "+ arr[i][j] + "] ");
            }
            System.out.println("");
        }

        for(int i =0 ; i< n; i++){
            answer += arr[i][i]; 
        }

        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 100;
        int ret2 = sol.solution(n2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}
```

- 방향을 꺾어주고, 해당 위치에 값이 이미 들어있는지 체크하는 식으로 구현.
- 만약 값이 있다면 방향을 바꿔주도록 
