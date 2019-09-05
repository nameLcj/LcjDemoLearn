package demo;

/**
 * 99乘法口诀
 */
public class ChengFaDemo {
    public static void main(String[] args) {
        //外循环控制行数
        for (int i = 1; i <10 ; i++) {
            //内循环控制列数
            for (int j = 1; j <=i ; j++) {
                System.out.print(j +"*" + i +"=" + i * j +'\t' );
            }
            //每次循环之后进行换行
            System.out.println();
        }
    }
}
