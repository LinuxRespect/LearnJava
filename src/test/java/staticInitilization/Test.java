package staticInitilization;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

public class Test {
    public int x;
    public static  int a =6;
    public static final int c= 20;

    private int b;

    Test() {
        System.out.println("Constructor");

    }
    {
       b=12;
        System.out.println("b = "+ b);
        dontStatic(b);
    }

    static {
        a = 5;
        System.out.println(doSomething(a));
    }

    private static int doSomething(int x) {
        return (x + 5);
    }

    private int dontStatic(int x){
        return (x+15);

    }

    public static void main(String[] args) {

        Test test = new Test();
        test.x = 5;
        System.out.println(Test.doSomething(14));

        System.out.println("===========");
        System.out.println(test.c);

//        static String wrongVar = "Modifier 'static' not allowed here";
//        System.out.println(wrongVar);
        System.out.println("Test2 =============");
        Test2.doTest2();

    }
}
