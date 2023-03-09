package exception;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

import java.io.IOException;

public class QuestThrow {

    private static void ioRead() throws IOException{}
    public static void main(String[] args) {
        try {
            ioRead();
        }catch(IOException e){}
    }
}
