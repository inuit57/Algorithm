class Solution {
    
    boolean[] visits ; 
    int answer = Integer.MAX_VALUE ; 
    
    public int solution(String begin, String target, String[] words) {
        int result = 0;
        int len = words.length ; 
        visits = new boolean[len]; 
    
        boolean zeroFlag = true; 
        for(int i=0; i< len; i++){
            if( words[i].equals(target)){
                zeroFlag = false; 
                break; 
            }
        }
        
        if(zeroFlag){
            //System.out.println("its zero!! ");
            return 0 ; // 포함되지 않은 경우. 변환 불가능.   
        } 
        
        dfs( begin, target, words, 0) ; 
        
        result = answer; 
        
        return result;
    }
    
    public void dfs(String begin, String target, String[] words, int depth){
        
        if( target.equals(begin)){
            answer = Math.min(depth, answer); 
        }
        
        for(int i=0 ; i< words.length ;  i++){
            if( isChangable(begin, words[i]) && !visits[i] ){ 
                visits[i] = true; 
                dfs( words[i], target, words, depth+1); 
                visits[i] = false; 
            }
        }
        
    }
    
    public boolean isChangable(String word, String nextWord){
        int diffCount = 0 ; 
        for(int i =0 ; i< word.length() ; i++){
            if( word.charAt(i) != nextWord.charAt(i)) diffCount++; 
        }
        
        return (diffCount == 1) ; 
    }    
    
}
