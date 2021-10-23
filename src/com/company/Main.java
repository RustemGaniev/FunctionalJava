package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String foreignText = "hate how we breathe and how we choke " +
                "the night is black your heart is zero broke" +
                "all into shapes and into shards" +
                "we smash like glass we fall like star ";
        List<String> dict = Arrays.asList(foreignText.split(" "));
        dict = dict.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(dict);
    }
}
