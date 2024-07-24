import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int negativeNumberMul = numbers[0] * numbers[1];
        int positiveNumberMul = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        if (negativeNumberMul > positiveNumberMul) {
            return negativeNumberMul;
        }
        
        return positiveNumberMul;
    }
}