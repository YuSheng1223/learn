package com.lz.jvm.classStructure;


public class TestClass3 {

    //静态语句块只能访问到定义在静态语句块之前的变量，定义在它之后的变量，在前面的静态语句块可以赋值 但是不能访问
    static {
        i = 0;
        //   System.out.println(i);
    }

    static int i = 1;

    static class Parent {

        public static int A = 1;

        static {
            A = 2;
        }
    }

    static class Sub extends Parent {

        public static int B = A;
//        static {
//            B = 5;
//        }
    }

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(Parent.A);
        System.out.println(Sub.A);
        System.out.println(Sub.B);
    }
}
