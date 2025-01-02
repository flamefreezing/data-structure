package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    void preOrder(BinaryNode node) {
        if (node == null) return;
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(BinaryNode node) {
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }

    void postOrder(BinaryNode node) {
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }

    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value);
            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if(presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            if(currentNode.value == value) {
                System.out.println("OK");
                return;
            }
            if(currentNode.left != null) queue.add(currentNode.left);
            if(currentNode.right != null) queue.add(currentNode.right);
        }
        System.out.println("NG");
    }
}
