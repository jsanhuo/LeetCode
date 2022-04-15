/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    public NestedInteger deserialize(String s) {
        if (s.charAt(0) != '[') {
            return new NestedInteger(Integer.parseInt(s));
        }
        StringBuilder temp = new StringBuilder();
        Stack<NestedInteger> stack1 = new Stack<NestedInteger>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                stack1.add(new NestedInteger());
            }else if(s.charAt(i)==']'){
                if(temp.length()!=0){
                    int x = Integer.parseInt(temp.toString());
                    temp = new StringBuilder();
                    stack1.peek().add(new NestedInteger(x));
                }
                if(stack1.size()>1){
                    NestedInteger p = stack1.pop();
                    stack1.peek().add(p);
                }
            }else if(s.charAt(i)==','){
                if(temp.length()!=0){
                    int x = Integer.parseInt(temp.toString());
                    temp = new StringBuilder();
                    stack1.peek().add(new NestedInteger(x));
                }else{
                    temp = new StringBuilder();
                }
            }else{
                temp.append(s.charAt(i));
            }
        }
        return stack1.pop();
    }
}