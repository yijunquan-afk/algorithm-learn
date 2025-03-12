package array.binarysearch.findMedianSortedArrays;

/**
 * ClassName:Solution
 * Package:array.binarysearch.findMedianSortedArrays
 * Description:
 *
 * @date:2025/3/8 23:24
 * @author: Junquan Yi
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int mid = (n1 + n2)/2;
        boolean flag = false;
        if((n1+n2)%2==0) flag = true;
        boolean isP1 = false;
        int p1 = 0, p2 = 0;
        while(mid > 0){
            if(nums1[p1] < nums2[p2] && p1 < n1){
                p1++;
                isP1 = false;
            }else{
                p2++;
                isP1 = true;
            }
            mid--;
        }
        int res1 = 0;
        if(isP1) res1 =  nums1[p1];
        else res1 =  nums2[p2];
        if(flag){
            int res2 = 0;
            if (isP1){
                res2 = Math.min(nums2[p2], nums1[p1-1]);
            }else{
                res2 = Math.min(nums1[p1], nums2[p2-1]);
            }
            return (res1+res2)/2;
        }else{
            return res1;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));

    }
}
