package org.paumard;

import java.util.List;
import java.util.function.Function;

public class B_Function {

    public static void main(String[] args) {

        var strings = List.of("one", "two", "three", "four", "five");

        Function<String, String> mapper1 = s -> s.toUpperCase();
        Function<String, Integer> mapper2 = s -> s.length();
        Function<String, String> mapper3 = s -> {
            if (s.length() > 4) {
                return s.substring(0, 4);
            } else {
                return s + "-".repeat(4 - s.length());
            }
        };
        strings.stream()
              .map(mapper3)
              .forEach(s -> System.out.println(s));

    }
}
