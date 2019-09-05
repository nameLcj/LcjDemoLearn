package demo;

import java.sql.SQLOutput;

/**
 *
 */
public class ChoosePaiXu {
    public static void main(String[] args) {
        int[] arr = {54,34,12,1,2,98,15,67,10,99,123,432,78,59,26,51,987,234,678,432,128};
        for (int i = 0; i <arr.length ; i++) {
            int minIndex=i;
            for (int j = i; j <arr.length ; j++) {
                //查找最小数
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[minIndex];
                arr[minIndex] = i;
                arr[i] = temp;
            }
            System.out.println(arr[i]);

        }

    }
    public static void ShowTest(int[] arr){
        for (int d: arr) {
            System.out.println(d);
        }
    }
}
