# 算法学习过程

## 数组

| 题目链接                                                     | 代码                                                         | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| [704. 二分查找](https://leetcode.cn/problems/binary-search)  | [binarysearch](src/array/binarysearch/Solution.java)         |                                                              |
| [26. 删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/) | [removeDuplicates](src/array/removeDuplicates/Solution.java) |                                                              |
| [80. 删除有序数组中的重复项 II](https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/) | [removeDuplicates](src/array/removeDuplicates2/Solution.java) |                                                              |
| [169. 多数元素](https://leetcode.cn/problems/majority-element/) | [majorityElement](src/array/majorityElement/Solution.java)   | [多种解法](https://leetcode.cn/problems/majority-element/solutions/146074/duo-shu-yuan-su-by-leetcode-solution/?envType=study-plan-v2&envId=top-interview-150) |
| [121. 买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/) | [maxProfit](src/array/maxProfit/Solution.java)               | 记录历史最小值，当前的减去其                                 |
| [122. 买卖股票的最佳时机 II](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/) | [maxProfit](src/array/maxProfit2/Solution.java)              | 把所有递增的买上就行                                         |
| [125. 验证回文串](https://leetcode.cn/problems/valid-palindrome/) | [isPalindrome](src/array/isPalindrome/Solution.java)         | 双指针                                                       |
|                                                              |                                                              |                                                              |
|                                                              |                                                              |                                                              |





## 哈希表





## 栈和队列

### 栈的应用



### 单调栈

单调栈本质上是 **维护数组中的元素为单调序列**，数组中的元素 **要么** 符合单调性顺利进栈，**要么** 不符合单调性而将栈中其他元素“挤走”再进栈，使得栈中序列始终满足单调性。

理解这一点很重要，我们以单调递增栈为例，如果出现了比栈顶元素 **小** 的值，即不符合当前栈中序列单增特性的值，那么它会使所有比它大的值出栈，而 **该值便是接下来要连续出栈元素右侧最近的小值**，比该值大的栈元素都出栈完毕后，该值进栈，使得栈中的序列仍然满足单调递增。

如果题目有 **在连续序列中找元素左/右侧最近的大/小值** 的特点，我们就可以使用单调栈来求解，找最近的小值的单调递增栈模板如下，注意入栈的是数组元素的 **索引** 而不是元素值。

```java
Stack<Integer> stack = new Stack<>();

for (int i = 0; i < nums.length; i++) {
    while (!stack.isEmpty() && nums[i] < nums[stack.peek()]) {
        int index = stack.pop();
        
        // 关于 index 的特殊处理
        process();
    }
    // 索引入栈
    stack.push(i);
    
    // 处理逻辑
    process1();
}

```

> 链接：https://juejin.cn/post/7282007210430480418

| 题目链接                                               | 代码                                                   | 说明 |
|----------------------------------------------------|------------------------------------------------------| ---- |
| [1475. 商品折扣后的最终价格](https://leetcode.cn/problems/final-prices-with-a-special-discount-in-a-shop/) | [finalPrices](src/stackqueue/finalPrices/Solution.java) | 注意从后往前遍历 |
| [739. 每日温度](https://leetcode.cn/problems/daily-temperatures/) | [dailyTemperatures](src/stackqueue/dailyTemperatures/Solution.java) | 注意等于号 |
| [496. 下一个更大元素 I](https://leetcode.cn/problems/next-greater-element-i/) | [nextGreaterElement](src/stackqueue/nextGreaterElement/Solution.java) |      |
| [503. 下一个更大元素 II](https://leetcode.cn/problems/next-greater-element-ii/) |[nextGreaterElements](src/stackqueue/nextGreaterElements/Solution.java)|用取模代替数组复制|
| [901. 股票价格跨度](https://leetcode.cn/problems/online-stock-span/) |[StockSpanner](src/stackqueue/StockSpanner/StockSpanner.java)|递减栈|
| [42. 接雨水](https://leetcode.cn/problems/trapping-rain-water/) ||==十分经典==，后面再看看|


- 单调栈适合解决与索引相关的问题，如求下一个更大/更小的元素。
- 单调队列适合解决与区间相关的问题，如滑动窗口问题。

### 单调队列

| 题目链接                                                     | 实现代码                                                     | 说明                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------- |
| [239. 滑动窗口最大值](https://leetcode.cn/problems/sliding-window-maximum/) | [maxSlidingWindow](src/stackqueue/maxSlidingWindow/Solution.java) |                           |
| [LCR 184. 设计自助结算系统](https://leetcode.cn/problems/dui-lie-de-zui-da-zhi-lcof/) | [checkout](src/stackqueue/checkout/Checkout.java)            |                           |
| [1438. 绝对差不超过限制的最长连续子数组](https://leetcode.cn/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) | [maxSubarray](src/stackqueue/longestSubarray/Solution.java)  | 两个单调队列+最大滑动窗口 |
|                                                              |                                                              |                           |
|                                                              |                                                              |                           |
|                                                              |                                                              |                           |
|                                                              |                                                              |                           |
|                                                              |                                                              |                           |
|                                                              |                                                              |                           |



## 二叉树

[博客](https://yijunquan.blog.csdn.net/article/details/120389824?fromshare=blogdetail&sharetype=blogdetail&sharerId=120389824&sharerefer=PC&sharesource=weixin_47692652&sharefrom=from_link)

递归三要素：

1. **确定递归函数的参数和返回值：** 确定哪些参数是递归的过程中需要处理的，那么就在递归函数里加上这个参数， 并且还要明确每次递归的返回值是什么进而确定递归函数的返回类型。
2. **确定终止条件：** 写完了递归算法, 运行的时候，经常会遇到栈溢出的错误，就是没写终止条件或者终止条件写的不对，操作系统也是用一个栈的结构来保存每一层递归的信息，如果递归没有终止，操作系统的内存栈必然就会溢出。
3. **确定单层递归的逻辑：** 确定每一层递归需要处理的信息。在这里也就会重复调用自己来实现递归的过程。

### 二叉树的遍历

| 题目链接                                                     | 实现代码                                                     | 说明                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------------------------------------- |
| [144. 二叉树的前序遍历](https://leetcode.cn/problems/binary-tree-preorder-traversal/) | [preorderTraversal](src/tree/traversal/preorderTraversal/Solution.java) | 迭代法注意入栈顺序：中右左               |
| [94. 二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/) | [inorderTraversal](src/tree/traversal/inorderTraversal/Solution.java) | 迭代法和前序遍历不一样，放的是node       |
| [145. 二叉树的后序遍历](https://leetcode.cn/problems/binary-tree-postorder-traversal/) | [postorderTraversal](src/tree/traversal/postorderTraversal/Solution.java) | 迭代法修改前序遍历的，中右左反转->左右中 |
| [102. 二叉树的层序遍历](https://leetcode.cn/problems/binary-tree-level-order-traversal/) | [levelOrder](src/tree/traversal/levelOrder/Solution.java)    |                                          |
| [107. 二叉树的层序遍历 II](https://leetcode.cn/problems/binary-tree-level-order-traversal-ii/) | [levelOrderBottom](src/tree/traversal/levelOrderBottom/Solution.java) | 逆序即可                                 |
| [199. 二叉树的右视图](https://leetcode.cn/problems/binary-tree-right-side-view/) | [rightSideView](src/tree/traversal/rightSideView/Solution.java) |                                          |
| [637. 二叉树的层平均值](https://leetcode.cn/problems/average-of-levels-in-binary-tree/) | [averageOfLevels](src/tree/traversal/averageOfLevels/Solution.java) |                                          |
| [429. N 叉树的层序遍历](https://leetcode.cn/problems/n-ary-tree-level-order-traversal/) | [levelOrder2](src/tree/traversal/levelOrder2/Solution.java)  |                                          |
| [515. 在每个树行中找最大值](https://leetcode.cn/problems/find-largest-value-in-each-tree-row/) | [largestValues](src/tree/traversal/largestValues/Solution.java) |                                          |
| [116. 填充每个节点的下一个右侧节点指针](https://leetcode.cn/problems/populating-next-right-pointers-in-each-node/) | [connect](src/tree/traversal/connect/Solution.java)          |                                          |
| [104. 二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/) | [maxDepth](src/tree/traversal/maxDepth/Solution.java)        | 递归更好: `max(left, right) + 1`         |
| [111. 二叉树的最小深度](https://leetcode.cn/problems/minimum-depth-of-binary-tree/) | [minDepth](src/tree/traversal/minDepth/Solution.java)        | 层次遍历找到叶子结点                     |

### 二叉树的属性

| 题目链接                                                     | 实现代码                                                  | 说明                                                         |
| ------------------------------------------------------------ | --------------------------------------------------------- | ------------------------------------------------------------ |
| [101. 对称二叉树](https://leetcode.cn/problems/symmetric-tree/) | [isSymmetric](src/tree/isSymmetric/Solution.java)         | 迭代法+递归法                                                |
| [226. 翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/) | [invertTree](src/tree/invertTree/Solution.java)           |                                                              |
| [559. N 叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-n-ary-tree/) | [maxDepth](src/tree/maxDepth/Solution.java)               |                                                              |
| [222. 完全二叉树的节点个数](https://leetcode.cn/problems/count-complete-tree-nodes/) | [countNodes](src/tree/countNodes/Solution.java)           | 可以利用满二叉树来简化复杂度为$\log_n\log_n$；[解析](https://programmercarl.com/0222.%E5%AE%8C%E5%85%A8%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E8%8A%82%E7%82%B9%E4%B8%AA%E6%95%B0.html#%E6%80%9D%E8%B7%AF) |
| [110. 平衡二叉树](https://leetcode.cn/problems/balanced-binary-tree/) | [isBalanced](src/tree/isBalanced/Solution.java)           |                                                              |
| [257. 二叉树的所有路径](https://leetcode.cn/problems/binary-tree-paths/) | [binaryTreePaths](src/tree/binaryTreePaths/Solution.java) |                                                              |
| [404. 左叶子之和](https://leetcode.cn/problems/sum-of-left-leaves/) | [sumOfLeftLeaves](src/tree/sumOfLeftLeaves/Solution.java) | 递归                                                         |
|                                                              |                                                           |                                                              |
|                                                              |                                                           |                                                              |



## 回溯

[博客](https://programmercarl.com/%E5%9B%9E%E6%BA%AF%E7%AE%97%E6%B3%95%E7%90%86%E8%AE%BA%E5%9F%BA%E7%A1%80.html#%E7%90%86%E8%AE%BA%E5%9F%BA%E7%A1%80)

<img src="./assets/20210130173631174.png" alt="回溯算法理论基础" style="zoom:30%;" />

伪代码：

```c
void backtracking(参数) {
    if (终止条件) {
        存放结果;
        return;
    }

    for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）) {
        处理节点;
        backtracking(路径，选择列表); // 递归
        回溯，撤销处理结果
    }
}
```



### 组合

| 题目链接                                                     | 实现代码                                                     | 说明                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------------------------------------------- |
| [77. 组合](https://leetcode.cn/problems/combinations/)       | [combine](src/backtracking/combination/combine/Solution.java) | 剪枝：`i<=n-(k-path.size())+1`                           |
| [216. 组合总和 III](https://leetcode.cn/problems/combination-sum-iii/) | [combinationSum3](src/backtracking/combination/combinationSum3/Solution.java) | 剪枝：`upper = n < 9 ? n : 9`                            |
| [17. 电话号码的字母组合](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/) | [letterCombinations](src/backtracking/combination/letterCombinations/Solution.java) |                                                          |
| [39. 组合总和](https://leetcode.cn/problems/combination-sum/) | [combinationSum]()                                           | 剪枝：`i < candidates.length && candidates[i] <= target` |
| [40. 组合总和 II](https://leetcode.cn/problems/combination-sum-ii/) | [combinationSum2](src/backtracking/combination/combinationSum2/Solution.java) | 去重：`used[i]=0表示树层使用过`                          |
|                                                              |                                                              |                                                          |

### 分割

| 题目链接                                                     | 实现代码                                                     | 说明                                   |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------------------------- |
| [131. 分割回文串](https://leetcode.cn/problems/palindrome-partitioning/) | [partition](src/backtracking/partition/v/Solution.java)      |                                        |
| [93. 复原 IP 地址](https://leetcode.cn/problems/restore-ip-addresses/) | [restoreIpAddresses](src/backtracking/partition/restoreIpAddresses/Solution.java) | 递归三层即可，剩下的直接进行合法性判断 |

### 子集

| 题目链接                                                | 实现代码                                                     | 说明           |
| ------------------------------------------------------- | ------------------------------------------------------------ | -------------- |
| [78. 子集](https://leetcode.cn/problems/subsets/)       | [subsets](src/backtracking/subsets/subsets/Solution.java)    |                |
| [90. 子集 II](https://leetcode.cn/problems/subsets-ii/) | [subsetsWithDup](src/backtracking/subsets/subsetsWithDup/Solution.java) | 去重：使用used |

### 排列



### 棋盘问题



### 其它

| 题目链接                                                     | 实现代码                                                  | 说明             |
| ------------------------------------------------------------ | --------------------------------------------------------- | ---------------- |
| [491. 非递减子序列](https://leetcode.cn/problems/non-decreasing-subsequences/) | [subsets](src/backtracking/subsets/subsets/Solution.java) | 去重逻辑有点特别 |
|                                                              |                                                           |                  |

### 



