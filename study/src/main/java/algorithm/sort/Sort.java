package main.java.algorithm.sort;

import java.util.List;

@FunctionalInterface
public interface Sort<T extends Comparable<? super T>> {
    List<T> sort(List<T> list);

    static <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
