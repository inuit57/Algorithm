import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 * https://www.acmicpc.net/problem/2980
	 * 
	 */
    private static int N, L;
	
    public static class TL{
    	int D ,R, G;
    	
    	public int getD() {
			return D;
		}

		public void setD(int d) {
			D = d;
		}

		public int getR() {
			return R;
		}

		public void setR(int r) {
			R = r;
		}

		public int getG() {
			return G;
		}

		public void setG(int g) {
			G = g;
		}

		// 빨간불 범위 : 0 ~ (R-1)
    	// 초록불 범위 : R ~ (R+G-1)
    	public TL(int D,int R, int G) {
    		this.D = D; 
    		this.R = R; 
    		this.G = G; 
    	}
    	
    	@Override
    	public String toString() {
    		return "D : "+this.D + ",R:"+this.R + ",G:"+this.G ; 
    	}
    }
    
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());   
		L = Integer.parseInt(st.nextToken()); 

		ArrayList<TL> traficList = new ArrayList<Main.TL>();
		for(int i=0 ; i< N ; i++) {
			st = new StringTokenizer(br.readLine());
			traficList.add(
					new TL(
							Integer.parseInt(st.nextToken()),
							Integer.parseInt(st.nextToken()),
							Integer.parseInt(st.nextToken()) 
							) 
					); 
		}

		int curr = 0; 
		int time = 0; 
		
		for(int i =0 ; i< N ; i++) {
			
			int currD = traficList.get(i).getD();
			int currR = traficList.get(i).getR();
			int currG = traficList.get(i).getG();
			
			int dis = currD - curr ;
			
			time += dis ;
			curr = currD; 
			
			int chk = (time % (currR+currG)) ; 
			if( chk < currR) { //red
        // chk <= currR 이어도 상관없이 통과된다. 
				time += (currR-chk); 
			}
			
		} //for문 끝
		
		
		time += (L-curr); 
		
		
    // 출력 형태에 대해서는 언제나 신경쓰도록 하자. 
		System.out.println(time);
		
	}
	
}
