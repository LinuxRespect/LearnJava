package immutableClass;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

import java.util.Objects;

public class ImmutableSubject {

    private int id;
    private String name;

    public ImmutableSubject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImmutableSubject that = (ImmutableSubject) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        ImmutableSubject immutableSubject = new ImmutableSubject(3,"Immutable");
        System.out.println(immutableSubject.getId());
        System.out.println(immutableSubject.getName());
    }
}
