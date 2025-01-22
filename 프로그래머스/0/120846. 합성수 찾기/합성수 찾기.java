class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1 ; i <= n ; i++ ) {
            int num = i;
            boolean empty = true;
            int cnt = 0;
            while((num != 0) && i > 3 && empty) {
                if (i % 2 == 0) {
                    num = num / 2;
                    cnt++;
                } else if (i % 3 == 0) {
                    num = num / 3;
                    cnt++;
                } else if (i % 5 == 0) {
                    num = num / 5;
                    cnt++;
                } else if (i % 7 == 0) {
                    num = num / 7;
                    cnt++;
                } else {
                    empty = false;
                }
            }
            if (cnt >= 3) {
                answer++;
            }
        }
        
        return answer;
    }
}