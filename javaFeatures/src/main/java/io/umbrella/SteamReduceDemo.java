package io.umbrella;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SteamReduceDemo {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        int multiply = integers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiply);

        Optional<Integer> result = integers.stream().reduce((a, b) -> a + b);
        result.ifPresent(integer -> System.out.println(integer));

        Optional<Developer> developer = Developer.developers.stream().reduce((dev1, dev2) ->
                dev1.yearOfExperience > dev2.yearOfExperience ? dev1:dev2);
        developer.ifPresent(System.out::println);
    }
}

class Developer {

    String name;
    int yearOfExperience;

    public Developer(String name, int yearOfExperience) {
        this.name = name;
        this.yearOfExperience = yearOfExperience;
    }

    static List<Developer> developers = Arrays.asList(
        new Developer("John", 3),
        new Developer("Mark", 2),
        new Developer("Montassar",4),
        new Developer("Zorie",2)
    );

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                '}';
    }
}
