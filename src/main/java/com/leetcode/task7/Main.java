package com.leetcode.task7;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> males = Arrays.asList("guy1", "guy2", "guy3", "guy4", "guy5");
        List<String> females = Arrays.asList("girl1", "girl2", "girl3", "girl4");
        List<String> unknowns = Arrays.asList("alien1", "alien2", "alien3", "alien4");

        List<List<String>> input = Arrays.asList(males, females, unknowns);

        input.stream()
                .distinct()
                .findFirst()
                .ifPresent(group -> System.out.println("First distinct group: " + group));

        List<String> malesFemales = input.stream()
                .flatMap(Collection::stream)
                .filter(str -> str.contains("guy") || str.contains("girl"))
                .toList();

        System.out.println("\nFiltered guy/girl:");
        malesFemales.forEach(System.out::println);

        List<Male> maleType = input.stream()
                .flatMap(Collection::stream)
                .filter(str -> str.contains("guy"))
                .map(Male::new)
                .toList();

        System.out.println("\nMapped to Male:");
        maleType.forEach(System.out::println);
    }
}
