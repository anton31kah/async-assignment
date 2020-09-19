package org.alexn.async;

import java.util.ArrayList;
import java.util.List;

public final class ListUtils {
    private ListUtils(){}

    public static <T> List<T> concat(List<T> old, T elem) {
        List<T> newList = new ArrayList<>(old);
        newList.add(elem);
        return newList;
    }
}
