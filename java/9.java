//time:10ms;memory:38MB
class Solution {
	public static boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
		if(x<0|x%10==0) {
			return false;
		}
		int re = 0;
		int temp = x;
		while(temp>0) {
			re = re*10+temp%10;
			temp/=10;
		}
		if(re==x) {
			return true;
		}
        return false;
    }
}