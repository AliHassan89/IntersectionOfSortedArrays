/*

Find the intersection of two sorted arrays.
OR in other words,
Given 2 sorted arrays, find all the elements which occur in both the arrays.

Example :

Input :
    A : [1 2 3 3 4 5 6]
    B : [3 3 5]

Output : [3 3 5]

Input :
    A : [1 2 3 3 4 5 6]
    B : [3 5]

Output : [3 5]

 */

package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindIntersection {

    public static void main(String[] args) {

        int[] arr1 = {10000000};
        int[] arr2 = {10000000};

        List<Integer> l1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> l2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());

        ArrayList<Integer> intersection = intersect(l1, l2);
        intersection.forEach(str -> System.out.print(str+", "));
    }

    public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> intersection = new ArrayList<>();
        if (A.isEmpty() || B.isEmpty())
            return intersection;

        int j = 0;
        int i=0;

        while (i<A.size() && j<B.size()) {
            if (A.get(i).equals(B.get(j))) {
                intersection.add(A.get(i));
                ++j;
                ++i;
            }
            else if (A.get(i) > B.get(j)){
                ++j;
            }
            else {
                ++i;
            }
        }
        return intersection;
    }

}
