package inheritance;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

public class Subclass extends MainClass {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        System.out.println(subclass.a+15);
        subclass.calculate();
    }
}
