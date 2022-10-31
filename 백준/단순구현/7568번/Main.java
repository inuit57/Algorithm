import java.util.*; 
public class Main {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
        
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); 
        
        int[] answer = new int[n]; 
        int[][] arr = new int[n][2]; 
        
        for(int i=0 ; i< n ;i++){
            answer[i] = 1;  // 초기화 
            
            int w = in.nextInt(); 
            int h = in.nextInt(); 
            arr[i][0] = w; 
            arr[i][1] = h; 
        }
        
        for(int i=0; i< n ; i++){
            int ow = arr[i][0]; 
            int oh = arr[i][1]; 
            for(int j=0; j< n ;j++){
                if( i == j )continue; 
                int tw = arr[j][0]; 
                int th = arr[j][1]; 
                
                if( tw > ow && th > oh ){
                    answer[i] ++; 
                }
            }
        }
        
        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i< n ; i++){
            sb.append(answer[i]); 
            sb.append(" "); 
        }
        System.out.println(sb.toString()) ; 
        
	}
}
