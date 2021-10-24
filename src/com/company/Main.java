package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
// Пример аборигенского текста:
        String foreignText = "hate how we breathe and how we choke " +
                "the night is black your heart is zero broke" +
                "all into shapes and into shards" +
                "we smash like glass we fall like star ";
        // реализация монад
        List<String> dict = Arrays.asList(foreignText.split(" ")); // функция высших порядков
        dict = dict.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        // далее не отночится к задаче, просто тест для себя
        System.out.println(dict);
    }
}
