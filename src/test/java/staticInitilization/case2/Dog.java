package staticInitilization.case2;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

public class Dog extends Animal
{
    private String thisName = "DDog";

    protected String getName()
    {
        return thisName;
    }
    public static void main(String[] args)
    {
        Animal animal = new Dog();
        System.out.println(animal.getFullName());
    }
}

