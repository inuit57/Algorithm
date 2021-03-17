class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] stu = new int[n+1] ; 
        for(int i =0 ; i< lost.length; i++){
            //System.out.println(stu[i]); 
            //0으로 초기화 되네 역시 
            stu[lost[i]] -= 1; // 도난 당한 애들은 -1 해주기
        }
        
        for(int i= 0 ; i< reserve.length ; i++){
            stu[reserve[i]] +=1; //여유 있는 애들 +1 해주기 
        }
        
        for(int i = 0 ; i< stu.length; i++){
            if(stu[i] == -1){
                if(stu[i-1] == 1){
                    stu[i] = 0 ; 
                    stu[i-1] = 0; // 일단 앞에 있는 애한테 먼저 묻기
                }else if(i < stu.length-1 && stu[i+1] == 1){
                    stu[i] = 0 ;
                    stu[i+1] = 0; 
                }
            }
        }
        
        for(int i =0 ; i<stu.length; i++){
            if(stu[i] <0 ){
                n--; 
            }
        }
        
        answer = n; 
        return answer;
    }
}
