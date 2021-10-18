public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    // Your code here!
    
    String[] temp = new String[3] ; 
    
    for(int i=0 ; i<temp.length; i++){
      temp[i] =""; 
    }
    
    for(int i =0 ; i< numbers.length-1 ; i++){
      temp[i/3] += numbers[i] ; 
    }
    
    temp[2] += numbers[9]; 
    
    return "("+temp[0]+") "+temp[1]+"-"+temp[2]; 
  }
}
