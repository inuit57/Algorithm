class Solution {
    public String solution(String s) {
        String answer = "";
        int arr[][] = new int[2][26] ; 
        
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i) ; 
            if ( 'a' <= ch && ch <= 'z') {
                arr[0][ch-'a'] ++ ; 
            }else{ //대문자.
                arr[1][ch-'A'] ++ ; 
            }
        }
        
        for(int i= 25 ; i >= 0 ; i--){
            for(int j = 0; j< arr[0][i] ; j++){
                answer += (char)('a'+i); 
            }
        }
        
        for(int i= 25 ; i >= 0 ; i--){
            for(int j = 0; j< arr[1][i] ; j++){
                answer += (char)('A'+i); 
            }
        }
        return answer;
    }
}
