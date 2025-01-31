class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int num = 1;

        while (num < length) {
            num *= 2;
        }

        if (num == length) {
            return arr;
        }

        int[] answer = new int[num];
        System.arraycopy(arr, 0, answer, 0, length);

        return answer;
    }
}
