class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int hol = 0;
        int zzak = 0;
        
        for (int i = 0 ; i < num_list.length ; i = i + 2) {
            hol += num_list[i];
        }
        for (int j = 1 ; j < num_list.length ; j = j + 2) {
            zzak += num_list[j];
        }
        return hol > zzak ? hol : zzak;
    }
}