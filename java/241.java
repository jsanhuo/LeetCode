class Solution {
    HashMap<String,List<Integer>> map = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        return fun(expression);
    }
    public List<Integer> fun(String expression){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(isNumber(expression)){
            result.add(Integer.parseInt(expression));
            return result;
        }
      
        List<Integer> left = null;
        List<Integer> right = null;
        String lString=null,rString =null;
        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            switch (c){
                case '+':
                lString = expression.substring(0,i);
                rString = expression.substring(i+1,expression.length());
                left = map.getOrDefault(lString,null);
                if(left ==null){
                    left = fun(lString);
                    map.put(lString,left);
                }
                right = map.getOrDefault(rString,null);
                if(right ==null){
                    right = fun(rString);
                    map.put(rString,right);
                }
                result.addAll(fun1(left,right,'+')); 
                break;
                case '-':
                lString = expression.substring(0,i);
                rString = expression.substring(i+1,expression.length());
                left = map.getOrDefault(lString,null);
                if(left ==null){
                    left = fun(lString);
                    map.put(lString,left);
                }
                right = map.getOrDefault(rString,null);
                if(right ==null){
                    right = fun(rString);
                    map.put(rString,right);
                }
                result.addAll(fun1(left,right,'-'));  
                break;
                case '*':
                lString = expression.substring(0,i);
                rString = expression.substring(i+1,expression.length());
                left = map.getOrDefault(lString,null);
                if(left ==null){
                    left = fun(lString);
                    map.put(lString,left);
                }
                right = map.getOrDefault(rString,null);
                if(right ==null){
                    right = fun(rString);
                    map.put(rString,right);
                }
                result.addAll(fun1(left,right,'*'));      
                break;
            }
        }
        return result;
    }
    public boolean isNumber(String a){
        for(int i=0;i<a.length();i++){
            if(!Character.isDigit(a.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public List<Integer> fun1(List<Integer> a,List<Integer> b,char option){
        ArrayList<Integer> result = new ArrayList<Integer>();
        switch (option){
            case '+':
            for(int i=0;i<a.size();i++){
                for(int j=0;j<b.size();j++){
                    result.add(a.get(i)+b.get(j));
                }
            }
            break;

            case '-':
            for(int i=0;i<a.size();i++){
                for(int j=0;j<b.size();j++){
                    result.add(a.get(i)-b.get(j));
                }
            }
            break;

            case '*':
            for(int i=0;i<a.size();i++){
                for(int j=0;j<b.size();j++){
                    result.add(a.get(i)*b.get(j));
                }
            }
            break;
        }
            
        return result;
    }
    
}