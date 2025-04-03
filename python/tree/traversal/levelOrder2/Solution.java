package tree.traversal.levelOrder2;

import tree.traversal.Node;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName:Solution
 * Package:tree.traversal.levelOrder2
 * Description:
 *
 * @date:2025/1/5 17:29
 * @author: Junquan Yi
 */
public class Solution {
    // 429. N 叉树的层序遍历
    // https://leetcode.cn/problems/n-ary-tree-level-order-traversal/description/
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                list.add(node.val);
                if (node.children != null) {
                    for (Node child : node.children) {
                        queue.offer(child);
                    }
                }
            }
            res.add(list);
        }
        return res;
    }
}
