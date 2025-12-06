package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise9 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Print size of intNumbersFlux after the last item returns
//        ReactiveSources.intNumbersFlux()
//                .count() // Keeps track of count in the flux and returns it after the last item
//                .subscribe(System.out::println);

        // Collect all items of intNumbersFlux into a single list and print it
//        ReactiveSources.intNumbersFlux()
//                .collectList() // Returns a Mono<List<Integer>> of the int Flux
//                .subscribe(System.out::println);

        // Transform to a sequence of sums of adjacent two numbers
        ReactiveSources.intNumbersFlux()
                .buffer(2)
                .map(list -> list.getFirst() + list.get(1))
                .subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
