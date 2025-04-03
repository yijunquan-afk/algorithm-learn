package heap.medianFinder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * ClassName:MedianFinder
 * Package:heap.medianFinder
 * Description:
 *
 * @date:2025/3/14 11:53
 * @author: Junquan Yi
 */
class MedianFinder {
    PriorityQueue<Integer> queMin;
    PriorityQueue<Integer> queMax;
    public MedianFinder() {
        queMin = new PriorityQueue<Integer>();           //小顶堆储存数组大的右半部分
        queMax = new PriorityQueue<Integer>((a,b)->b-a); //大顶堆储存数组小的左半部分
    }


    public void addNum(int num){
        if(queMin.isEmpty()){
            queMin.offer(num);
        }else if(queMin.size()==queMax.size()){  //不用堆每次用logn时间自排序
            if(num>=queMax.peek()){              //直接通过比较来入堆，速度稍快
                queMin.offer(num);
            }else{
                queMin.offer(queMax.poll());
                queMax.offer(num);
            }
        }else{
            if(num<=queMin.peek()){
                queMax.offer(num);
            }else{
                queMax.offer(queMin.poll());
                queMin.offer(num);
            }
        }
    }

    public double findMedian() {
        return queMax.size()==queMin.size() ? (queMax.peek()+queMin.peek())/2.0 : queMin.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */