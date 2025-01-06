package org.example.BinaryTree.LL;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNode {
    public String value;
    public BinaryNode left;
    public BinaryNode right;
    public int height;

    public BinaryNode(String value) {
        this.value = value;
    }

    public static class BinaryTreeLL {
        public BinaryNode root;

        public BinaryTreeLL() {
            this.root = null;
        }

        public void preOrder(BinaryNode node) {
            if (node == null) return;
            System.out.println(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }

        public void inOrder(BinaryNode node) {
            if(node == null) return;
            inOrder(node.left);
            System.out.println(node.value + " ");
            inOrder(node.right);
        }

        public void postOrder(BinaryNode node) {
            if(node == null) return;
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.value + " ");
        }

        public void levelOrder() {
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

        public void insert(String value) {
            BinaryNode newNode = new BinaryNode(value);
            if(root == null) {
                root = newNode;
                System.out.println("Inserted new node at Root");
                return;
            }

            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                if(presentNode.left == null) {
                    presentNode.left = newNode;
                    System.out.println("Successfully Inserted");
                    break;
                } else if (presentNode.right == null) {
                    presentNode.right = newNode;
                    System.out.println("Successfully Inserted");
                    break;
                } else {
                    queue.add(presentNode.left);
                    queue.add(presentNode.right);
                }
            }
        }

        public BinaryNode getDeepestNode() {
            Queue<BinaryNode> queue = new LinkedList<>();
            BinaryNode presentNode = null;
            queue.add(root);
            while (!queue.isEmpty()) {
                presentNode = queue.remove();
                if(presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
            return presentNode;
        }

        public void deleteDeepestNode() {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            BinaryNode previousNode, presentNode = null;
            while (!queue.isEmpty()) {
                previousNode = presentNode;
                presentNode = queue.remove();
                if (presentNode.left == null) {
                    previousNode.right = null;
                    return;
                } else if (presentNode.right == null) {
                    presentNode.left = null;
                    return;
                }
                queue.add(presentNode.left);
                queue.add(presentNode.right);

            }
        }

        public void deleteNode(String value) {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                if(presentNode.value == value) {
                    presentNode.value = getDeepestNode().value;
                    deleteDeepestNode();
                    return;
                }

                if(presentNode.left != null) {
                    queue.add(presentNode.left);
                }

                if(presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }

        public void deleteBT() {
            root = null;
        }
    }
}
