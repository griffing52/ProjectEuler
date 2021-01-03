package stream;

import java.lang.String;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        // System.out.println(Arrays.asList(2, 4, 7)
        // .stream()
        // .map(x -> x*x)
        // .collect(Collectors.toList()));

        // IntStream
        //     .range(1, 10)
        //     .skip(5)
        //     .forEach(x -> System.out.print(x + " "));

        
        // System.out.println(IntStream
        // .range(1, 5)
        // .sum());

        // Stream.of("Ava", "Aneri", "Alberto")
        //     .sorted()
        //     .findFirst()
        //     .ifPresent(System.out::println);

        // String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        // Arrays.stream(names)
        //     .filter(x -> x.startsWith("S"))
        //     .sorted()
        //     .forEach(System.out::println);

        // Arrays.stream(new int[] {1, 3, 5, 7, 9, 11, 13, 14})
        //     .map(x -> x*x)
        //     .average()
        //     .ifPresent(System.out::println);
        
        // List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        // people
        //     .stream()
        //     .map(String::toLowerCase)
        //     .filter(x -> x.startsWith("a"))
        //     .forEach(System.out::println);

        // Stream<String> bands = Files.lines(Paths.get("bands.txt"));
        // bands
        //     .sorted()
        //     .filter(x -> x.length() > 13)
        //     .forEach(System.out::println);
        // bands.close();

        // List<String> bands2 = Files.lines(Paths.get("bands.txt"))
        //     .filter(x -> x.contains("jit"))
        //     .collect(Collectors.toList());
        // bands2
        //     .forEach(System.out::println);

        // Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
        // int rowCount = (int) rows1
        //     .map(x -> x.split(","))
        //     .filter(x -> x.length == 3)
        //     .count();
        // System.out.println(rowCount);
        // rows1.close();

        // Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
        // rows2
        //     .map(x -> x.split(","))
        //     .filter(x -> x.length == 3)
        //     .filter(x -> Integer.parseInt(x[1]) > 15)
        //     .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));;

        // rows2.close();


        // Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
        // Map<String, Integer> map = new HashMap<>();
        // map = rows3
        //     .map(x -> x.split(","))
        //     .filter(x -> x.length == 3)
        //     .filter(x -> Integer.parseInt(x[1]) > 15)
        //     .collect(Collectors.toMap(
        //         x -> x[0],
        //         x -> Integer.parseInt(x[1])));
        // rows3.close();
        // for (String key: map.keySet()) {
        //     System.out.println(key + " " + map.get(key));
        // }

            // .stream()
            // .min(Comparator.comparing(Person::getAge))
            // .orElseThrow(NoSuchElementException::new);
    }
}