package staticInitilization.orderInitilization;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

public class Base {
    public int x=1;
    public static  int a =6;
    public static final int c= 20;

    Base(){
        System.out.println("Invoke constructor Super class");
    }

    {
        System.out.println("Simple block Super class");
    }

    static {
        System.out.println("Static block Super class");
    }

    public static void  testBase(){
        System.out.println("static method Super class");
    }
}
