
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 * https://www.acmicpc.net/problem/2606
	 * 
	 * 
	 */
    private static int N, M ;
    
    public static int rev(int num ) {
    	
    	return Integer.parseInt(new StringBuffer(num+"").reverse().toString()) ;   
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		
		System.out.println(rev(rev(N)+rev(M)));
		
		
	}
	
}
