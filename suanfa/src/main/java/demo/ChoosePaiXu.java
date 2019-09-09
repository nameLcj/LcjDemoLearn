package demo;

import java.sql.SQLOutput;

/**
 *选择排序：
 *
 */
public class ChoosePaiXu {
    public static void main(String[] args) {

        int[] arr = {54,34,12,1,2,98,15,67,10,99,123,432,78,59,26,51,987,234,678,432,128};

        for (int i = 0; i <arr.length ; i++) {
            //设置最小索引
            int minIndex=i;
            for (int j = i; j <arr.length ; j++) {
                //查找最小数，并记录最小索引
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //交换比较符合条件的数
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("排序之后：");
        ShowTest(arr);

    }
    public static void ShowTest(int[] arr){
        for (int d: arr) {
            System.out.print(d + ",");
        }
        System.out.println();
    }
}
