package com.leetcode.task9;

public class Main {

    public static class Tree {
        private final Node root;

        public Tree(Node root) {
            this.root = root;
        }

        public Node dfsRecursive(int key) {
            return dfs(root, key);
        }

        private Node dfs(Node node, int key) {
            if (node == null) return null;
            if (node.key == key) return node;

            Node leftResult = dfs(node.leftChild, key);
            return leftResult != null ? leftResult : dfs(node.rightChild, key);
        }
    }

    public static class Node {
        public final int key;
        public final String data;
        public Node leftChild;
        public Node rightChild;

        public Node(int key, String data) {
            this.key = key;
            this.data = data;
        }
    }
}
