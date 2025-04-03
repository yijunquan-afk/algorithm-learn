package array.hIndex;

import java.util.Arrays;

/**
 * ClassName:Solution
 * Package:array.hIndex
 * Description:
 *
 * @date:2025/2/7 17:00
 * @author: Junquan Yi
 */
public class Solution {
    public int hIndex(int[] citations) {
        if(citations.length == 1 && citations[0] > 0){
            return 1;
        }
        Arrays.sort(citations);
        int hIndex = 0, n = citations.length;
        for(int i = n - 1; i >= 0 ; i--){
            int temp = 0;
            if(citations[i] <= n - i){
                temp =  citations[i];
            }else{
                temp = n - i;
            }
            hIndex = Math.max(hIndex, temp);
        }
        return hIndex;
    }

}
