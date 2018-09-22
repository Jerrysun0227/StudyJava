package algorithms;

/**
 * @Title
 * @Author sw840227@gmail.com
 * @Date 九月-20-2018
 * @Version 1.0
 * @Github https://github.com/Jerrysun0227/
 */

public class InsertionSort {

    public int[] sort(int[] origin) {
        for (int i = 1; i < origin.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (origin[j] > origin[j+1]) {
                    int temp = origin[j+1];
                    origin[j+1] = origin[j];
                    origin[j] = temp;
                } else {
                    break;
                }
            }
        }
        return origin;
    }
}
