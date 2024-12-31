class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        Boolean a = arr.length % 2 == 0;
        
        for (int i = a ? 1 : 0 ; i < arr.length ; i = i + 2) {
            arr[i] = arr[i] + n;
        }
        return arr;
    }
}