package io.rxson.rxjava.model;

import io.reactivex.Flowable;
import io.rxson.reactive.FlatStream;
import io.rxson.reactive.ReactiveIgnore;

/**
 * @author Mohamed Aly Bou Hanane
 * © 2020
 */
public class AirlinesStream {
    //jsonPath=$[*]
    @FlatStream
    private Flowable<Airline> result;

    @ReactiveIgnore
    String ignoreMe;

    public Flowable<Airline> getResult() {
        return result;
    }

    public void setResult(final Flowable<Airline> result) {
        this.result = result;
    }
}