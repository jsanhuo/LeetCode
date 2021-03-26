//time:2ms;memory:36.1MB
class Solution {
    public String countAndSay(int n) {
    	if(n==1) {
    		return "1";
    	}
    	StringBuilder sb = new StringBuilder();
    	String pre = countAndSay(n-1);
    	char c = pre.charAt(0);
    	int num = 1;
    	for (int i=1;i<pre.length();i++) {
    		if(pre.charAt(i)==c) {
    			num++;
    		}else {
    			sb.append(num).append(c);
    			c = pre.charAt(i);
    			num=1;
    		}
    	}
    	sb.append(num).append(c);
    	return sb.toString();
    }
}