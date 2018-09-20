import algorithms.InsertionSort;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Title
 * @Author sw840227@gmail.com
 * @Date 九月-20-2018
 * @Version 1.0
 * @Github https://github.com/Jerrysun0227/
 */

class Main {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] result = insertionSort.sort(new int[]{3, 5, 7, 2, 4, 6, 1, 8, 9});
        System.out.println(Arrays.toString(result));
    }
}
