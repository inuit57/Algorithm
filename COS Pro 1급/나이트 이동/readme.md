```
// You may use import as below.
//import java.util.*;

class Solution {
    public int solution(String pos) {
        // Write code here.
        int answer = 0;

        //System.out.println(pos.charAt(0) - 'A');

        //int x = Integer.parseInt(pos.charAt(1)+"") -1 ; 

        int x = pos.charAt(1) - '1' ; 
        int y = pos.charAt(0) -'A' ; 

        System.out.println("x : " + x );
        System.out.println("y : " + y );

        // 8x2 짜리가 나온다. 
        int[][] move = { { 2,1 } , {2 , -1} , { -2, 1} , { -2, -1} , {1,2}  , {-1 , 2} , { 1,-2} , {-1,-2} } ; 


        for(int i = 0 ; i < 8 ; i++){
            int tmp_x = x + move[i][0] ; 
            int tmp_y = y + move[i][1] ; 

            if( tmp_x >= 0 && tmp_x < 8  && tmp_y >= 0 && tmp_y < 8) answer ++; 
        }

        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String pos = "A7";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
```

- 이동방향을 배열에 저장하는 식으로 구현하는 것을 한번 해보았습니다. 
- 익숙해진다면 굉장히 편한 방식이 될 듯. 
