import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String target : s1) {
            if(Arrays.asList(s2).contains(target)) {
                answer++;    
            }
        }
        return answer;
    }
}