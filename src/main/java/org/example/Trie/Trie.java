package org.example.Trie;

public class Trie {
    public TrieNode root;

    public Trie() {
        this.root = new TrieNode();
        System.out.println("The Trie has been created");
    }

    public void insert(String word) {
        TrieNode current = this.root;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println("Successfully inserted " + word + " in Trie");
    }
}
