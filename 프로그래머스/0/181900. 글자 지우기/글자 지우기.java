class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] sp = my_string.split("");
        
        for (int i = 0 ; i < indices.length ; i++ ) {
            sp[indices[i]] = "";
        }
        
        for (int j = 0 ; j < sp.length ; j++ ) {
            answer += sp[j];
        }
        
        return answer;
    }
}