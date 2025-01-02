package org.example;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();

        BinaryNode N1 = new BinaryNode("N1");
        BinaryNode N2 = new BinaryNode("N2");
        BinaryNode N3 = new BinaryNode("N3");
        BinaryNode N4 = new BinaryNode("N4");
        BinaryNode N5 = new BinaryNode("N5");
        BinaryNode N6 = new BinaryNode("N6");
        BinaryNode N7 = new BinaryNode("N7");
        BinaryNode N8 = new BinaryNode("N8");
        BinaryNode N9 = new BinaryNode("N9");

        N1.left = N2;
        N1.right = N3;

        N2.left = N4;
        N2.right = N5;

        N4.left = N8;
        N4.right = N9;

        N3.left = N6;
        N3.right = N7;

        binaryTree.root = N1;
//        binaryTree.postOrder(binaryTree.root);
//        binaryTree.levelOrder();
        binaryTree.search("N10");


























//        TreeNode drinks = new TreeNode("Drinks");
//        TreeNode hot = new TreeNode("Hot");
//        TreeNode cold = new TreeNode("Cold");
//        TreeNode tea = new TreeNode("Tea");
//        TreeNode coffee = new TreeNode("Coffee");
//        TreeNode wine = new TreeNode("Wine");
//        TreeNode beer = new TreeNode("Beer");
//        TreeNode tiger = new TreeNode("Tiger");
//        TreeNode hanoi = new TreeNode("Hanoi");
//
//        drinks.addChild(hot);
//        drinks.addChild(cold);
//
//        hot.addChild(tea);
//        hot.addChild(coffee);
//
//        cold.addChild(wine);
//        cold.addChild(beer);
//
//        beer.addChild(tiger);
//        beer.addChild(hanoi);
//
//        System.out.println(drinks.print(0));
    }
}