package array.binarysearch.searchMatrix;

/**
* ClassName:Solution
* Package:array.binarysearch.searchMatrix
* Description:
* @date:2025/3/8 21:59
* @author: Junquan Yi
*/
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = n * m - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            int i = mid / m;
            int j = mid % m;
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{{1,3}};
        System.out.println(solution.searchMatrix(matrix, 3));
    }
}


