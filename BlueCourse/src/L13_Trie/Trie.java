package L13_Trie;

public class Trie {
    private Node root;

    public Trie(){
        this.root = new Node();
    }

    public void addWord(String s, int value){
        Node temp = root;
        int pos = 0;
        for(int i = 0; i < s.length(); i++){
            pos = s.charAt(i) - 'a';
            if(temp.child[pos] == null){
                Node x = new Node();
                temp.child[pos] = x;
            }
            temp = temp.child[pos];
            temp.maxValue = Math.max(temp.maxValue, value);
        }
    }

    public int getMaxValue(String s){
        Node temp = root;
        int pos = 0;
        for(int i = 0; i < s.length(); i++){
            pos = s.charAt(i) - 'a';
            if(temp.child[pos] == null){
                return -1;
            }
            temp = temp.child[pos];
        }
        return temp.maxValue;
    }
}
