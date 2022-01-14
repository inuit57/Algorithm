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
	 * 
	 * 
	 */
    private static int N, M ;
    
    private static int map[][];
    
    
    
    private static int visits[] ; 
    public static void dfs(int next , int depth) {
    
    	if( depth == 2 || visits[next] == 1) return ; 
    	for(int i =0 ; i < N ; i++) {
    		if( map[next][i] == 1) {    		
    			visits[i] = 1;
    			dfs(i, depth+1);    			
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
		visits = new int[N] ; 
		
    visits[0] = 1; 
    
		for(int i= 0 ; i< M ; i++) {
			st = new StringTokenizer(br.readLine());
			int end = Integer.parseInt(st.nextToken()) -1;
			int start = Integer.parseInt(st.nextToken()) -1;
			
			map[start][end] = 1;
			map[end][start] = 1;
		}
		

		dfs(0, 0); 
		int answer = 0; 
		for(int i =1 ; i < N ; i++) {
			answer += visits[i]; 
			
			//if( visits[i] > 0) System.out.println("visist: " + (i+1));
		}
		
		System.out.println(answer);
		
	}
	
}
