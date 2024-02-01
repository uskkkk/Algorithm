class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        }
        int add = 0;
        int add1 = 0;
        for (int i = 0 ; i < arr1.length ; i++ ) {
            add += arr1[i];
        }
        for (int i = 0 ; i < arr2.length ; i++ ) {
            add1 += arr2[i];
        }
        if (add > add1) {
            return 1;
        } else if (add < add1) {
            return -1;
        } else {
            return 0;
        }
    }
}