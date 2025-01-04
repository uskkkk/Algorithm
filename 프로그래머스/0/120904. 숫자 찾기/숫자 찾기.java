class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String[] a = (num + "").split("");
        for (int i = 0 ; i < a.length; i++) {
            if(a[i].equals(String.valueOf(k))) {
                return i + 1;
            } 
        }
        if (answer == 0) {
            answer = -1;
        }
        return answer;
    }
}