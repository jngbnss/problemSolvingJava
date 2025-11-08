class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int gob=1;
        int hap=0;
        for(int i:num_list){
            gob *= i;
        }
        for(int i:num_list){
            hap += i;
        }
        hap*=hap;
        if(gob<hap) answer = 1;
        return answer;
    }
}