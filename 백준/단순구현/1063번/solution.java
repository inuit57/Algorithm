import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	/*
	 * https://www.acmicpc.net/problem/1063
	 * 
	 */
    private static int N;
	
    public static class Position{
    	char a_x;
    	int n_y;
    	String name ; 
    
    	public Position(String pos , String name) {
    		a_x = pos.charAt(0); 
    		n_y = pos.charAt(1) - 48;
    		this.name = name; 
    	}
    	
    	public boolean move(String cmd) {
    		char tmp_x = a_x; 
    		int tmp_y = n_y;
    		
    		for(char ch : cmd.toCharArray()) {
	    		switch(ch) {
	    		case 'R' :
	    			tmp_x++; break;
	    		case 'L' :
	    			tmp_x--; break;
	    		case 'B' :
	    			tmp_y--; break;
	    		case 'T' :
	    			tmp_y++; break;
	    		}
    		}
    		
    		
    		if( ('A' <= tmp_x && tmp_x <= 'H') && (1 <= tmp_y && tmp_y <=8)) {
    			a_x = tmp_x; 
    			n_y = tmp_y;
    			return true; 
    		}else {
    			//System.out.println(name + " FAIL");
    			return false; 
    		}
    	}
    	
    	public char getAX() {
    		return a_x; 
    	}
    	public int getNY() {
    		return n_y; 
    	}
		
    	
    	public boolean equals(Position p2) {
    		return (p2.a_x == this.a_x) && (p2.n_y == this.n_y); 
    	}
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String pos1,pos2 ; 
		pos1 = st.nextToken(); 
		pos2 = st.nextToken();
		
		
		Position king = new Position(pos1, "KING");
		Position stone = new Position(pos2 , "STONE"); 
		
		//System.out.println(king.getAX()+""+king.getNY());
		//System.out.println(stone.getAX()+""+stone.getNY());	
	
		
		N = Integer.parseInt(st.nextToken()); 
		
		for(int i=0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());  
			String cmd = st.nextToken();
			
			char before_x = king.getAX();
	    	int before_y = king.getNY(); 
			
			if(king.move(cmd) && king.equals(stone)) {
				if(!stone.move(cmd)) {
					king.a_x = before_x; 
					king.n_y = before_y; 
				}
			}
		}
		
		//king.getAX()+""+king.getNY()
		
		System.out.println(king.getAX()+""+king.getNY());
		System.out.println(stone.getAX()+""+stone.getNY());
		
	}
	
}
