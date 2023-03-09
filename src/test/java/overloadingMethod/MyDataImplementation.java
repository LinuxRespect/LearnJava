package overloadingMethod;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

public class MyDataImplementation  implements MyDataInterface{

    public  void log(){
        System.out.println("Class realization ");

    }
    public static void main(String[] args) {
        MyDataImplementation myDataImplementation = new MyDataImplementation();
        myDataImplementation.log();

    }
}
