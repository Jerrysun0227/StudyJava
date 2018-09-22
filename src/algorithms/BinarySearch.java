package algorithms;

/**
 * @Title
 * @Author sw840227@gmail.com
 * @Date 九月-22-2018
 * @Version 1.0
 * @Github https://github.com/Jerrysun0227/
 */

public class BinarySearch {

    public int searchIndex(int[] origin, int target) {
        boolean isFind = false;
        int lowIndex = 0;
        int hightIndex = origin.length;
        int middleIndex = -1;
        while(lowIndex <= hightIndex) {
            if (hightIndex % 2 == 0) {
                middleIndex = (lowIndex + hightIndex) / 2;
            } else {
                middleIndex = (lowIndex + hightIndex) / 2 + 1;
            }
            if (origin[middleIndex] < target) {
                lowIndex = middleIndex + 1;
            } else if (origin[middleIndex] > target) {
                hightIndex = middleIndex - 1;
            } else if (origin[middleIndex] == target){
                isFind = true;
                break;
            }
        }
        if (!isFind) {
            middleIndex = -1;
        }
        return middleIndex;
    }
}
