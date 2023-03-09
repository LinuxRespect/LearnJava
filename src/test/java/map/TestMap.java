package map;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

import java.util.HashMap;
import java.util.Map;

public class TestMap {

   public static void main(String[] args) {
       Map<String, Object> m1 = new HashMap<>();
       m1.put("k1","s");
       Map<String, Object> m2 = new HashMap<>(m1);
       m1.put("k2",m2);
       Map<String, Object> m3 = new HashMap<>(m1);
       m2.put("k2",m3);
       m1.put("k3",m2);
       System.out.print(m1);
    }

}
