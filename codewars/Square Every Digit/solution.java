public class SquareDigit {

  public int squareDigits(int n) {
    // TODO Implement me
    
    String test = n+""; 
    String answer_s = ""; 
    
    for(int i = 0 ; i< test.length() ; i++){
        int i_str = test.charAt(i)-'0' ; 
        answer_s += (i_str * i_str) ;   
    }
    
    return Integer.parseInt(answer_s); 
    
  }

}
