import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 * https://www.acmicpc.net/problem/2563
	 * 
	 */
    private static int N ;
	
   
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		
		int[][] dict = new int[101][101]; 
		int answer = 0 ; 
		
		for(int i =0 ; i< N ; i++) {
			st = new StringTokenizer(br.readLine());
			int x =  Integer.parseInt(st.nextToken());
			int y =  Integer.parseInt(st.nextToken());
			
			for(int k= 0 ; k< 10; k++) {
				for(int j =0 ; j<10; j++) {
					dict[x+k][y+j] = 1; 
				}
			}
		}
		
		for(int i =0 ; i< 100 ; i++) {
			for(int j =0 ; j< 100; j++) {
				answer += dict[i][j]; 
			}
		}
		
		System.out.println(answer);
	}
	
}
