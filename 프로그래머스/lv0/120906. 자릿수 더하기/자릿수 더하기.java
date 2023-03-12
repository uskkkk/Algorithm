class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String st = n + "";
        String[] splits = st.split("");
        
        for(int i = 0; i < splits.length ; i++ ) {
            answer += Integer.parseInt(splits[i]);
        }
        return answer;
    }
}