```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(String[] bishops) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;

        int[][] move = { {-1,-1} , { 1,1} , {1,-1} , {-1,1}}; 

        int b_x , b_y ; 

        int new_x , new_y ;  

        int [][] map = new int[8][8] ; 
        for(int i =0 ; i < bishops.length ; i++){
            b_y = bishops[i].charAt(0) - 'A' ; 
            b_x = bishops[i].charAt(1) - '1' ; 

            map[b_x][b_y] = 2 ; 

            for(int j = 0 ; j< 4; j++){
                new_x = b_x ; 
                new_y = b_y ; 
                while(true){
                    new_x += move[j][0] ; 
                    new_y += move[j][1] ; 
                    
                    if( new_x >= 0 && new_y >= 0 && new_x < 8 && new_y < 8){
                        map[new_x][new_y] = 1; 
                    }else{
                        break; 
                    }
                }
            }
        }

        for(int i = 0 ; i< 8; i ++){
            for(int j = 0 ; j < 8 ; j++){
                if( map[i][j] == 0 ) answer ++ ; 
                System.out.print("["+ map[i][j] +"]");
            }
            System.out.println("");
        }

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}

```

- 체스판에 비숍 여러 개가 놓였을 경우, 비숍한테 잡아먹히지 않는 위치를 구하는 문제
- 쉬운 문제였다. move 배열을 한 번 더 사용해보았다는 것에 의의를 두자 
