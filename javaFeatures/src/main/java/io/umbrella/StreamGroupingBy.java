package io.umbrella;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamGroupingBy {
    public static void main(String[] args) {
        List<String> names = List.of("Montassar", "Amine", "Marcella", "Mark", "Josey");

        Map<Integer, List<String>> groupByLength = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLength);

        Map<Integer, List<Developer>> groupByYearOfExperience = Developer.developers.stream().collect(Collectors.groupingBy(Developer::getYearOfExperience));
        System.out.println(groupByYearOfExperience);

        Map<String, List<Developer>> groupByExperience = Developer.developers.stream().collect(Collectors.groupingBy(developer -> developer.yearOfExperience> 5? "Senior": "Junior"));
        System.out.println(groupByExperience);

        Map<Integer, Developer> integerDeveloperMap = Developer.developers.stream().collect(Collectors.groupingBy(Developer::getYearOfExperience, Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparingInt(Developer::getYearOfExperience)), Optional::get)));
        System.out.println(integerDeveloperMap);


    }
}
