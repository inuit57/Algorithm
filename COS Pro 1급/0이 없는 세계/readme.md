```
// You may use import as below.
import java.util.*;

class Solution {
    public long solution(long num) {
        // Write code here.
        long answer = 0;

        // 0을 1로 바꾸자.
        answer = num + 1;

        String tmp = answer + "" ;

                
        answer = Integer.parseInt(tmp.replace( '0' , '1')) ;

        
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        long num = 9949999;
        long ret = sol.solution(num);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
```

- 간단한 문제
- 1을 더해주고 나온 값을 문자열로 바꾼 뒤, 0을 1로 모두 바꿔주면 된다. 
