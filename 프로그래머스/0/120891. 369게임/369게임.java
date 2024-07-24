class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String[] res = String.valueOf(order).split("");
        
        for (int i = 0 ; i < res.length ; i++ ) {
            if(Integer.parseInt(res[i]) % 3 == 0 && Integer.parseInt(res[i]) != 0) {
                answer += 1;
            }    
        }
        return answer;
    }
}