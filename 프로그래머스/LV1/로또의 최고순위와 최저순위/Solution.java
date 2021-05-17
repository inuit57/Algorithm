class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zero_cnt = 0 ; 
        int check = 0 ; 
        
        for(int i =0 ; i< 6; i++){
            if(lottos[i] == 0) zero_cnt ++ ; 
            else{
                for(int j= 0 ; j < 6 ; j++){
                    if(lottos[i] == win_nums[j]){
                        check++; 
                    }
                }
            }
        }
        
        answer[0] = (7 - (zero_cnt+check)) ;
        if( answer[0] > 6) answer[0] = 6; 
        
        
        answer[1] = (7 - check) ; 
        if(answer[1] > 6) answer[1] = 6; 
        
        return answer;
    }
}
