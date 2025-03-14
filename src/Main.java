import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,3,4,5,6,7};
        int[] arr3 = {7,8,9,10,11};
        int[] result1 = filterEvenIndexOddValue(arr1);
        System.out.println(Arrays.toString(result1));
        int[] result2 = filterEvenIndexOddValue(arr2);
        System.out.println(Arrays.toString(result2));
        int[] result3 = filterEvenIndexOddValue(arr3);
        System.out.println(Arrays.toString(result3));

        int[] arr4 = {3,3,3,2,2};
        int[] result4 = findDominant(arr4);
        System.out.println(Arrays.toString(result4));
        int[] arr5 = {1,2,3,4};
        int[] result5 = findDominant(arr5);
        System.out.println(Arrays.toString(result5));
        int[] arr6 = {5,5,5,5,1};
        int[] result6 = findDominant(arr6);
        System.out.println(Arrays.toString(result6));
    }

    /*public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }*/

    public static int[] filterEvenIndexOddValue (int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        int [] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }
        return result;
    }

    public static int[] findDominant(int[] arr) {
        int candidate = -1;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return new int[]{(count > arr.length / 2) ? candidate : -1};
    }
}