import java.util.* ; 

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
                   
    //정렬함수를 만들어서 처리해야 한다. 
    // 맨앞의 숫자부터 비교해서 큰 순서대로 정렬해야 한다. 
    // 1) 첫자리를 비교해서 큰 놈이 앞으로 온다. 
    // 2) 첫자리가 같은 경우 다음 자리를 비교해서 큰 놈이 앞으로 온다. 
    // 3) 차이가 날 때까지 반복한다. 
    // 4) 만약 다음 자리가 없다면 없는 놈을 앞으로 놓는다. 
    
    // 9999 vs 90 을 생각해본다. 9999가 먼저 오는게 맞다. 
    // 9 vs 9999 를 생각해본다. 상관없다. 
    // 5 vs 9999 를 생각해본다. 9999가 앞으로 와야 한다. 
    // 999 vs 9998 을 생각해본다. 999가 앞으로 와야 한다. 
    
        Collections.sort(numbers , new Comparator<int[]>() { //이렇게 하니까 에러가 난다. 
          //그냥 통째로 String 배열에 때려박아버리고 처리하는 걸 생각해보자. 
            @Override
            public int compare(int a, int b) {
                String as , bs ; 
                as = bs = ""; 
                
                //문자열로 바꾸고 문자열에서 한글자씩 따서 처리
                as +=a; 
                bs +=b; 
                
                if(as.length() >= bs.length){
                    for(int i = 0 ; i < bs.length ; i++){
                        if(as.charAt(i) > bs.charAt(i)){
                            return 1; 
                        }else if(as.charAt(i) < bs.charAt(i)){
                            return -1 ; 
                        }
                    }
                    return -1 ; 
                }else{
                    for(int i = 0 ; i < as.length ; i++){
                        if(as.charAt(i) > bs.charAt(i)){
                            return 1; 
                        }else if(as.charAt(i) < bs.charAt(i)){
                            return -1 ; 
                        }
                    }
                    return 1 ;
                }
                
            }
} );
  
     System.out.println("%d", numbers[i]);        
        return answer;
    }
}
