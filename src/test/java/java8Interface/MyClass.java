package java8Interface;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

public class MyClass implements Interface1,Interface2{

    @Override
    public void method1(String str) {

    }

    @Override
    public void log(String str) {
        Interface1.super.log(str);
    }

    public void log(){
        System.out.println("without parametr");

    }


    @Override
    public void method3() {

    }

    @Override
    public void method2() {

    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.log("Hello");
        myClass.log();
        myClass.equals("sdf");
    }
}
