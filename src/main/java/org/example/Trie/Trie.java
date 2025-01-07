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

    public boolean search(String word) {
        TrieNode current = this.root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.endOfString;
    }

    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;

        if (currentNode.children.size() > 1) {
           delete(currentNode, word, index + 1);
           return false;
        }

        if(index == word.length() - 1) {
            if (currentNode.children.size() >= 1) {
                currentNode.endOfString = false;
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }

        if (currentNode.endOfString) {
            delete(currentNode, word, index + 1);
            return false;
        }

        canThisNodeBeDeleted = delete(currentNode, word, index + 1);
        if (canThisNodeBeDeleted) {
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

    public void delete(String word) {
        if (search(word)) {
            delete(root, word, 0);
        }
    }
}
