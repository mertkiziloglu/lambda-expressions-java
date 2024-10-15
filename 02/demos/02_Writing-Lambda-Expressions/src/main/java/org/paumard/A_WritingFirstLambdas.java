package org.paumard;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class A_WritingFirstLambdas {

    public static void main(String[] args) {

        var ints = List.of(0, 1, 2, 3, 5, 6, 7, 8, 9);
        var listOfInts = new ArrayList<>(ints);

        System.out.println("Ints");
//        ints.forEach(i -> System.out.println(i));

        listOfInts.removeIf(i -> i % 2 == 1);
        System.out.println("Filtered ints");
//        listOfInts.forEach(i -> System.out.println(i));

        // T get();
        Supplier<String> supplier = () -> "one";
        var s = supplier.get();
        System.out.println("s = " + s);

        var toString = supplier.toString();
        System.out.println("toString = " + toString);
    }
}
