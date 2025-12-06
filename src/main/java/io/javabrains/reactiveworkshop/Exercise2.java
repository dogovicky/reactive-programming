package io.javabrains.reactiveworkshop;

import java.io.IOException;

/*
 * Flux: Represents and synchronous sequence of items (can also be synchronous), things that happen overtime. 0 to n items
 * Mono: Represents and asynchronous item (one item), that may or not come in the future. 0 or 1 item
 */

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        ReactiveSources.intNumbersFlux().subscribe(System.out::println); // subscribe() works like forEach() in reactive worldk

        // Print all users in the ReactiveSources.userFlux stream
        //ReactiveSources.userFlux().subscribe(user -> System.out.println(user));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
