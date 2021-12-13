import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 * https://www.acmicpc.net/problem/3048
	 * 
	 * Char Array 형태로 변환해서 진행하는 것이 더 좋을 수도? 
	 */
    private static int N, M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());   
		
		M = Integer.parseInt(st.nextToken()); 
		
		st = new StringTokenizer(br.readLine());
		StringBuilder ant_1 = new StringBuilder(st.nextToken());

		st = new StringTokenizer(br.readLine());
		StringBuilder ant_2 = new StringBuilder(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());


		StringBuilder answer = ant_1.reverse().append(ant_2);
		
		char[] ch_arr = answer.toString().toCharArray(); 
		System.out.println(ch_arr);
		char ch_swap ; 
		
		ant_2 = ant_2.insert(0, '+'); 
		
		int start = 0 ; 
		int end = ch_arr.length -1 ; 
		
		for (int i = 0; i < t; i++) {
			if( i >= N) {start++;}
			if( i >= M) {end --; }
			for(int j = start ; j < end ; j++) {
				// 각각 다른 그룹에 속한 경우 위치를 바꿔준다.
				if( ant_2.indexOf(ch_arr[j]+"") * ant_2.indexOf(ch_arr[j+1]+"") < 0  ) {
					ch_swap = ch_arr[j]; 
					ch_arr[j] = ch_arr[j+1] ; 
					ch_arr[j+1] = ch_swap; 
					j++; 
				}
			}
			//System.out.println(ch_arr);
		}
	    		  
	    System.out.println(ch_arr);
	}
}
