class MyCalendar {
    ArrayList<Integer> startl = new ArrayList<Integer>();
    ArrayList<Integer> endl = new ArrayList<Integer>();
    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        end --;
        for(int i=0;i<startl.size();i++){
            if(start>endl.get(i)||end<startl.get(i)) continue;
            return false;
        }
        startl.add(start);
        endl.add(end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */