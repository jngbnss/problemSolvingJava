class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int temp = box[0]/n;
        temp *= box[1]/n;
        temp*=box[2]/n;
        answer = temp;
        return answer;
    }
}