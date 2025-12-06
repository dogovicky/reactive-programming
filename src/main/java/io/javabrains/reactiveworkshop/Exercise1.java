package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        System.out.println("Stream numbers:");
        StreamSources.intNumbersStream().forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5
        System.out.println("Stream numbers less than five: ");
        StreamSources.intNumbersStream().filter(num -> num < 5).forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        System.out.println("Second and third numbers greater than 5");
        StreamSources.intNumbersStream().filter(num -> num > 5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        System.out.println("First number greater than 5:");
        Integer value = StreamSources.intNumbersStream().filter(num -> num > 5)
                .findFirst()
                .orElse(-1);

        System.out.println(value);


        // Print first names of all users in userStream
        StreamSources.userStream().forEach(user -> {
            System.out.println(user.getFirstName());
        });

        // Print first names in userStream for users that have IDs from number stream
        // Use flatMap when working with two different streams
        System.out.println("Users with IDs in Int Stream");
        StreamSources.intNumbersStream()
                .flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
                .map(User::getFirstName)
                .forEach(System.out::println);

        // Option 2
        StreamSources.userStream().filter(user ->
                        StreamSources.intNumbersStream().anyMatch(id -> user.getId() == id))
                .forEach(System.out::println);

    }

}
