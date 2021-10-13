//time:10ms;memory:40.1MB
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i = 1;i<=n;i++){
            String a = "";
            if(i%3==0){
                a += "Fizz";
            }
            if(i%5==0){
                a += "Buzz";
            }
            if(i%3!=0&&i%5!=0){
                a += i;
            }
            result.add(a);
        }

        return result;
    }
}