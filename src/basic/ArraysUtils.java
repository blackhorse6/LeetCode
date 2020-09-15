package basic;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Description     ----
 * ----      Example         ----
 */
public class ArraysUtils {

    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        System.out.println("数组长度是="+arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
