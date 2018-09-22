import algorithms.BinarySearch;
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
        testBinarySearch();
    }

    private static void testInsertionSort() {
        InsertionSort insertionSort = new InsertionSort();
        int[] result = insertionSort.sort(new int[]{3, 5, 7, 2, 4, 6, 1, 8, 9});
        System.out.println(Arrays.toString(result));
    }

    private static void testBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch
            .searchIndex(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 89}, 89);
        if (result > 0) {
            System.out.println("The target is in the index '" + result + "'.");
        } else {
            System.out.println("The target is not in the queue.");
        }
    }
}
