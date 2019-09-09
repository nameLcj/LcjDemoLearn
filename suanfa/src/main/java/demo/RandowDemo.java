package demo;

/***
 * 随机生成100随机数并按照升级排序展示
 */
public class RandowDemo {
    public static void main(String[] args) {
        //定义数组，作用：将随机数存放数组中
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            int temp  = (int) (Math.random()*100);
            arr[i] = temp;
            System.out.println("100内随机数生成为："+arr[i]);
        }
        System.out.println("===============================");
        //统计比较次数
        int count1 = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                //如果当前
                if (arr[i] >arr[j]){
                    int temm = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temm;
                }
                count1++;
            }
        }
        System.out.println("排序后:");
        show(arr);
        System.out.println("比较次数为:" + count1);
    }
    private static void show(int[] arr) {
        for (int d : arr) {
            System.out.print(d + ",");
        }
        System.out.println();
    }
}
