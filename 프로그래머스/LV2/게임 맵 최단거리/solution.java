import java.util.*; 

class Solution {
    
    int[] px = {1,0,-1,0}; 
    int[] py = {0,1,0,-1}; 
    
    static class Point{
        int x,y ; 
        Point(int x, int y){
            this.x = x; 
            this.y = y; 
        }
    }
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        int ox = maps.length - 1; 
        int oy = maps[0].length -1; 
        
        //System.out.println("ox : " + ox ); 
        //System.out.println("oy : " + oy ); 
                
        return answer = bfs(maps, ox, oy);
    }
    
    public int bfs(int[][] maps , int ox, int oy ){ 
    
        Queue<Point> que = new LinkedList<Point>(); 
        que.offer(new Point(0,0)); 
        
        int result = 1; 
        
        while(!que.isEmpty()){
            int len = que.size(); 
            for(int qi=0; qi< len ; qi++){            
                Point p = que.poll(); 
                int dx = p.x; 
                int dy = p.y; 
                
                if( ox == dx && oy == dy) return result; 

                for(int i=0 ; i< 4; i++){
                    dx = p.x + px[i]; 
                    dy = p.y + py[i];

                    if( dx >= 0 && dx <= ox && dy >=0 && dy <= oy && maps[dx][dy] == 1 ){
                        maps[dx][dy] = 2; 
                        que.offer(new Point(dx,dy)) ;                         
                    }
                }
            }
            result ++ ; 
        }
        
        return -1; 
        
    }
    
}
