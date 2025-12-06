package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;

public class PlayWithFlux {

    public static void main(String[] args) {
        Flux.just(1, 2, 3) // Creates a Flux and initializes data inside it
                .subscribe(System.out::println);

        Flux.range(1, 10).subscribe(System.out::println);
    }

}
