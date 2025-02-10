class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for (int i = 0 ; i < myString.length() ; i++ ) {
            String dummy = "";
            for (int j = 0 ; j < pat.length() ; j++ ) {
                if (myString.length() > i+j) {
                    dummy += myString.charAt(i+j);
                }
            }
            if (dummy.equals(pat)) {
                answer++;
            }
        }
        return answer;
    }
}