package com.lizazaitseva.hashtable;

import java.util.ArrayList;
import java.util.Objects;

public class HashPair {

    private ArrayList<Integer> body;

    HashPair(Integer val) {
        int key = val.hashCode();
        body = new ArrayList<Integer>(2);
        body.add(key);
        body.add(val);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashPair hashPair = (HashPair) o;
        return Objects.equals(body, hashPair.body);
    }
        //remove pair
    public void remove() { body.clear(); }

    //return key of pair
    public int getFirst() {
        return body.get(0);
    }

    //return value of pair
    public int getSecond() {
        return body.get(1);
    }

    public ArrayList<Integer> getPair() {
        return body;
    }

    public String toString() {
        StringBuilder builder =  new StringBuilder();
        builder.append(body.get(0)).append(" - ").append(body.get(1));
        return builder.toString();
    }

}
