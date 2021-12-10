import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	        StringTokenizer st = null ; //new StringTokenizer(br.readLine());
	       
	        String str = "DCBAE"; 
          /*
            0000 -> 윷(D)
            0001 -> 걸(C)
            0011 -> 개(B)
            0111 -> 도(A)
            1111 -> 모(E)
          */
	        
	        for(int i =0 ; i < 3; i++) {
		        st = new StringTokenizer(br.readLine());
		        int answer = 0; 
		        while(st.hasMoreTokens()) {
		        	int tmp = Integer.parseInt(st.nextToken());
		        	answer += tmp;
		        }
		        System.out.println(str.charAt(answer));
	        }
	       
	}

}
