/* Copyright © 2022 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S.
copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or
incorporated into any other media without EIS Group prior written consent.*/
package logicalTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeleteDublicateAndUpperCase {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(Arrays.asList("Walter_White", "", "  ", "Jesse_Pinkman", null,
            "null", "Walter_White"));
        List<String> uniqueDataList = Optional.ofNullable(namesList)
            .orElseGet(Collections::emptyList)
            .stream()
            .filter(Objects::nonNull)
            .map(s -> s.replace(" ", ""))
            .filter(e -> e.chars().count() > 0)
            .distinct().collect(Collectors.toList());
        System.out.println("Unique Data List = " + uniqueDataList);

        //        Вывести все имена большими буквами без дубликатов.
        //                Ожидаемый результат:
        //
        //[WALTER_WHITE, NULL, JESSE_PINKMAN]
        //

    }
}
