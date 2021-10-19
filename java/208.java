public class Trie {
    //前缀树节点
    public class TrieNode{
        //路过当前节点的单词数目
        public int path;
        //以此为结尾的单词数目
        public int end;
        //当前节点所能链接到的节点
        public HashMap<Character, TrieNode> next;

        public TrieNode(){
            path = 0;
            end = 0;
            next = new HashMap<>();
        }
    }


    private TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        if(word == null || word.equals(""))  return ;
        TrieNode node = root;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(!node.next.containsKey(ch)) {
                node.next.put(ch,new TrieNode());
            }
            node = node.next.get(ch);
            //路过此节点一次
            node.path++;
        }
        //单词结束，最后一个节点的end加1
        node.end++;
    }

    public boolean search(String word){
        if(word == null || word.equals("")) return false;
        TrieNode node = root;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(!node.next.containsKey(ch)) return false;
            node = node.next.get(ch);
        }
        //如果结尾不为0，那么不是一个单词
        if(node.end == 0) return false;
        return true;
    }
    public boolean startsWith(String word){
        //和查找相同，只是不用判别end
        if(word == null || word.equals("")) return false;
        TrieNode node = root;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(!node.next.containsKey(ch)) return false;
            node = node.next.get(ch);
        }
        return true;
    }
}


/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */