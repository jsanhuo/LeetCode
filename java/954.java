class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            int num = map.get(arr[i]);
            if(num==0){
                continue;
            }
            int num1 = map.getOrDefault(arr[i]*2,0);
            int num2 = map.getOrDefault(arr[i]/2,0);
            // System.out.println(arr[i]+" "+num+" "+num1+" "+num2);
            if(num2!=0&&fun(arr[i])){
                map.put(arr[i],--num);
                map.put(arr[i]/2,--num2);
            }else if(num1!=0){
                map.put(arr[i],--num);
                map.put(arr[i]*2,--num1);
            }else{
                return false;
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            // System.out.println(e.getKey()+" "+e.getValue());
            if(e.getValue()!=0){
                return false;
            }
        }
        return true;
    }
    public boolean fun(int a){
        if((a/2)*2!=a){
            return false;
        }
        return true;
    }
}