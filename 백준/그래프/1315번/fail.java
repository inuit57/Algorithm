import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 * https://www.acmicpc.net/problem/2606
	 *  메모리 초과로 실패, 다른 방법을 찾자.
	 * 
	 */
    private static int N, M ;
    
    private static int map[][];
    
    
    private static void floid() {
    	for(int visit_point = 0 ; visit_point < N; visit_point++) {
    		for(int start =0 ; start < N ; start++) {
				for(int end =0 ; end < N ; end++) {
					if( map[start][visit_point]== 1 && map[visit_point][end] == 1) {
						map[start][end] = 1; 
					}
	    		}
    		}
    	}
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][N];
		
		for(int i= 0 ; i< M ; i++) {
			st = new StringTokenizer(br.readLine());
			int end = Integer.parseInt(st.nextToken()) -1;
			int start = Integer.parseInt(st.nextToken()) -1;
			
			map[start][end] = 1;
		}
				
		floid(); 

		List<Integer> sumList = new LinkedList<Integer>();   
		
		int maxSum = -1; 
		for(int key =0 ; key < N ; key++) {
			int sum =0 ; 
			for(int i= 0 ; i< N ; i++) {		
				sum += map[key][i]; 
			}
			
			sumList.add(sum); 
			
			if(maxSum < sum) {
				maxSum = sum ; 
			}
		}
		
		for(int i =0 ; i < N ; i++) {
			if(sumList.get(i) == maxSum) System.out.print((i+1)+" ");
		}
		
		
	}
	
}
