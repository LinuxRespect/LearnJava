package exception;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

public class Main {
       public static void main(String[] args) {
            try {
                System.out.println(methodA());
            }
            catch (Throwable ex) {
                System.out.println("Main Catch");
            }
        }
        static int methodA() {
            if(methodB() >0) {
                try {
                    throw new UnknownError();
                }
                catch (Exception ex) {
                    return 2;
                }
            }
            else {
                return 3;
            }
        }
        static int methodB()
        {
            try {
                throw new RuntimeException();
            }
            catch (Exception ex) {
                return 0;
            }
            finally {
                return 1;
            }
        }

}
