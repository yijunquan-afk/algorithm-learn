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
| [274. H 指数](https://leetcode.cn/problems/h-index/)         | [hIndex](src/array/hIndex/Solution.java)                     |                                                              |          |
|                                                              |                                                              |                                                              |          |

## 二分查找

| 题目链接                                                     | 代码                                                         | 说明                                           | 刷题次数 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---------------------------------------------- | -------- |
| [704. 二分查找](https://leetcode.cn/problems/binary-search)  | [binarysearch](src/array/binarysearch/Solution.java)         |                                                | 2        |
| [35. 搜索插入位置](https://leetcode.cn/problems/search-insert-position/) | [searchInsert](src/array/binarysearch/searchInsert/Solution.java) | `return left;`                                 |          |
| [34. 在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/) | [searchRange](src/array/binarysearch/searchRange/Solution.java) | 两遍二分查找，分别找到最左边和最右边的target位 |          |
| [69. x 的平方根 ](https://leetcode.cn/problems/sqrtx/)       | [mySqrt](src/array/binarysearch/mySqrt/Solution.java)        | `(long) mid * mid`                             |          |
| [367. 有效的完全平方数](https://leetcode.cn/problems/valid-perfect-square/) |                                                              | 同上                                           |          |
| [33. 搜索旋转排序数组](https://leetcode.cn/problems/search-in-rotated-sorted-array/) | [searchRotate](src/array/binarysearch/searchRotate/Solution.java) | `nums[0] <= nums[mid]`左边有序                 |          |
| [81. 搜索旋转排序数组 II](https://leetcode.cn/problems/search-in-rotated-sorted-array-ii/) | [searchRotate2](src/array/binarysearch/searchRotate2/Solution.java) | 注意`left=mid,left++`，`mid=right,right--`     |          |



## 链表

| 题目链接                                                     | 代码                                                         | 说明                                                     | 刷题次数 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------------------------------------------- | -------- |
| [203. 移除链表元素](https://leetcode.cn/problems/remove-linked-list-elements/) | [removenode](src/linkedlist/removenode)                      |                                                          | 2        |
| [160. 相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists/) | [getintersectionnode](src/linkedlist/getintersectionnode/Solution.java) | 解法1:  哈希表<br />解法2: 长对齐+双指针                 | 2        |
| [707. 设计链表](https://leetcode.cn/problems/design-linked-list/) | [designlinkedlist](src/linkedlist/designlinkedlist)          |                                                          | 2        |
| [206. 反转链表](https://leetcode.cn/problems/reverse-linked-list/) | [reverselist](src/linkedlist/reverselist/Solution.java)      | 使用`prev`和`cur`双指针<br />==多做几遍==                | 2        |
| [234. 回文链表](https://leetcode.cn/problems/palindrome-linked-list/) | [isPalindrome](src/linkedlist/isPalindrome/Solution.java)    | 空间复杂度为$O(1)$的做法：反转后一半，再和前一半逐一比较 |          |
|                                                              |                                                              |                                                          |          |
|                                                              |                                                              |                                                          |          |
|                                                              |                                                              |                                                          |          |





## 双指针

| 题目链接                                                     | 代码                                                | 说明 | 刷题次数 |
| ------------------------------------------------------------ | --------------------------------------------------- | ---- | -------- |
| [283. 移动零](https://leetcode.cn/problems/move-zeroes/)     | [moveZeroes]()                                      |      |          |
| [11. 盛最多水的容器](https://leetcode.cn/problems/container-with-most-water/) | [maxArea](src/doublepointers/maxArea/Solution.java) |      |          |
|                                                              |                                                     |      |          |
|                                                              |                                                     |      |          |
|                                                              |                                                     |      |          |







## 哈希表

| 题目链接                                                     | 代码                                                | 说明 | 刷题次数 |
| ------------------------------------------------------------ | --------------------------------------------------- | ---- | -------- |
| [283. 移动零](https://leetcode.cn/problems/move-zeroes/)     | [moveZeroes]()                                      |      |          |
| [11. 盛最多水的容器](https://leetcode.cn/problems/container-with-most-water/) | [maxArea](src/doublepointers/maxArea/Solution.java) |      |          |
|                                                              |                                                     |      |          |







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
| [739. 每日温度](https://leetcode.cn/problems/daily-temperatures/) | [dailyTemperatures](src/stackqueue/dailyTemperatures/Solution.java) | 注意等于号 | 2 |
| [496. 下一个更大元素 I](https://leetcode.cn/problems/next-greater-element-i/) | [nextGreaterElement](src/stackqueue/nextGreaterElement/Solution.java) |      | 2 |
| [503. 下一个更大元素 II](https://leetcode.cn/problems/next-greater-element-ii/) |[nextGreaterElements](src/stackqueue/nextGreaterElements/Solution.java)|用取模代替数组复制|2|
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



### 其他题目

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

| 题目链接                                                     | 实现代码                                                     | 说明                              |
| ------------------------------------------------------------ | ------------------------------------------------------------ | --------------------------------- |
| [509. 斐波那契数](https://leetcode.cn/problems/fibonacci-number/) | [fib](src/dp/basic/fib/Solution.java)                        |                                   |
| [70. 爬楼梯](https://leetcode.cn/problems/climbing-stairs/)  | [climbStairs](src/dp/basic/climbStairs/Solution.java)        |                                   |
| [746. 使用最小花费爬楼梯](https://leetcode.cn/problems/min-cost-climbing-stairs/) | [minCostClimbingStairs](src/dp/basic/minCostClimbingStairs/Solution.java) |                                   |
| [62. 不同路径](https://leetcode.cn/problems/unique-paths/)   | [uniquePaths](src/dp/basic/uniquePaths/Solution.java)        |                                   |
| [63. 不同路径 II](https://leetcode.cn/problems/unique-paths-ii/) | [uniquePathsWithObstacles](src/dp/basic/uniquePathsWithObstacles/Solution.java) |                                   |
| [343. 整数拆分](https://leetcode.cn/problems/integer-break/) |                                                              |                                   |
| [96. 不同的二叉搜索树](https://leetcode.cn/problems/unique-binary-search-trees/) | [numTrees](src/dp/basic/numTrees/Solution.java)              | `dp[i] += dp[j - 1] * dp[i - j];` |
|                                                              |                                                              |                                   |

### 背包问题

#### 0-1背包

| 题目链接                                                     | 实现代码                                                     | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| [416. 分割等和子集](https://leetcode.cn/problems/partition-equal-subset-sum/) | [canPartition](src/dp/backpack/onezero/canPartition/Solution.java) | 物品是`nums[i]`，重量是`nums[i]`，价值也是`nums[i]`，背包体积是`sum/2`。 |
| [1049. 最后一块石头的重量 II](https://leetcode.cn/problems/last-stone-weight-ii/) | [lastStoneWeightII](src/dp/backpack/onezero/lastStoneWeightII/Solution.java) | 尽可能分成两半                                               |
| [494. 目标和](https://leetcode.cn/problems/target-sum/)      | [findTargetSumWays](src/dp/backpack/onezero/findTargetSumWays/Solution.java) | 物品是`nums[i]`，重量是`nums[i]`，价值也是`nums[i]`，背包体积是`sum-target/2`。<br />`dp[j] += dp[j - nums[i]];` |
| [474. 一和零](https://leetcode.cn/problems/ones-and-zeroes/) | [findMaxForm](src/dp/backpack/onezero/findMaxForm/Solution.java) | 两个维度: `dp[i][j] = max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);` |
|                                                              |                                                              |                                                              |

#### 完全背包

一维dp：内循环正序

| 题目链接                                                     | 实现代码                                                     | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| [518. 零钱兑换 II](https://leetcode.cn/problems/coin-change-ii/) | [change2](src/dp/backpack/complete/change2/Solution.java)    | 组合问题，先遍历物品，再遍历背包                             |
| [377. 组合总和 Ⅳ](https://leetcode.cn/problems/combination-sum-iv/) | [combinationSum4](dp/backpack/complete/combinationSum4/Solution.java) | 排列问题，先遍历背包，再遍历物品                             |
| [322. 零钱兑换](https://leetcode.cn/problems/coin-change/)   | [change](src/dp/backpack/complete/change/Solution.java)      | 求的是最少数，遍历顺序无所谓                                 |
| [279. 完全平方数](https://leetcode.cn/problems/perfect-squares/) | [numSquares](src/dp/backpack/complete/numSquares/Solution.java) | 同上                                                         |
| [139. 单词拆分](https://leetcode.cn/problems/word-break/)    | [wordBreak](src/dp/backpack/complete/wordBreak/Solution.java) | 排列问题，先遍历背包，再遍历物品<br />递推公式是 if([j, i] 这个区间的子串出现在字典里 && dp[j]是true) 那么 dp[i] = true。 |



### 打家劫舍

| 题目链接                                                     | 实现代码                              | 说明                                            |
| ------------------------------------------------------------ | ------------------------------------- | ----------------------------------------------- |
| [198. 打家劫舍](https://leetcode.cn/problems/house-robber/)  | [rob](src/dp/rob/rob/Solution.java)   | `dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);` |
| [213. 打家劫舍 II](https://leetcode.cn/problems/house-robber-ii/) | [rob2](src/dp/rob/rob2/Solution.java) | 两种情况：去掉第一个房子，去掉最后一个房子      |
| [337. 打家劫舍 III](https://leetcode.cn/problems/house-robber-iii/) | [rob3](src/dp/rob/rob3/Solution.java) | ==树形dp==                                      |
|                                                              |                                       |                                                 |



### 股票问题

| 题目链接                                                     | 实现代码                                                | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------- | ------------------------------------------------------------ |
| [121. 买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/) | [maxProfit1](src/dp/maxProfit/maxProfit/Solution.java)  | 买卖一次<br />`dp[i][0] = max(dp[i-1][0], -prices[i]); `<br />`dp[i][1] = max(dp[i-1][1], dp[i-1][0] + prices[i])` |
| [122. 买卖股票的最佳时机 II](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/) | [maxProfit2](src/dp/maxProfit/maxProfit2/Solution.java) | 买卖多次<br />`dp[i][0] = max(dp[i-1][0], dp[i-1][1]-prices[i]); `<br />`dp[i][1] = max(dp[i-1][1], dp[i-1][0] + prices[i])` |
| [123. 买卖股票的最佳时机 III](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iii/) | [maxProfit3](src/dp/maxProfit/maxProfit3/Solution.java) | 最多买卖两次，5个状态，==hard==                              |
| [123. 买卖股票的最佳时机 III](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iii/) | [maxProfit4](src/dp/maxProfit/maxProfit4/Solution.java) | 最多买卖k次，(2k+1)个状态，==hard==                          |
| [309. 买卖股票的最佳时机含冷冻期](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-cooldown/) | [maxProfit5](src/dp/maxProfit/maxProfit5/Solution.java) | 四个状态看解析：[买入状态、卖出状态、今天卖出、冷冻状态](https://programmercarl.com/0309.%E6%9C%80%E4%BD%B3%E4%B9%B0%E5%8D%96%E8%82%A1%E7%A5%A8%E6%97%B6%E6%9C%BA%E5%90%AB%E5%86%B7%E5%86%BB%E6%9C%9F.html#%E6%80%9D%E8%B7%AF) |
| [714. 买卖股票的最佳时机含手续费](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/) | [maxProfit6](src/dp/maxProfit/maxProfit6/Solution.java) | 每次卖出的时候减去手续费即可                                 |



### 序列问题

| 题目链接                                                     | 实现代码                                                     | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| [300. 最长递增子序列](https://leetcode.cn/problems/longest-increasing-subsequence/) | [lengthOfLIS](src/dp/sequence/lengthOfLIS/Solution.java)     | $dp[i] = \max dp[j], 0\le j\le i\ \& \ nums[j]<nums[i]$$LIS_{length} = max(dp[i]),0\le i\le n$ |
| [674. 最长连续递增序列](https://leetcode.cn/problems/longest-continuous-increasing-subsequence/) | [findLengthOfLCIS](src/dp/sequence/findLengthOfLCIS/Solution.java) |                                                              |
| [718. 最长重复子数组](https://leetcode.cn/problems/maximum-length-of-repeated-subarray/) | [findLength](src/dp/sequence/findLength/Solution.java)       | $dp[i][j]$                                                   |
| [1143. 最长公共子序列](https://leetcode.cn/problems/longest-common-subsequence/) | [lcs](src/dp/sequence/lcs/Solution.java)                     | $$dp[i][j] = \begin{cases}dp[i-1][j-1] + 1, &  \\\max(dp[i-1][j], dp[i][j-1]), \end{cases}$$ |
| [1035. 不相交的线](https://leetcode.cn/problems/uncrossed-lines/) | [maxUncrossedLines](src/dp/sequence/maxUncrossedLines/Solution.java) | 跟最长公共子序列问题一致                                     |
| [53. 最大子数组和](https://leetcode.cn/problems/maximum-subarray/) | [maxSubArray](src/dp/sequence/maxSubArray/Solution.java)     | 贪心算法/dp<br />$dp[i] = \max(dp[i-1] + nums[i], nums[i]);$ |
| [392. 判断子序列](https://leetcode.cn/problems/is-subsequence/) | [isSubsequence](src/dp/sequence/isSubsequence/Solution.java) | 跟最长公共子序列问题类似，$dp[i][j] = dp[i][j-1]$<br />也可以使用双指针 |
| [115. 不同的子序列](https://leetcode.cn/problems/distinct-subsequences/) | [numDistinct](src/dp/sequence/numDistinct/Solution.java)     | ==hard==, $dp[i][j] = dp[i-1][j-1] + dp[i-1][j];$            |
| [583. 两个字符串的删除操作](https://leetcode.cn/problems/delete-operation-for-two-strings/) | [minDistance](src/dp/minDistance/lcs/Solution.java)          | 跟最长公共子序列问题一致, $n + m - 2*dp[n][m];$              |
| [72. 编辑距离](https://leetcode.cn/problems/edit-distance/)  | [minDistance2](src/dp/sequence/minDistance2/Solution.java)   | [思路](https://programmercarl.com/0072.%E7%BC%96%E8%BE%91%E8%B7%9D%E7%A6%BB.html#%E6%80%9D%E8%B7%AF) |
| [647. 回文子串](https://leetcode.cn/problems/palindromic-substrings/) |                                                              |                                                              |
| [516. 最长回文子序列](https://leetcode.cn/problems/longest-palindromic-subsequence/) |                                                              |                                                              |
|                                                              |                                                              |                                                              |

### 其他

| 题目链接                                                     | 实现代码                                             | 说明                                         |
| ------------------------------------------------------------ | ---------------------------------------------------- | -------------------------------------------- |
| [152. 乘积最大子数组](https://leetcode.cn/problems/maximum-product-subarray/) | [maxProduct](src/dp/others/maxProduct/Solution.java) | 同时记录最大乘积和最小乘积，关键在于<0时交换 |
|                                                              |                                                      |                                              |



## 图论

| 题目链接                                                     | 实现代码                                       | 说明                           |
| ------------------------------------------------------------ | ---------------------------------------------- | ------------------------------ |
| [106. 岛屿的周长](https://kamacoder.com/problempage.php?pid=1178) | [islandRound](src/graph/islandRound/Main.java) | 直接模拟，遇到水和边界，边数+1 |



### DFS & BFS

| 题目链接                                                     | 实现代码             | 说明                                                         |
| ------------------------------------------------------------ | -------------------- | ------------------------------------------------------------ |
| [98.所有可达路径](https://kamacoder.com/problempage.php?pid=1170) | [dfs](src/graph/dfsbfs) |                                                              |
| [99. 岛屿数量-dfs](https://kamacoder.com/problempage.php?pid=1171) | [islandnum-dfs](src/graph/dfsbfs/islandnum/dfs.java) | 遇到一个没有遍历过的节点陆地，计数器就加一，然后把该节点陆地所能遍历到的陆地都标记上 |
| [99. 岛屿数量-bfs](https://kamacoder.com/problempage.php?pid=1171) | [islandnum-bfs](src/graph/dfsbfs/islandnum/bfs.java) | 加入队列 就代表走过，立刻标记 |
| [100.岛屿的最大面积](https://kamacoder.com/problempage.php?pid=1172) | [islandArea](src/graph/dfsbfs/islandArea/Main.java) | 遇到一个岛屿count++ |
| [101.孤岛的总面积](https://kamacoder.com/problempage.php?pid=1173) | [islandTotalArea](src/graph/dfsbfs/islandTotalArea/Main.java) | 从周边找到陆地然后 通过 dfs或者bfs 将周边靠陆地且相邻的陆地都变成海洋，然后再去重新遍历地图 统计此时还剩下的陆地就可以 |
| [200. 岛屿数量](https://leetcode.cn/problems/number-of-islands/) |  |  |
| [102.沉没孤岛](https://kamacoder.com/problempage.php?pid=1174) | [islandDown](src/graph/dfsbfs/islandDown/Main.java) | 从地图周边出发，将周边空格相邻的陆地都做上标记，然后在遍历一遍地图，遇到 陆地 且没做过标记的，那么都是地图中间的 陆地 ，全部改成水域 |
| [103.水流问题](https://kamacoder.com/problempage.php?pid=1175) | [flow](src/graph/dfsbfs/flow/Main.java) | 从两个边界逆流而上，都经历过的标记上，时间复杂度为$O(mn)$ |
| [110.字符串接龙](https://kamacoder.com/problempage.php?pid=1183) |  | ==hard== **无向图求最短路，广搜最为合适，广搜只要搜到了终点，那么一定是最短的路径**。因为广搜就是以起点中心向四周扩散的搜索。 |
| [104.建造最大岛屿](https://kamacoder.com/problempage.php?pid=1176) |  |  |
|  |  |  |
|  |  |  |



### 并查集

| 题目链接 | 实现代码 | 说明 |
| -------- | -------- | ---- |
|          |          |      |
|          |          |      |



### 最小生成树





### 拓扑排序





### 最短路算法

企业真题
