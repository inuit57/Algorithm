```
class CodeRunner{
    
    public static int dp(int n){
        if( n == 0) return 1; 
        else if ( n < 0 ) return 0 ; 
        else{ 
            return dp(n-1) + dp(n-2) + dp(n-3) ; 
        }
    }
    
	public static void main(String[] args){
		System.out.println("Hello Java");
        
        System.out.println("3 : " + dp(3));
        
        System.out.println("4 : " + dp(4));
	}
}


```

- 계단은 한번에 1,2,3칸을 오를 수 있고
- 계단을 오를 수 있는 경우의 수를 구하는 문제 
- 순서가 뒤바뀌어도 되므로 그냥 DP로 가짓수를 새어주면 된다. 
