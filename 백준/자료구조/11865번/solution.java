import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 * https://www.acmicpc.net/problem/11866
	 * 
	 * 
	 */
    private static int N ,M ;
    
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N]; 
		int size = N ;
		int idx = M-1 ; 
		
		String answer = "<"; 
		
		for(int i =0 ; i< N ; i++) {
			arr[i] = i +1; 
		}
		
		
    // size -1 번까지만 진행하는 것이 유효했다. 
		for(int i = 0 ; i< size-1 ; i++) {
			//System.out.println(arr[idx]);
			answer += arr[idx];  
			answer +=", " ;
			arr[idx] = 0 ;  // 뽑아낸 값은 0으로 표시
			
			for(int j =0 ; j< M ; j++) {
				idx = (idx +1) % N ; 
				
        // 0이 아닌 값을 만날 때까지 루프를 벗어나지 못하도록 설정
        // 그래서 size번째에서는 모두 0이 되어버려서 무한 루프에 걸리므로 size-1로 처리
				if (arr[idx] == 0 ) {
					j--; 
				}
			} 
		}
		answer += arr[idx] ;
		answer +=">"; 
		
		System.out.println(answer);
	}
	
}
