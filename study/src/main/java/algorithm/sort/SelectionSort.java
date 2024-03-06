package main.java.algorithm.sort;

import java.util.Comparator;
import java.util.List;

public class SelectionSort<T extends Comparable<? super T>> implements Sort<T> {

    /*
     * 1번째부터 끝까지 훑어서 가장 작은 게 1번째
     * 2번째부터 끝까지 훑어서 가장 작은 게 2번째
     * ... 반복
     * 이미 정렬되어 있는 자료구조에 삽입/제거할 때 효율적임
     */

    @Override
    public List<T> sort(List<T> list) {
        System.out.println("원본 리스트");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int target = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(target)) < 0) {
                    target = j;
                }
            }
            if (target != i) {
                Sort.swap(list, i, target);
            }
            System.out.println((i + 1) +  "번째 루프");
            System.out.println(list);
        }
        return list;
    }

}
