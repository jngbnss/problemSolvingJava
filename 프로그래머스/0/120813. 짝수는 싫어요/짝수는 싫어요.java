import java.util.*; // ✅ List, ArrayList 사용을 위해 추가

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i += 2) {
            answer.add(i); // 홀수만 추가
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
