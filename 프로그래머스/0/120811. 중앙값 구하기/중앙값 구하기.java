import java.util.*;
class Solution {
    public int solution(int[] array) {
        int ind = (array.length)/2;
        Arrays.sort(array);
        
        int answer = array[ind];
        return answer;
    }
}