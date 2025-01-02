import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] bucket = {};
        if (binomial.contains("+")) {
            bucket = binomial.split(" ");
            answer = Integer.parseInt(bucket[0]) + Integer.parseInt(bucket[2]);
        } else if (binomial.contains("-")) {
            bucket = binomial.split(" ");
            answer = Integer.parseInt(bucket[0]) - Integer.parseInt(bucket[2]);
        } else {
            bucket = binomial.split(" ");
            answer = Integer.parseInt(bucket[0]) * Integer.parseInt(bucket[2]);
        }
        return answer;
    }
}