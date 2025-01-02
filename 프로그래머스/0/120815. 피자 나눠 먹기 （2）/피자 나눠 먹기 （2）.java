class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int max = 0; //최대 공약수
		
		for(int i = 1; i<=n && i<=6; i++) {
			if(n%i==0 && 6%i==0) {
				max = i;
			}
		}		
		
		int min = (n*6)/max;
        
        return min / 6;
    }
}