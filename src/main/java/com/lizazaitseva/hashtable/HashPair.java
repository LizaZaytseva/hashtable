package com.lizazaitseva.hashtable;

import java.util.ArrayList;
import java.util.Objects;

public class HashPair {
    private int key;
    private int value;

    HashPair(Integer val) {
        key = val.hashCode();
        value = val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }

    //возвращение ключа пары
    public int getFirst() {
        return this.key;
    }

    //возращение значения
    public int getSecond() {
        return this.value;
    }

    public String toString() {
        StringBuilder builder =  new StringBuilder();
        builder.append(this.key).append(" - ").append(this.value);
        return builder.toString();
    }

}
