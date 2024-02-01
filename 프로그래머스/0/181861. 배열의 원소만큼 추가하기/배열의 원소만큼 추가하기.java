class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        
        for (int i = 0 ; i < arr.length ; i++ ) {
            cnt += arr[i];
        }
        
        int[] answer = new int[cnt];
        int a = 0;
        int b = 0;
        for (int k = 0 ; k < arr.length ; k++ ) {
            a += arr[k];
            for (int j = b ; j < a ; j++ ) {
                answer[j] = arr[k];
                b++;
            }
        }
        
        
        return answer;
    }
}