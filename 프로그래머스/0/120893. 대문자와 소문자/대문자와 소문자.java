class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length() ; i++ ) {
            if (my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) {
                answer.append(String.valueOf(my_string.charAt(i)).toLowerCase());
            } else {
                answer.append(String.valueOf(my_string.charAt(i)).toUpperCase());
            }
        }
        return String.join("",answer);
    }
}