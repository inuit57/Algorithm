import java.util.*; 
class Solution {
    
    static int[] unf; 
    
    public int find(int v){
        if( unf[v] == v ) return v ; 
        else{ 
            return (unf[v] = find(unf[v])); 
        }
    }
    
    public void union(int a, int b){
        int x = find(a) ; 
        int y = find(b); 
        if( x != y ){
            unf[x] = y ; 
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        // 컴퓨터 저장용 배열 
        unf = new int[n] ; 
        for(int i =0 ; i< n ; i++){
            unf[i] = i ; //초기화 수행 
        }
        
        for(int i =0 ; i< n ; i++){
            for(int j=0 ; j< n ; j++){
                if( i == j ) continue;  // 자기 자신인 경우 넘기기
                
                // 연결관계인 경우 설정 
                if( computers[i][j] == 1){ 
                    union(i,j) ; 
                }
            }
        }
        
        Set<Integer> set = new HashSet<Integer>(); 
        for(int i =0 ; i< n ; i++){
            set.add(find(unf[i])); 
        }
        
        answer = set.size(); 
        
        return answer;
    }
}
