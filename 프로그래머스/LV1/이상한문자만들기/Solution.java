class Solution {
    public String solution(String s) {
        String answer = "";
        
        int j=0 ; 
        for(int i = 0 ; i< s.length() ; i++ ){
            char ch = s.charAt(i) ;  
            if( ch == ' '){
                answer += ' ' ; 
                j = 0 ; 
            }else if(j%2 == 0){
                if('a' <= ch && ch <= 'z'){
                    ch -= 32; 
                }
                answer += ch ; 
                j++ ;
            }else{
                if('A' <= ch && ch <= 'Z'){
                    ch += 32; 
                }
                answer += ch; 
                j++;
            } 
        
        }
        return answer;
    }
}
