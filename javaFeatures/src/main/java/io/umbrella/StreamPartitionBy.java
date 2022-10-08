package io.umbrella;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPartitionBy {


    public static void main(String[] args) {
        Predicate<Developer> experiencePredicate = developer -> developer.yearOfExperience > 3;

        Map<Boolean, List<Developer>> collect = Developer.developers.stream().collect(Collectors.partitioningBy(experiencePredicate));
        System.out.println(collect);


    }


}
