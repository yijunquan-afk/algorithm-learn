package stackqueue.StockSpanner;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * ClassName:StockSpanner
 * Package:stackqueue.StockSpanner
 * Description:
 *
 * @date:2024/12/28 16:53
 * @author: Junquan Yi
 */
class StockSpanner {
    Deque<int[]> stack;
    int idx;

    public StockSpanner() {
        stack = new ArrayDeque<int[]>();
        stack.push(new int[]{-1, Integer.MAX_VALUE});
        idx = -1;
    }

    public int next(int price) {
        idx++;
        while (price >= stack.peek()[1]) {
            stack.pop();
        }
        int ret = idx - stack.peek()[0];
        stack.push(new int[]{idx, price});
        return ret;
    }
}
