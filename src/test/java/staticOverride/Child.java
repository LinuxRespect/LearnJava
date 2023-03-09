package staticOverride;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

import overridingMethods.ParentClass;

public class Child extends ParentClass {

 //   @Override
    public static void calculate(){
        System.out.println("Parent-> caluclate");
    }

    public static void calculate(String s){
        System.out.println("Parent-> caluclate"+ s);
    }

}
