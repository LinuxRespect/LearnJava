package exception;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

public class ExceprionThrow {
    public int meth(int x) {
        int y = 010; //1
        try {
            y += x; //2
            if(x <= 5)
                throw new Exception(); //3
            y++;
        } //4
        catch(Exception e) { y--; } //5
        System.out.println(y);
        return y;
    } //6
    public static void main(String[] args) {
        ExceprionThrow exceprionThrow = new ExceprionThrow();
       exceprionThrow.meth(5);
    }
}
