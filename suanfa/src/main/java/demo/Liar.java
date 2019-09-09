package demo;

import java.util.Arrays;

/**
 * 谁在说谎。三个疑犯在法官面前各执一词。
 * 甲说：乙在说谎，
 * 乙说：丙在说谎；
 * 丙说：甲和乙都在说谎。
 * 法官为了难，甲乙丙三人谁在说谎？谁说的是真话呢？
 * &&可以用作逻辑与的运算符，表示逻辑与（and），当运算符两边的表达式的结果都为true时，整个运算结果才为true，否则，只要有一方为false，则结果为false
 * ||可以作逻辑或运算符，表示逻辑或（or），当运算符有一边为true时，整个运算结果为true！
 */
public class Liar {
    public static void main(String[] args) {
        for (int i = 0; i <=1 ; i++) {
            for (int j = 0; j <=1 ; j++) {
                for (int k = 0; k <=1 ; k++) {

                    if (((i==1&&j==0)||(i==0&&j==1))&&
                            ((j==1&&k==0)||(j==0&&k==1))&&
                            ((k==1&&i+j==0)||(k==0&&i+j>=1)))
                    {
                        System.out.print("甲\t");
                        System.out.println(i==1?"真":"假");
                        System.out.print("乙\t");
                        System.out.println(j==1?"真":"假");
                        System.out.print("丙\t");
                        System.out.println(k==1?"真":"假");
                    }
                }
            }
        }
    }
}
