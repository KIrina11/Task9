package ru.vsu.cs.kislova_i_v;

import java.util.List;

public class SortPositiveNumbersInAscendingOrder {
    public static List<Integer> sortPositiveNumbersInAscendingOrder(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(i) > 0) && (list.get(j) > 0) && (list.get(i) > list.get(j))) {
                    int value = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, value);
                }
            }
        }

        return list;
    }
}
