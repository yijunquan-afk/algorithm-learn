package array.spiralmatrix2;

/**
 * ClassName:Solution
 * Package:array.spiralmatrix
 * Description:
 *
 * @date:2024/12/21 15:07
 * @author: Junquan Yi
 */
public class Solution {
    // 题目: https://leetcode.cn/problems/spiral-matrix-ii/
    // 螺旋矩阵，middle
    // 解析: https://programmercarl.com/0059.%E8%9E%BA%E6%97%8B%E7%9F%A9%E9%98%B5II.html#%E7%AE%97%E6%B3%95%E5%85%AC%E5%BC%80%E8%AF%BE
    // 注意控制顺序
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int epoch = 0, count = 0;
        while(count < n * n - 1) {
            // 左闭右开
            // 从左到右
            for (int i = epoch; i < n-1-epoch; i++) {
                result[epoch][i] = ++count;
            }

            // 从上到下
            for (int i = epoch; i < n-1-epoch; i++) {
                result[i][n-1-epoch] = ++count;
            }

            // 从右到左
            for (int i = n-1-epoch; i > epoch; i--) {
                result[n-1-epoch][i] = ++count;
            }

            // 从下到上
            for (int i = n-1-epoch; i > epoch; i--) {
                result[i][epoch] = ++count;
            }
            epoch++;
        }
        // 如果n为奇数的话，需要单独给矩阵最中间的位置赋值
        if (n % 2 == 1){
            result[n/2][n/2] = count + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] result = solution.generateMatrix(5);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
