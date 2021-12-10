import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/***
https://www.acmicpc.net/submit/10798/36198022

*/

public class Main {
	
	public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	        StringTokenizer st = null ;     
          // 자바 입력을 다른 방법으로 받아보는 연습을 진행해보았다. 
	        
    
	        ArrayList<String> strArr = new ArrayList<String>();  
          // 단순배열보다는 ArrayList에 저장하는 것이 권장된다. 
	        
	        for(int k =0 ; k< 5; k++) { // 최대 5줄 입력
	        	st = new StringTokenizer(br.readLine());
	        	String currStr = st.nextToken() ; 
	        	for(int i =0 ; i < currStr.length() ; i++) {
	        		if(strArr.size() <= i) {
		        		strArr.add(i,""+currStr.charAt(i));
                // 해당 위치에 값이 있는지를 확인해야 한다. 
                // get(index) 로는 값이 있는지 없는지 확인이 불가능하다. 만약 가져올 값이 없다면 get(index)함수는 OutOfIndexException을 던진다. 
                // Exception을 처리하는 방법도 있긴하지만, 이 방법으로 진행하는 편이 좀더 깔끔해보인다. 
	        		}else {
	        			String tmp = strArr.get(i);
	        			strArr.remove(i); 
	        			strArr.add(i, tmp + currStr.charAt(i)) ;
                // add(index, Object) 는 그 위치에 있는 값을 변경하는 것이 아니다. 그 위치에 "삽입"해준다. 
                // 따라서 해당 위치의 값을 일반적인 배열처럼 변경해주고 싶다면 제거를 먼저 수행한 뒤, 변경한 값을 넣어주자. 
	        		}
	        	}
	        }
	        
	        String answer = ""; 
	        for(int i =0 ; i < strArr.size() ; i++) {
	        	answer += strArr.get(i); 
	        }
	        
	        System.out.println(answer);
	}

}
