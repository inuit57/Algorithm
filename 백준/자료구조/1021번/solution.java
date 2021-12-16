import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 * https://www.acmicpc.net/problem/1021
	 * 
	 * 예제 데이터 추가 필요 : https://www.acmicpc.net/board/view/31847
	 */
    private static int N ,M ;
    
    private static class CircleQueue{
    	int size ; 
    	int index = 0; 
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	
    	public CircleQueue(int size) {
    		this.size = size; 
    		for(int i= 1 ; i<= size ; i++) {
    			list.add(i);
    		}
		}
    	
    	
    	public int getCurr() {
    		return list.get(index); 
    	}
    	
    	public int get(int idx) {
    		return list.get(idx); 
    	}
    	
    	public void remove() {
    		list.remove(index); 
    		size --; 
    		if ( index == size) index = 0 ;  // 이게 핵심 처리네 
    		
    	}
    	
    	public int move(int point) {
    		int left = leftMove(point) ;
    		int right = rightMove(point); 
    		
    		//System.out.println("left : " + left);
    		//System.out.println("right : " + right);
    		if ( left < right) {
    			index = (left + index)%size ; 
    			remove(); 
    			return left; 
    		}else {
    			index = (index - right +size)%size ; 
    			remove();
    			return right; 
    		}
    	}
    	
    	public int leftMove(int point) {
    		int tmp = this.index ;
    		int cnt = 0 ;
    		while ( get(tmp) != point) {
    			tmp = (tmp+1)%size ;
    			cnt ++; 
    		}
    		return cnt ; 
    	}
    	
    	public int rightMove(int point) {
    		int tmp = this.index ;
    		int cnt = 0 ;
    		while ( get(tmp) != point) {
    			tmp = (tmp-1 + size)%size ;
    			cnt ++; 
    		}
    		return cnt ; 
    	}
    	
    }
    
    
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int answer = 0;
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		
		CircleQueue cq = new CircleQueue(N);
		
		
		st = new StringTokenizer(br.readLine()) ;

		for(int i = 0 ; i< M ; i++) {
			int curr = Integer.parseInt(st.nextToken()); 
			
			if( cq.getCurr() != curr) { 
				answer += cq.move(curr);
//				System.out.println("idx:"+ cq.index);
//				System.out.println(answer);
				
			}else {
//				System.out.println("idx:"+ cq.index);
//				System.out.println(answer);
				cq.remove(); 
			}
		}
		
		System.out.println(answer);
		
		
	
	}
	
}
