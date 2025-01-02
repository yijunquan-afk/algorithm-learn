# 算法学习过程

## 数组

| 题目链接                                                     | 代码                                                         | 说明 |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ---- |
| [704. 二分查找](https://leetcode.cn/problems/binary-search)  | [binarysearch](src/array/binarysearch/Solution.java)         |      |
| [26. 删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/) | [removeDuplicates](src/array/removeDuplicates/Solution.java) |      |
|                                                              |                                                              |      |
|                                                              |                                                              |      |
|                                                              |                                                              |      |
|                                                              |                                                              |      |
|                                                              |                                                              |      |
|                                                              |                                                              |      |
|                                                              |                                                              |      |





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

