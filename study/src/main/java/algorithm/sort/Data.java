package main.java.algorithm.sort;

import java.util.List;

public class Data<T extends Comparable<? super T>> {
    private List<T> list;

    public void setData(List<T> list) {
        this.list = list;
    }

    public List<T> getData() {
        return list;
    }

    public void sort(Sortable<T> sortable) {
        setData(sortable.sort(getData()));
    }
}
