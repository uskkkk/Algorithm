class Solution {
    public int solution(String myString, String pat) {
        String[] result = myString.split("");
        for (int i = 0 ; i < result.length ; i++ ) {
            if (result[i].equals("A")) {
                result[i] = "B";
            } else {
                result[i] = "A";
            }
        }
        
        int answer = String.join("",result).contains(pat) ? 1 : 0;
        return answer;
    }
}