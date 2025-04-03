package heap.medianFinder;

/**
 * ClassName:Solution
 * Package:heap.medianFinder
 * Description:
 *
 * @date:2025/3/14 11:53
 * @author: Junquan Yi
 */
public class Solution {
    public static void main(String[] args) {
        MedianFinder mf  = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian());
    }
}
