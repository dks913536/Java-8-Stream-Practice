package com.java.top100.set03_intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Problem 27: Merge two lists.
 *
 * Input:
 * List 1 = [10, 20, 30]
 * List 2 = [40, 50, 60]
 *
 * Output:
 * [10, 20, 30, 40, 50, 60]
 */

public class P27_MergeTwoLists {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10, 20, 30);

        List<Integer> list2 = Arrays.asList(40, 50, 60);

        // =====================================
        // Approach 1:Using Stream.concat()
        // =====================================

        List<Integer> mergedList1= Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        System.out.println(mergedList1);

        // =====================================
        // Approach 2: Using Stream.of() + flatMap()
        // =====================================
        List<Integer> mergedList2=Stream.of(list1,list2)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(mergedList2);

        // =====================================
        // Approach 3:Merge + remove duplicates
        // =====================================
        List<Integer> mergedList3=Stream
                .concat(list1.stream(), list2.stream())  //merged first
                .distinct()                             // then sorted
                .collect(Collectors.toList());
        System.out.println(mergedList3);

        // =====================================
        // Approach 4:  Merge + sort
        // =====================================
        List<Integer> mergedList4=Stream.of(list1,list2)
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(mergedList4);

    }
}
