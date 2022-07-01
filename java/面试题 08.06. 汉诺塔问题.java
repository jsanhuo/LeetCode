class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        int n = A.size();
        fun(n,A,B,C);
    }
    public void fun(int n ,List<Integer> A, List<Integer> B, List<Integer> C){
        if(n==1){
            int t = A.remove(A.size()-1);
            C.add(t);
            return;
        }
        fun(n-1,A,C,B);
        fun(1,A,B,C);
        fun(n-1,B,A,C);
    }
}