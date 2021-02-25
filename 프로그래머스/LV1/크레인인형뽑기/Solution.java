class Solution {
    
    public int search(int[][] board, int line){
        int res = 0 ; 
        for(int i=0 ; i < board.length ; i++){  // board.length , board[x].length 의 차이를 잘 알아둘 것.
            if(board[i][line-1] != 0 ) {
                res = board[i][line-1] ; 
                board[i][line-1]  = 0 ; 
                break; // break를 해줘야한다. 안 그러면 맨 밑까지 탐색된다. 
            }
        }
        return res; 
    }
    
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        int[] arr = new int[1001]; 
        int pt = 1 ; 
        int res = 0; 
        
//         for(int i = 0 ; i< moves.length ; i++){
//             res =  search(board, moves[i]); 
            
//             System.out.println(res); 
//         }
        
        
        arr[0] = search(board, moves[0]); 
        for(int i = 1 ; i< moves.length ; i++){
            res =  search(board, moves[i]); 
            //System.out.println(i+")"+ res); 
            if ( res != 0 ){
                if(arr[pt-1] != res){
                    //System.out.println(arr[pt]+","+ res); 
                    arr[pt] = res; 
                    
                    pt++; 
                    res = 0 ; 
                }else{
                    arr[pt-1] = 0; 
                    if(pt > 1) pt--; 
                    answer+=2; 
                }
            }
        }
        
        
        return answer;
    }
}
