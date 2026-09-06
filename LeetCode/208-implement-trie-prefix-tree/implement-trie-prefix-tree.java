class Trie {

    class Node {

        Node link[];
        boolean flag;

        Node() {
            link = new Node[26];
            flag = false;
        }

        boolean containsKey(char ch) {
            return link[ch - 'a'] != null;
        }

        void put(char ch, Node node) {
            link[ch - 'a'] = node;
        }

        Node get(char ch) {
            return link[ch - 'a'];
        }

        void setEnd() {
            flag = true;
        }

        boolean isEnd() {
            return flag;
        }

    }

    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {

        int len = word.length();
        Node curr = root;

        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);

            if (curr.containsKey(ch)) {
                curr = curr.get(ch);
            } else {
                curr.put(ch, new Node());
                curr = curr.get(ch);
            }

        }

        curr.setEnd();
    }

    public boolean search(String word) {
        int len = word.length();
        Node curr = root;

        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);

            if (curr.containsKey(ch)) {
                curr = curr.get(ch);
            } else {
                return false;
            }

        }

        return curr.isEnd();
    }

    public boolean startsWith(String prefix) {
        int len = prefix.length();
        Node curr = root;

        for (int i = 0; i < len; i++) {
            char ch = prefix.charAt(i);

            if (curr.containsKey(ch)) {
                curr = curr.get(ch);
            } else {
                return false;
            }

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