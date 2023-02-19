package com.google.sample.cloudvision;

public class kiridashi {
    public static void main(String[] args) {
        String str = "あいうえおかきくけこ";
        System.out.println("元の文章：" + str);
        String substr = str.substring(3, 7);
        System.out.println("抜き出した文章：" + substr);

        String msg1 = str;
        System.out.println(msg1.length());
    }
}
