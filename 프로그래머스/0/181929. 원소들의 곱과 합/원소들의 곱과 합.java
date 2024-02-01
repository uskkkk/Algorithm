class Solution {
    public int solution(int[] num_list) {
        int add = 0;
        int times = 1;
        for (int i = 0 ; i < num_list.length ; i++ ) {
            add += num_list[i];
            times *= num_list[i];
        }
        add *= add;
        System.out.print(add + " , " + times);
        return add > times ? 1 : 0;
    }
}