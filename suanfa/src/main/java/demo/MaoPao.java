package demo;

/**
 * 冒泡算法
 */
public class MaoPao {
    public static void main(String[] args) {
//        int[] arr = new int[]{0,45,2,46,1,43,90,7,8,9,54,67,89,14};
        int[] arr = {0,45,2,46,1,43,90,7,8,9,54,67,89,14};
        int count1 = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                count1++;
            }
        }
        System.out.print("排序后:");
        ShowDemo(arr);
        System.out.println("比较次数为:" + count1);
    }
    public static void ShowDemo(int[] arr){
        for (int d : arr) {
            System.out.print(d + ",");
        }
        System.out.print(" ");
    }
}
