class Solution {
    public String solution(int age) {
        String answer = "";
        
        String[] nums = (age + "").split("");
        
        for (int i = 0 ; i < nums.length ; i++ ) {
            answer += (char)(Integer.parseInt(nums[i]) + 97);
        }
        
        return answer;
    }
}