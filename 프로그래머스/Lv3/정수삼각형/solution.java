import java.util.*; 

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        int lastRow = triangle.length -1 ; 
        
        //System.out.println(lastRow);  // 5 
        
        for(int i =1 ; i<= lastRow ; i++ ){
            for(int j=0 ; j< triangle[i].length ; j++){
                if( j == 0 ) triangle[i][j] += triangle[i-1][j]; 
                else if(j == triangle[i].length -1){
                    triangle[i][j] += triangle[i-1][j-1] ;
                }else{
                    // System.out.println( "j : " + j); 
                    // System.out.println(triangle[i-1][j]); 
                    triangle[i][j] += Math.max(triangle[i-1][j],triangle[i-1][j-1]); 
                }
            }
        }
        
        for(int i =0 ; i< triangle[lastRow].length ; i++){
            if(answer < triangle[lastRow][i] ){
                answer = triangle[lastRow][i]; 
            }
        }
        return answer;
    }
}
