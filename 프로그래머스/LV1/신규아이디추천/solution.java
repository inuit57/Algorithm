class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        new_id = new_id.toLowerCase(); 
        
        //answer = new_id.replaceAll("\\W", ""); 
        answer = new_id.replaceAll("[^0-9a-z._-]",""); 
        // \\w를 써도 되긴한다.(a-z0-9_)
        answer = answer.replaceAll("[.]{2,}","."); // . 2개 이상 반복 하나로
        answer = answer.replaceAll("^(\\.)", ""); // 처음 . 지우기
        answer = answer.replaceAll("(\\.)$", ""); // 끝 . 지우기
        
        answer = "".equals(answer) ? "a" : answer ; 
        answer = answer.length() >= 16 ? answer.substring(0,15) : answer ; 
        answer = answer.replaceAll("(\\.)$", ""); // 끝 . 지우기
        
        if (answer.length() <= 2 ){
            char last_wd = answer.charAt(answer.length()-1); 
            answer += last_wd;
            answer += last_wd;
            answer = answer.substring(0,3); 
        }
        
        return answer;
    }
}
