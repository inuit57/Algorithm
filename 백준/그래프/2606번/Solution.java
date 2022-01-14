import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 * https://www.acmicpc.net/problem/2606
	 * 
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
		
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][N];
		int sum =0; 
		
		for(int i= 0 ; i< M ; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) -1;
			int end = Integer.parseInt(st.nextToken()) -1;
			
			map[start][end] = 1;
			map[end][start] = 1;
			
		}
				
		floid(); 
		
		
		for(int i= 0 ; i< N ; i++) {		
			sum += map[0][i]; 
		}
		System.out.println(sum-1);
	}
	
}
