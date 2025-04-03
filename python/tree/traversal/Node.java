package tree.traversal;

import java.util.List;

/**
 * ClassName:Node
 * Package:tree.traversal
 * Description:
 *
 * @date:2025/1/5 17:28
 * @author: Junquan Yi
 */
public  class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
