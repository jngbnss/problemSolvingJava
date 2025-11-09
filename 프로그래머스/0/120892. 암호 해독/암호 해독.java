class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int st = code-1;
        for(int i=st;i<cipher.length();i+=code){
            answer+=cipher.charAt(i);
        }
        
        return answer;
    }
}