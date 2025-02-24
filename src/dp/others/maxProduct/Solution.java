package dp.others.maxProduct;

/**
 * ClassName:Solution
 * Package:dp.others.maxProduct
 * Description:
 *
 * @date:2025/2/22 15:51
 * @author: Junquan Yi
 */
class Solution {
    // 152. 乘积最大子数组
    // https://leetcode.cn/problems/maximum-product-subarray/description/?envType=study-plan-v2&envId=top-100-liked
    // 思路：动态规划，但同时规划正最大值和负最小值。并专门讨论负数的情况：
    // 如果数字是负的，就交换之前求出的正最大值和负最小值。
    // 接着让负数*最小的负数，自然就是正最大值了。
    // 当数字为正数的时候正最大值自然会更大，所以也就会更新maxprod。
    // 至于minprod则会变为更小的负数。这样就能成功讨论正数和负数了。
    // 同时维护一个result，每次用最大值同步更新这个result。最后返回result就是求的结果了。
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                // 如果当前数字是负数，交换最大值和最小值
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
    }
}


