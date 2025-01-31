# 算法学习过程

## 数组

| 题目链接                                                     | 代码                                                         | 说明                                                         | 刷题次数 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | -------- |
| [704. 二分查找](https://leetcode.cn/problems/binary-search)  | [binarysearch](src/array/binarysearch/Solution.java)         |                                                              |          |
| [26. 删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/) | [removeDuplicates](src/array/removeDuplicates/Solution.java) |                                                              |          |
| [80. 删除有序数组中的重复项 II](https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/) | [removeDuplicates](src/array/removeDuplicates2/Solution.java) |                                                              |          |
| [169. 多数元素](https://leetcode.cn/problems/majority-element/) | [majorityElement](src/array/majorityElement/Solution.java)   | [多种解法](https://leetcode.cn/problems/majority-element/solutions/146074/duo-shu-yuan-su-by-leetcode-solution/?envType=study-plan-v2&envId=top-interview-150) |          |
| [121. 买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/) | [maxProfit](src/array/maxProfit/Solution.java)               | 记录历史最小值，当前的减去其                                 |          |
| [122. 买卖股票的最佳时机 II](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/) | [maxProfit](src/array/maxProfit2/Solution.java)              | 把所有递增的买上就行                                         |          |
| [125. 验证回文串](https://leetcode.cn/problems/valid-palindrome/) | [isPalindrome](src/array/isPalindrome/Solution.java)         | 双指针                                                       |          |
|                                                              |                                                              |                                                              |          |
|                                                              |                                                              |                                                              |          |



## 双指针

| 题目链接                                                 | 代码           | 说明 | 刷题次数 |
| -------------------------------------------------------- | -------------- | ---- | -------- |
| [283. 移动零](https://leetcode.cn/problems/move-zeroes/) | [moveZeroes]() |      |          |







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

| 题目链接                                               | 代码                                                   | 说明 | 刷题次数 |
|----------------------------------------------------|------------------------------------------------------| ---- | ---- |
| [1475. 商品折扣后的最终价格](https://leetcode.cn/problems/final-prices-with-a-special-discount-in-a-shop/) | [finalPrices](src/stackqueue/finalPrices/Solution.java) | 注意从后往前遍历 |  |
| [739. 每日温度](https://leetcode.cn/problems/daily-temperatures/) | [dailyTemperatures](src/stackqueue/dailyTemperatures/Solution.java) | 注意等于号 |  |
| [496. 下一个更大元素 I](https://leetcode.cn/problems/next-greater-element-i/) | [nextGreaterElement](src/stackqueue/nextGreaterElement/Solution.java) |      |      |
| [503. 下一个更大元素 II](https://leetcode.cn/problems/next-greater-element-ii/) |[nextGreaterElements](src/stackqueue/nextGreaterElements/Solution.java)|用取模代替数组复制||
| [901. 股票价格跨度](https://leetcode.cn/problems/online-stock-span/) |[StockSpanner](src/stackqueue/StockSpanner/StockSpanner.java)|递减栈||
| [42. 接雨水](https://leetcode.cn/problems/trapping-rain-water/) ||==十分经典==，后面再看看||


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

==关键要从二叉树中学习到递归==。

[博客](https://yijunquan.blog.csdn.net/article/details/120389824?fromshare=blogdetail&sharetype=blogdetail&sharerId=120389824&sharerefer=PC&sharesource=weixin_47692652&sharefrom=from_link)

递归三要素：

1. **确定递归函数的参数和返回值：** 确定哪些参数是递归的过程中需要处理的，那么就在递归函数里加上这个参数， 并且还要明确每次递归的返回值是什么进而确定递归函数的返回类型。
2. **确定终止条件：** 写完了递归算法, 运行的时候，经常会遇到栈溢出的错误，就是没写终止条件或者终止条件写的不对，操作系统也是用一个栈的结构来保存每一层递归的信息，如果递归没有终止，操作系统的内存栈必然就会溢出。
3. **确定单层递归的逻辑：** 确定每一层递归需要处理的信息。在这里也就会重复调用自己来实现递归的过程。



### 二叉树的遍历

| 题目链接                                                     | 实现代码                                                     | 说明                                     | 刷题次数 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------------------------------------- | -------- |
| [144. 二叉树的前序遍历](https://leetcode.cn/problems/binary-tree-preorder-traversal/) | [preorderTraversal](src/tree/traversal/preorderTraversal/Solution.java) | 迭代法注意入栈顺序：中右左               |          |
| [94. 二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/) | [inorderTraversal](src/tree/traversal/inorderTraversal/Solution.java) | 迭代法和前序遍历不一样，放的是node       |          |
| [145. 二叉树的后序遍历](https://leetcode.cn/problems/binary-tree-postorder-traversal/) | [postorderTraversal](src/tree/traversal/postorderTraversal/Solution.java) | 迭代法修改前序遍历的，中右左反转->左右中 |          |
| [102. 二叉树的层序遍历](https://leetcode.cn/problems/binary-tree-level-order-traversal/) | [levelOrder](src/tree/traversal/levelOrder/Solution.java)    |                                          |          |
| [107. 二叉树的层序遍历 II](https://leetcode.cn/problems/binary-tree-level-order-traversal-ii/) | [levelOrderBottom](src/tree/traversal/levelOrderBottom/Solution.java) | 逆序即可                                 |          |
| [199. 二叉树的右视图](https://leetcode.cn/problems/binary-tree-right-side-view/) | [rightSideView](src/tree/traversal/rightSideView/Solution.java) |                                          |          |
| [637. 二叉树的层平均值](https://leetcode.cn/problems/average-of-levels-in-binary-tree/) | [averageOfLevels](src/tree/traversal/averageOfLevels/Solution.java) |                                          |          |
| [429. N 叉树的层序遍历](https://leetcode.cn/problems/n-ary-tree-level-order-traversal/) | [levelOrder2](src/tree/traversal/levelOrder2/Solution.java)  |                                          |          |
| [515. 在每个树行中找最大值](https://leetcode.cn/problems/find-largest-value-in-each-tree-row/) | [largestValues](src/tree/traversal/largestValues/Solution.java) |                                          |          |
| [116. 填充每个节点的下一个右侧节点指针](https://leetcode.cn/problems/populating-next-right-pointers-in-each-node/) | [connect](src/tree/traversal/connect/Solution.java)          |                                          |          |
| [104. 二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/) | [maxDepth](src/tree/traversal/maxDepth/Solution.java)        | 递归更好: `max(left, right) + 1`         |          |
| [111. 二叉树的最小深度](https://leetcode.cn/problems/minimum-depth-of-binary-tree/) | [minDepth](src/tree/traversal/minDepth/Solution.java)        | 层次遍历找到叶子结点                     |          |



### 二叉树的属性

| 题目链接                                                     | 实现代码                                                     | 说明                                                         | 刷题次数 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | -------- |
| [101. 对称二叉树](https://leetcode.cn/problems/symmetric-tree/) | [isSymmetric](src/tree/isSymmetric/Solution.java)            | 迭代法+递归法                                                |          |
| [559. N 叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-n-ary-tree/) | [maxDepth](src/tree/maxDepth/Solution.java)                  |                                                              |          |
| [222. 完全二叉树的节点个数](https://leetcode.cn/problems/count-complete-tree-nodes/) | [countNodes](src/tree/countNodes/Solution.java)              | 可以利用满二叉树来简化复杂度为$\log_n\log_n$；[解析](https://programmercarl.com/0222.%E5%AE%8C%E5%85%A8%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E8%8A%82%E7%82%B9%E4%B8%AA%E6%95%B0.html#%E6%80%9D%E8%B7%AF) |          |
| [110. 平衡二叉树](https://leetcode.cn/problems/balanced-binary-tree/) | [isBalanced](src/tree/isBalanced/Solution.java)              |                                                              |          |
| [257. 二叉树的所有路径](https://leetcode.cn/problems/binary-tree-paths/) | [binaryTreePaths](src/tree/binaryTreePaths/Solution.java)    |                                                              |          |
| [404. 左叶子之和](https://leetcode.cn/problems/sum-of-left-leaves/) | [sumOfLeftLeaves](src/tree/sumOfLeftLeaves/Solution.java)    | 递归                                                         |          |
| [513. 找树左下角的值](https://leetcode.cn/problems/find-bottom-left-tree-value/) | [findBottomLeftValue](src/tree/findBottomLeftValue/Solution.java) | 迭代法(层序遍历) +递归法                                     |          |
| [112. 路径总和](https://leetcode.cn/problems/path-sum/)      | [hasPathSum](src/tree/hasPathSum/Solution.java)              |                                                              |          |
| [113. 路径总和 II](https://leetcode.cn/problems/path-sum-ii/) | [pathsum](src/tree/pathsum/Solution.java)                    |                                                              |          |
| [543. 二叉树的直径](https://leetcode.cn/problems/diameter-of-binary-tree/) | [diameterOfBinaryTree](src/tree/diameterOfBinaryTree/Solution.java) | 记录每个节点左子树的深度+右子树的深度                        |          |
|                                                              |                                                              |                                                              |          |
|                                                              |                                                              |                                                              |          |
|                                                              |                                                              |                                                              |          |



### 二叉树的修改与创建

| 题目链接                                                     | 实现代码                                                     | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| [106. 从中序与后序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/) | [buildtree](src/tree/buildTree/Solution.java)                | 比较难：[思路1](https://programmercarl.com/0106.%E4%BB%8E%E4%B8%AD%E5%BA%8F%E4%B8%8E%E5%90%8E%E5%BA%8F%E9%81%8D%E5%8E%86%E5%BA%8F%E5%88%97%E6%9E%84%E9%80%A0%E4%BA%8C%E5%8F%89%E6%A0%91.html#%E7%AE%97%E6%B3%95%E5%85%AC%E5%BC%80%E8%AF%BE)、[思路2](https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/solutions/426738/cong-zhong-xu-yu-hou-xu-bian-li-xu-lie-gou-zao-14/) |
| [105. 从前序与中序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | [buildtree2](src/tree/buildtree2/Solution.java)              | 跟106差不多                                                  |
| [654. 最大二叉树](https://leetcode.cn/problems/maximum-binary-tree/) | [constructMaximumBinaryTree](src/tree/constructMaximumBinaryTree/Solution.java) | 尽量在原数组上操作                                           |
|                                                              |                                                              |                                                              |
| [226. 翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/) | [invertTree](src/tree/invertTree/Solution.java)              |                                                              |
| [617. 合并二叉树](https://leetcode.cn/problems/merge-two-binary-trees/) | [mergeTrees](src/tree/mergeTrees/Solution.java)              |                                                              |

106步骤：

> - 第一步：如果数组大小为零的话，说明是空节点了。
> - 第二步：如果不为空，那么取后序数组最后一个元素作为节点元素。
> - 第三步：找到后序数组最后一个元素在中序数组的位置，作为切割点
> - 第四步：切割中序数组，切成中序左数组和中序右数组 （顺序别搞反了，一定是先切中序数组）
> - 第五步：切割后序数组，切成后序左数组和后序右数组
> - 第六步：递归处理左区间和右区间



### 最近公共祖先

| 题目链接                                                     | 实现代码                                                     | 说明         |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------ |
| [236. 二叉树的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/) | [lowestCommonAncestor](src/tree/lca/lowestCommonAncestor/Solution.java) | 后序遍历     |
| [235. 二叉搜索树的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/) | [lowestCommonAncestor2](src/tree/lca/lowestCommonAncestor2/Solution.java) | 利用p<root<q |



### 二叉搜索树的属性 

| 题目链接                                                     | 实现代码                                                     | 说明                                                   |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------ |
| [700. 二叉搜索树中的搜索](https://leetcode.cn/problems/search-in-a-binary-search-tree/) | [searchBST](src/tree/bst/searchBST/Solution.java)            |                                                        |
| [98. 验证二叉搜索树](https://leetcode.cn/problems/validate-binary-search-tree/) | [isValidBST](src/tree/bst/isValidBST/Solution.java)          | ==中序遍历==下，输出的二叉搜索树节点的数值是有序序列。 |
| [530. 二叉搜索树的最小绝对差](https://leetcode.cn/problems/minimum-absolute-difference-in-bst/) | [getMinimumDifference](src/tree/bst/getMinimumDifference/Solution.java) | 同样利用中序遍历，和pre的节点值相减。                  |
| [501. 二叉搜索树中的众数](https://leetcode.cn/problems/find-mode-in-binary-search-tree/) | [findMode](src/tree/bst/findMode/Solution.java)              | 处理众数逻辑比较绕                                     |
| [538. 把二叉搜索树转换为累加树](https://leetcode.cn/problems/convert-bst-to-greater-tree/) | [convertBST](src/tree/bst/convertBST/Solution.java)          |                                                        |

> 在二叉搜索树（BST）中，中序遍历的结果应该是一个严格递增的序列。这意味着在中序遍历过程中，每个节点的值都必须大于其前一个节点的值。如果在遍历过程中发现某个节点的值小于或等于其前一个节点的值，那么这棵树就不是二叉搜索树。
>
> ### 原因解释
>
> - **BST的性质**：在BST中，对于任意节点，其左子树中的所有节点值都小于该节点的值，其右子树中的所有节点值都大于该节点的值。因此，在中序遍历中，左子树的节点先于当前节点访问，右子树的节点后于当前节点访问。
> - **中序遍历顺序**：中序遍历的顺序是先访问左子树，然后访问当前节点，最后访问右子树。因此，当我们访问当前节点时，上一个访问的节点是其左子树中的最大值，而当前节点的值必须大于这个最大值。
> - **严格递增性**：如果当前节点的值小于或等于上一个节点的值，那么就违反了BST的性质，因为这意味着在中序遍历序列中出现了非严格递增的情况。
>
> ### 示例
>
> 假设我们有以下BST：
>
> ```text
>     5
>    / \
>   3   8
>  / \   \
> 2   4   9
> ```
>
> - 中序遍历的顺序是：2, 3, 4, 5, 8, 9。
> - 在遍历过程中，每次访问一个节点时，我们只需要检查它是否大于上一个访问的节点：
>   - 访问2时，没有前一个节点，继续。
>   - 访问3时，3 > 2，继续。
>   - 访问4时，4 > 3，继续。
>   - 访问5时，5 > 4，继续。
>   - 访问8时，8 > 5，继续。
>   - 访问9时，9 > 8，继续。
>
> 如果在任何一步中，当前节点的值小于或等于上一个节点的值，则该树不是BST。
>
> 因此，只需要验证当前节点的值是否大于上一个节点的值，就可以确保中序遍历结果是严格递增的，从而验证该树是二叉搜索树。



### 二叉搜索树的修改与创建

| 题目链接                                                     | 实现代码                                            | 说明                                                         |
| ------------------------------------------------------------ | --------------------------------------------------- | ------------------------------------------------------------ |
| [701. 二叉搜索树中的插入操作](https://leetcode.cn/problems/insert-into-a-binary-search-tree/) | [insert](src/tree/bst/insertIntoBST/Solution.java)  | 遍历二叉搜索树，找到空节点插入元素就可以                     |
| [450. 删除二叉搜索树中的节点](https://leetcode.cn/problems/delete-node-in-a-bst/) | [deleteNode](src/tree/bst/deleteNode/Solution.java) | 找到节点，将其替换为右子树的最小节点，然后删除右子树的最小节点 |
| [669. 修剪二叉搜索树](https://leetcode.cn/problems/trim-a-binary-search-tree/) | [trimBST](src/tree/bst/trimBST/Solution.java)       | [思路](https://programmercarl.com/0669.%E4%BF%AE%E5%89%AA%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91.html#%E6%80%9D%E8%B7%AF) |



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

| 题目链接                                                     | 实现代码                                                     | 说明                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------------------------- |
| [46. 全排列](https://leetcode.cn/problems/permutations/)     | [permute](src/backtracking/permute/permute/Solution.java)    | 使用used判断哪些元素使用过了 |
| [47. 全排列 II](https://leetcode.cn/problems/permutations-ii/) | [permuteUnique](src/backtracking/permute/permuteUnique/Solution.java) | !used[i-1]: 树层去重更高效   |



### 棋盘问题

| 题目链接                                                  | 实现代码 | 说明 |
| --------------------------------------------------------- | -------- | ---- |
| [51. N 皇后](https://leetcode.cn/problems/n-queens/)      |          |      |
| [37. 解数独](https://leetcode.cn/problems/sudoku-solver/) |          |      |

### 其它

| 题目链接                                                     | 实现代码                                                  | 说明             |
| ------------------------------------------------------------ | --------------------------------------------------------- | ---------------- |
| [491. 非递减子序列](https://leetcode.cn/problems/non-decreasing-subsequences/) | [subsets](src/backtracking/subsets/subsets/Solution.java) | 去重逻辑有点特别 |
|                                                              |                                                           |                  |



## 贪心

![image-20250121151425773](./assets/image-20250121151425773.png)

### 简单题目

| 题目链接                                                     | 实现代码                                                     | 说明 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---- |
| [455. 分发饼干](https://leetcode.cn/problems/assign-cookies/) | [findContentChildren](src/greedy/findContentChildren/Solution.java) |      |
| [1005. K 次取反后最大化的数组和](https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations/) | [largestSumAfterKNegations](src/greedy/largestSumAfterKNegations/Solution.java) |      |



### 序列问题

| 题目链接                                                     | 实现代码                                                     | 说明                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------ |
| [376. 摆动序列](https://leetcode.cn/problems/wiggle-subsequence/) | [wiggleMaxLength](src/greedy/wiggleMaxLength/Solution.java)  | 统计上升下降有多少次即可 |
| [738. 单调递增的数字](https://leetcode.cn/problems/monotone-increasing-digits/) | [monotoneIncreasingDigits](src/greedy/monotoneIncreasingDigits/Solution.java) | 注意使用`nineFlag`       |





### 区间问题

| 题目链接                                                     | 实现代码                                                     | 说明       |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------- |
| [55. 跳跃游戏](https://leetcode.cn/problems/jump-game/)      | [canJump](src/greedy/canJump/Solution.java)                  |            |
| [45. 跳跃游戏 II](https://leetcode.cn/problems/jump-game-ii/) | [jump](src/greedy/jump/Solution.java)                        |            |
| [134. 加油站](https://leetcode.cn/problems/gas-station/)     | [canCompleteCircuit](src/greedy/canCompleteCircuit/Solution.java) |            |
| [452. 用最少数量的箭引爆气球](https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons/) | [findMinArrowShots](src/greedy/findMinArrowShots/Solution.java) | 最小右边界 |
| [435. 无重叠区间](https://leetcode.cn/problems/non-overlapping-intervals/) | [eraseOverlapIntervals](src/greedy/eraseOverlapIntervals/Solution.java) |            |
| [763. 划分字母区间](https://leetcode.cn/problems/partition-labels/) | [partitionLabels](src/greedy/partitionLabels/Solution.java)  |            |
| [56. 合并区间](https://leetcode.cn/problems/merge-intervals/) | [merge](src/greedy/merge/Solution.java)                      |            |



##  其他题目

| 题目链接                                                     | 实现代码                                                     | 说明                                        |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------- |
| [135. 分发糖果](https://leetcode.cn/problems/candy/)         | [candy](src/greedy/candy/Solution.java)                      | 两次遍历                                    |
| [406. 根据身高重建队列](https://leetcode.cn/problems/queue-reconstruction-by-height/) | [reconstructQueue](src/greedy/reconstructQueue/Solution.java) | 身高从大到小排列，k从小到大插入，linkedlist |



## 动态规划

动态规划五步骤

1. 确定dp数组（dp table）以及下标的含义
2. 确定递推公式
3. dp数组如何初始化
4. 确定遍历顺序
5. 举例推导dp数组

### 基础题目

| 题目链接                                                     | 实现代码                                              | 说明 |
| ------------------------------------------------------------ | ----------------------------------------------------- | ---- |
| [509. 斐波那契数](https://leetcode.cn/problems/fibonacci-number/) | [fib](src/dp/basic/fib/Solution.java)                 |      |
| [70. 爬楼梯](https://leetcode.cn/problems/climbing-stairs/)  | [climbStairs](src/dp/basic/climbStairs/Solution.java) |      |





### 背包问题





### 序列问题

