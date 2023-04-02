/*Created by @Kurt LEE. Last Modified on 4/2/23, 12:36 PM.*/

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementinBST {

    // Driver Class//
    public static void main(String[] args) {
        // 初始化Tree
        TreeNode node = new TreeNode();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        int k = 3;
        KthSmallestElementinBST o1 = new KthSmallestElementinBST();
        System.out.println(o1.findKthElement(root, k));
    }

    public int findKthElement(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        inorder(root, values);
        return values.get(k - 1);

    }

    private void inorder(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }

        inorder(root.left, values);
        values.add(root.val);
        inorder(root.right, values);
    }
}
