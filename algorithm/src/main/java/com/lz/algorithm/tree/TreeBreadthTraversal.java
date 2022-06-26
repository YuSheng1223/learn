package com.lz.algorithm.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/***
 * 树的广度遍历
 */
public class TreeBreadthTraversal {

    /***
     * 基于队列的广度层序遍历
     * @param root
     */
    public static void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.data + " ");
            if (null != node.leftChild) {
                queue.offer(node.leftChild);
            }
            if (null != node.rightNode) {
                queue.offer(node.rightNode);
            }
        }
    }


    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<>(Arrays.asList(3, 2, 9, null, null, 10, null, null, 8, null, 4));

        TreeNode binaryTree = TreeDepthTraversal.createBinaryTree(inputList);
        System.out.println("层序遍历");

        levelOrderTraversal(binaryTree);

    }
}
