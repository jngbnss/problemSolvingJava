class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0]*numbers[1];
        for(int i=1;i<numbers.length;i++){
            for(int j=0;j<i;j++){
                answer = Math.max(answer,numbers[i]*numbers[j]);
            }
        }
        return answer;
    }
}