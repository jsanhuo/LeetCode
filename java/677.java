class MapSum {
    private HashMap<String,Integer> map = null;
    public MapSum() {
        map = new HashMap<String,Integer>();
    }
    
    public void insert(String key, int val) {
        map.put(key,val);
    }
    
    public int sum(String prefix) {
        int ret = 0;
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getKey().indexOf(prefix)==0){
                ret += e.getValue();
            }
        }
        return ret;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */