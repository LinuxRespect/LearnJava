package collection;/* Copyright © 2023 EIS Group and/or one of its affiliates. All rights reserved. Unpublished work under U.S. copyright laws.
CONFIDENTIAL AND TRADE SECRET INFORMATION. No portion of this work may be copied, distributed, modified, or incorporated into any other media without EIS Group prior written consent.*/

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.List;

public class Apple {
    public int weight;
    Apple(int weight){
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Apple apple = new Apple(5);
        List<Apple> appleList = Arrays.asList(new Apple(5),new Apple(10),new Apple(3));
      appleList.sort(comparing(Apple::getWeight));
      for (Apple apple1 : appleList) {
          System.out.println(apple1.getWeight());

      }
    }


}
