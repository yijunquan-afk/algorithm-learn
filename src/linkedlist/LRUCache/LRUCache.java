package linkedlist.LRUCache;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:LRUCache
 * Package:linkedlist.LRUCache
 * Description:
 *
 * @date:2025/3/6 16:48
 * @author: Junquan Yi
 */
class LRUCache {
    class DLiinkedNode{
        int key;
        int value;
        DLiinkedNode prev;
        DLiinkedNode next;
        public DLiinkedNode(){}
        public DLiinkedNode(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private int size;
    private int capacity;
    private DLiinkedNode head, tail;
    private Map<Integer, DLiinkedNode> cache = new HashMap<>();
    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new DLiinkedNode();
        tail = new DLiinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLiinkedNode node = cache.get(key);
        if(node == null) return -1;
        // 命中了，要移动到头部
        moveTohead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLiinkedNode node = cache.get(key);
        if(node != null){
            // 命中。修改
            node.value = value;
            moveTohead(node); //放在最前面
        }else{
            DLiinkedNode newNode = new DLiinkedNode(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
            size++;
            if(size > capacity){
                // 去掉尾部的
                DLiinkedNode temp = tail.prev;
                removeNode(temp);
                cache.remove(temp.key);
                size--;
            }
        }
    }


    private void removeNode(DLiinkedNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(DLiinkedNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    private void moveTohead(DLiinkedNode node){
        removeNode(node);
        addToHead(node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
