package tree.maxDepth;

import tree.Node;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName:Solution
 * Package:tree.maxDepth
 * Description:
 *
 * @date:2025/1/7 15:37
 * @author: Junquan Yi
 */
public class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        Deque<Node> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if(node.children!=null){
                    for (Node child : node.children) {
                        queue.offer(child);
                    }
                }
            }
        }
        return depth;
    }
    public int maxDepth2(Node root) {
        if (root == null) return 0;

        int depth = 0;
        if (root.children != null){
            for (Node child : root.children){
                depth = Math.max(depth, maxDepth(child));
            }
        }

        return depth + 1; //中节点
    }
}
