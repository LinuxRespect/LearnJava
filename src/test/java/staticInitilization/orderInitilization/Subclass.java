package staticInitilization.orderInitilization;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

import subclasess.B;

public class Subclass  extends Base{
    public int y=2;
    public static  int f =61;
    public static final int g= 23;

    Subclass(){
        System.out.println("Invoke constructor subclass");
    }

    {
        System.out.println("Simple block  subclass");
    }

    static {
        System.out.println("Static block subclass");
    }

    public static void  test(){
        System.out.println("static method subclass");
    }

    public static void main(String[] args) {
        Base base = new Base();
        Subclass subclass = new Subclass();
        Base.testBase();
        Subclass.test();
        Subclass.testBase();
        int fsdf = base.x;
        int ex = subclass.x;
    }
}
