package com.lz.algorithm.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/***
 * 树的几种深度遍历
 */
public class TreeDepthTraversal {

    /***
     *  依据前序遍历创建树
     * @param inputList
     * @return
     */
    public static TreeNode createBinaryTree(LinkedList<Integer> inputList) {
        TreeNode treeNode = null;
        if (null == inputList || inputList.isEmpty()) {
            return null;
        }
        Integer data = inputList.removeFirst();
        if (data != null) {
            treeNode = new TreeNode(data);
            treeNode.leftChild = createBinaryTree(inputList);
            treeNode.rightNode = createBinaryTree(inputList);
        }
        return treeNode;
    }

    /***
     *  前序遍历
     * @param treeNode
     */
    public static void preOrderTraversal(TreeNode treeNode) {
        if (null == treeNode) {
            System.out.print("null ");
            return;
        }
        System.out.print(treeNode.data + " ");
        preOrderTraversal(treeNode.leftChild);
        preOrderTraversal(treeNode.rightNode);
    }

    /***
     * 中序遍历
     * @param treeNode
     */
    public static void inOrderTraversal(TreeNode treeNode) {
        if (null == treeNode) {
            System.out.print("null ");
            return;
        }
        inOrderTraversal(treeNode.leftChild);
        System.out.print(treeNode.data + " ");
        inOrderTraversal(treeNode.rightNode);

    }

    /***
     * 后序遍历
     * @param treeNode
     */
    public static void postOrderTraversal(TreeNode treeNode) {
        if (null == treeNode) {
            System.out.print("null ");
            return;
        }
        postOrderTraversal(treeNode.leftChild);
        postOrderTraversal(treeNode.rightNode);
        System.out.print(treeNode.data + " ");

    }

    /***
     *  二叉树非递归前序遍历
     * @param root
     */
    public static void preOrderTraversalWithStack(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = root;
        while (null != treeNode || !stack.isEmpty()) {
            // 迭代访问节点的左孩子 并入栈
            while (null != treeNode) {
                System.out.print(treeNode.data + " ");
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            }
            // 如果节点没有左孩子 则弹出栈顶节点 访问节点右孩子
            if (!stack.isEmpty()) {
                treeNode = stack.pop();
                treeNode = treeNode.rightNode;
            }
        }

    }

    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<>(Arrays.asList(3, 2, 9, null, null, 10, null, null, 8, null, 4));

        TreeNode binaryTree = createBinaryTree(inputList);
        System.out.println("前序遍历");
        preOrderTraversal(binaryTree);

        System.out.println();
        System.out.println("非递归前序遍历");
        preOrderTraversalWithStack(binaryTree);

        System.out.println();
        System.out.println("中序遍历");
        inOrderTraversal(binaryTree);

        System.out.println();
        System.out.println("后序遍历");
        postOrderTraversal(binaryTree);
    }

}
