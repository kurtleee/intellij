import com.sun.source.tree.Tree;
/*Created by @Kurt LEE On 3/16/23 9:33 PM.*/
import java.util.ArrayList;
import java.util.List;

public class isValidBST {
    public static void main(String[] args) {

    }

    public boolean isValid(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inOrderTraversal(root, values);
        for (int i = 0; i <= values.size() - 1; ++i) {
            if (values.get(i) >= values.get(i - 1)) {
                return false;
            }
        }

        return true;
    }

    // 使用中序遍历，输出有顺序的values；若给定二叉树并非BST，则会在isValid 中判断出来。
    private void inOrderTraversal(TreeNode node, List<Integer> values) {
        if (node == null) {
            return ;
        }

        inOrderTraversal(node.left, values);
        values.add(node.val);
        inOrderTraversal(node.right, values);
    }
}
