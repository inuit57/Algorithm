class Solution {
    int max(int[][] land , int row, int index){
        int max = -1; 
        for(int i =0 ; i< 4; i++){
            if(i == index) continue; 
            if(max < land[row][i]){
                max = land[row][i] ; 
            }
        }
        return max; 
    }
    
    int solution(int[][] land) {
        int answer = 0;
        // System.out.println(land.length);  -> 행갯수 
        
        // 각각의 열에 들어갈 수 있는 최대 숫자를 계산하는 식으로 진행해보자 
        // 바로 위의 열을 제외한 3개의 열의 숫자 중에서 가장 큰 것을 더해주는 식으로 가면 될듯 하다. 
        
        for(int i = 1; i< land.length ; i++){
            land[i][0] += max(land, i-1 , 0 );
            land[i][1] += max(land, i-1 , 1 );
            land[i][2] += max(land, i-1 , 2 );
            land[i][3] += max(land, i-1 , 3 );
        }
        
        answer = max(land, land.length-1 , -1); 
        
        
        return answer;
    }
}
