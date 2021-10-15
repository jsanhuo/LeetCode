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
//time:8ms;memory:38.3MB
class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String a = "1";
        for(int i=2;i<=n;i++){
            a = desc(a);
        }
        return a;
    }
    public String desc(String a){
        char[] aa = a.toCharArray();
        StringBuilder sb = new StringBuilder();
        int num = 1;
        char x = aa[0];
        for(int i=1;i<aa.length;i++){
            if(x!=aa[i]){
                sb.append(num+""+x);
                num = 1;
                x = aa[i];
            }else{
                num++;
            }
        }
        sb.append(num+""+x);
        return sb.toString();
    }
}