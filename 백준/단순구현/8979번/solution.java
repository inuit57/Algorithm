import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 * https://www.acmicpc.net/problem/8979
	 * 
	 */
    private static int N , M;
	
    public static class Nation{
    	int num ; // 국가번호
    	int gold ; // 금메달 갯수
    	int silv; 
    	int bron; 
    	
    	int rank = 1 ;
    	
    	public Nation(int num, int gold, int silv, int bron) {
    		this.num = num; 
    		this.gold = gold;
    		this.silv = silv; 
    		this.bron = bron;
    		this.rank = 1; 
    	}
    	
    	@Override
    	public String toString() {
    		return "num = "+num ; 
    	}
    	
    	public boolean isEqual(Nation n2) {
    		if( this.gold != n2.gold) {
    			return false; 
    		}else if( this.silv != n2.silv ) {
    			return false;
    		}else if( this.bron != n2.bron) {
    			return false; 
    		}
    		return true; 
    	}
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken()); 
		
		Nation[] natArr = new Nation[N];
		
		int maxGold = -1; 
		int goldRank = 1; 
		
		
		
		
		ArrayList<Nation> arr = new ArrayList<Main.Nation>(); 
		
		for(int i =0 ; i< N ; i++) {
			st = new StringTokenizer(br.readLine()); 
			int num = Integer.parseInt(st.nextToken());
			int gold = Integer.parseInt(st.nextToken());
			int silv = Integer.parseInt(st.nextToken());
			int bron = Integer.parseInt(st.nextToken());
			
			arr.add(new Nation(num, gold, silv, bron)); 
			
//			natArr[i] = new Nation(num, gold, silv, bron);
//			
//			if(maxGold > natArr[i].gold) { // 금에 해당되는 순위 설정
//				natArr[i].rank++; 
//				goldRank ++; 
//			}else {
//				maxGold = natArr[i].gold; 
//			}
		}
		
		
		arr.sort(new Comparator<Main.Nation>() {
			
			@Override
			public int compare(Main.Nation o1, Main.Nation o2) {
				if(o1.gold != o2.gold) {
					return o2.gold - o1.gold; 
				}else if( o1.silv != o2.silv) {
					return o2.silv - o1.silv; 
				}else { 
					return o2.bron - o1.bron; 
				}
			}
		});
		
		
		
		
		
		for(int i=1 ; i< N ; i++) {
			if( arr.get(i).isEqual(arr.get(i-1))) {
				arr.get(i).rank = arr.get(i-1).rank ; 
			}else {
				arr.get(i).rank = i+1;
			}

		}
		
		for(int i=0 ; i < N ; i++) {
			//System.out.println(arr.get(i).num + ":" + arr.get(i).rank);
			if(arr.get(i).num == M) {
                System.out.println(arr.get(i).rank);
			}
		}
		//System.out.println(natArr[M-1].rank);
		
	}
	
}
