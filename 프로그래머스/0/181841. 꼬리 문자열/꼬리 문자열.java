class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (String txt : str_list) {
            if (txt.contains(ex)) {
                answer += "";
            } else {
                answer += txt;
            }
        }
        return answer;
    }
}