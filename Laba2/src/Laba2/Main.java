package Laba2;

import java.util.Arrays;
import java.util.List;

import static Laba2.User.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "John", "Doe", 24, "Russia"),
                new User(2, "Jane", "Smith", 25, "Russia"),
                new User(3, "Alice", "Brown", 26, "Russia")
        );
        sortByLastName(users);
        sortByAge(users);
        age7(users);
        avg(users);
        countriesC(users);
    }

    public static void sortByLastName(List<User> users) {
        System.out.println("Сортировка по фамилии:");
        users.stream()
                .sorted((u1, u2) -> u1.getLastName().compareTo(u2.getLastName()))
                .forEach(System.out::println);

    }
    public static void sortByAge(List<User> users) {
        System.out.println("Сортировка по возрасту:");
        users.stream()
                .sorted((u1, u2) -> Integer.compare(u1.getAge(), u2.getAge()))
                .forEach(System.out::println);
    }

    public static void avg(List<User> users) {
        double average = averageAge(users);
        System.out.println("Средний возраст: " + average);
    }

    public static void age7(List<User> users) {
        boolean allOlder = olderSeven(users);
        System.out.println("Все старше 7 лет? " + allOlder);
    }

    public static void countriesC(List<User> users) {
        long distinctCountriesCount = countDistinctCountries(users);
        System.out.println("Число различных стран: " + distinctCountriesCount);
    }
}
