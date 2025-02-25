import java.util.Arrays;

/**
 * ClassName:Test
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2025/2/25 16:29
 * @author: Junquan Yi
 */
public class Test {
    static void changeArray(int[] arr){
        arr[0] = 1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,1,2};
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
