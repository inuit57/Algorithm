```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int[][] garden) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int size = garden[0].length; 
        
        //System.out.println("size : " + size); 
        
        int[][] direction = { {1,0} , {-1,0} , {0,1} , {0,-1}}  ; 
         
        boolean flag =  true ;
        int curr_flower = 0;  // 현재 피어야 하는 꽃. 

        while(flag){            
            flag = false; 
            for(int i = 0 ; i< size; i++){
                for(int j =0 ; j< size ; j++){
                    if(garden[i][j] == 0 ) flag = true; 
                }
            }
            
            if( flag ) {
                curr_flower ++; 
                answer ++; 
            }else{
                break; 
            }
            
            for(int i =0 ; i< size ; i++){
                for(int j =0 ; j< size ; j++){ 
                   if( garden[i][j] == curr_flower){
                        for(int k = 0 ; k < 4; k++){
                            int x = i + direction[k][0] ; 
                            int y = j + direction[k][1] ; 
                            
                            if( x < 0 || x >= size){
                                x = i ; 
                            }
                            if( y < 0 || y >=size){
                                y = j ; 
                            }
                            if(garden[x][y] == 0 ){
                                garden[x][y] = curr_flower +1 ; // 다음 번에 필 꽃.    
                            }
                        }
                        
                    }
                }
            }
            

            
        }
        
        for(int ki =  0 ; ki< size ; ki++){
            for(int kl =0 ; kl < size ; kl++){
                System.out.print(garden[ki][kl] +"_" ); 
            }
            System.out.println(""); 
        }
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] garden1 = {{1, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int ret1 = sol.solution(garden1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
        
    }    
}
```

썩 깔끔하진 않은 코드 라서 맘에 들진 않지만, 
상하좌우 좌표 탐색 하는 요령을 복습하였다는 것에 의미를 둡시다. 
