package cn.itcast.day04.demo04;

/*
题目要求：
比较两个数据是否相等。
参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，
并在main方法中进行测试。
 */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
        System.out.println(isSame((short) 10,(short) 20));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("byte");
        boolean same;
        if(a ==  b) {
            same = true;
        } else {
            same = false;
        } return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("short");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("long");
        boolean same;
        if(a ==  b) {
            same = true;
        } else {
            same = false;
        } return same;
    }
}
