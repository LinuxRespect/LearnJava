package polymorphism;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

public class Subclass extends  Superclass{

    Subclass(int a) {
        super(a);
    }

    // overrides printMethod in Superclass
    public void printMethod() {
       super.printMethod();
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
        Subclass s = new Subclass(5);
        s.printMethod();
    }
}
