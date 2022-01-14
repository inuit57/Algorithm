import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 * https://www.acmicpc.net/problem/11403
	 * 
	 * 
	 */
    private static int N ;
    
    private static int map[][];
    
    
    private static void floid() {
    	for(int visit_point = 0 ; visit_point < N; visit_point++) {
    		for(int start =0 ; start < N ; start ++) {
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

		map = new int[N][N];
		
		for(int i= 0 ; i< N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j= 0 ; j< N ; j++) {
				int input = Integer.parseInt(st.nextToken());
				map[i][j] = input; 
			}
		}
				
		floid(); 
		
		for(int i= 0 ; i< N ; i++) {		
			for(int j= 0 ; j< N ; j++) {
				System.out.print(map[i][j] +" ");
			}
			System.out.println();
		}
		
	}
	
}
