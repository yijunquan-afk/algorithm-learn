package doublepointers.maxArea;

/**
 * ClassName:Solution
 * Package:doublepointers.maxArea
 * Description:
 *
 * @date:2025/2/6 21:11
 * @author: Junquan Yi
 */
public class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length-1;
        int left = height[start], right = height[end];
        int maxArea = 0;
        while(start < end){
            int temp = Math.min(left, right);
            maxArea = Math.max(maxArea, (end - start) * temp);
            if(left < right){
                start++;
                left = height[start];
            }else{
                end--;
                right = height[end];
            }
        }
        return maxArea;
    }
}
