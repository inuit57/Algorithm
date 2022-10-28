import java.util.*; 

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int[] arr = new int[10001] ;
        
        for(int i =0 ; i< citations.length ; i++){
            for(int j=1; j<= citations[i] ; j++ ){
                arr[j] ++; 
            }
        }
                
        for(int i =0 ; i< citations.length ; i++){
            int chk = arr[citations[i]]; 
            //System.out.println( chk + " : " + citations[i] );
            if( chk  > answer && citations[i] >= chk ){
              answer =chk ;   
            } 
        }
        
        
        return answer;
    }
}
