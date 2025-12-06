package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        // toStream() takes all the elements in a Flux and converts it into a Stream
//        List<Integer> numbers = ReactiveSources.intNumbersFlux().toStream().toList();
//        System.out.println("List is: " + numbers);
//        System.out.println("Size: " + numbers.size());

        // User stream
        List<User> users = ReactiveSources.userFlux()
                .log()
                .toStream()
                .toList();
        users.forEach(user -> System.out.println(user.getFirstName()));


//        System.out.println("Press a key to end");
//        System.in.read();
    }

}
