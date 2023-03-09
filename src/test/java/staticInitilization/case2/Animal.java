package staticInitilization.case2;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

public abstract class Animal
{
    private final String fullName;

    protected Animal()
    {
        fullName = "Animal " + getName();
    }

    public String getFullName()
    {
        return fullName;
    }

    protected abstract String getName();
}
