class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price>=500000) answer =(int) 80*price;
        else if(price>=300000)answer = (int)90*price;
        else if(price>=100000)answer = (int)95*price;
        else return price;
        answer*=0.01;
        return answer;
    }
}