package io.terminus.paas.console.web;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sfwn on 16/3/26.
 *

 输入
   输入数据有多组，每组占一行，包括两个整数m和n（100<=m<=n<=999）。
 输出
   对于每个测试实例，要求输出所有在给定范围内的水仙花数，就是说，输出的水仙花数必须大于等于m,并且小于等于n，如果有多个，则要求从小到大排列在一行内输出，之间用一个空格隔开;
 如果给定的范围内不存在水仙花数，则输出no;
 每个测试实例的输出占一行。

 样例输入
 100 120
 300 380
 样例输出
 no
 370 371

 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList list = new ArrayList();
        while (in.hasNextLine()) {
            String str = in.nextLine();
            if (str.equals("")) break;
            list.add(str);
        }
        for (int i = 0; i < list.size(); i++) {
            String[] str = list.get(i).toString().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            if (a > b || a < 100 || a > 999 || b < 100 || b >999) {
                System.out.println("no");
                return;
            } else {
                int flag = 0;
                for (int j = a; j <= b; j++) {
                    if (sxh(j) != -1) {
                        System.out.print(j + " ");
                        flag++;
                    }
                }
                if (flag == 0) System.out.print("no");
                System.out.println();
            }
        }
    }

    public static int sxh(int i) {
        int b = i / 100;
        int s = (i - b * 100) / 10;
        int g = i % 10;
        if ((b * b * b + s * s * s + g * g * g) == i) {
            return i;
        } else {
            return -1;
        }
    }
}

