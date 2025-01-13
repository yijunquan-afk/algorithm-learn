package tree.findBottomLeftValue;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:tree.findBottomLeftValue
 * Description:
 *
 * @date:2025/1/10 16:32
 * @author: Junquan Yi
 */
public class Solution {
    // 513. 找树左下角的值
    // https://leetcode.cn/problems/find-bottom-left-tree-value/description/

    /*
    层序遍历比较简单
     */
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null && root.right==null){
            return root.val;
        }
        List<List<Integer>> levels = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            levels.add(level);
        }
        return levels.get(levels.size()-1).get(0);
    }

    /*
    迭代法
     */
    int maxDepth = 0;
    int result = 0;
    public int findBottomLeftValue2(TreeNode root) {
        traserval(root, 0);
        return result;
    }

    void traserval(TreeNode root, int depth) {
        if(root.left==null && root.right==null){
            if(maxDepth<depth){
                maxDepth = depth;
                result = root.val;
            }
        }
        if(root.left!=null) traserval(root.left, depth+1);
        if(root.right!=null) traserval(root.right, depth+1);
    }
}
