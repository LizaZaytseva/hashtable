package com.lizazaitseva.hashtable;

import java.util.ArrayList;
import java.lang.IndexOutOfBoundsException;

import static java.sql.DriverManager.println;

/**
 * Хэш-Таблица
 * Хранит целые числа в виде хэш-таблицы.
 * Таблица не может содержать одно и тоже число более одного раза
 * Методы:
 *   Добавление числа,
 *   удаление числа,
 *   поиск числа в дереве,
 *   сравнение на равенство
 *
 * */

public class HashTable {

    private ArrayList<HashPair> body;

    public HashTable() {
        body = new ArrayList<>();
    }

    //поиск числа по ключу
    public int get(int key) {
        int result = 0;
            for (HashPair aBody : body) {
                if (key == aBody.getFirst()) {
                    result =  aBody.getSecond();
                }
            }
            if (result != 0) return result;
            else throw new IndexOutOfBoundsException();
    }

    //добавление числа
    public void add(int value) {
        HashPair newPair = new HashPair(value);
        int key = newPair.getFirst();
        if (!this.search(key)) {
            body.add(newPair);
        }
    }

    //удаление пары по ключу
    public void remove(int key) {
        if (this.search(key)) {
            for (HashPair aBody : body) {
                if (key == aBody.getFirst()) body.remove(aBody);
            }
        } else throw new IndexOutOfBoundsException();
    }

    //поиск пары по индексу
    public HashPair set(int index) {
        if (index < body.size()) return body.get(index) ;
        else throw new IndexOutOfBoundsException();
    }

    //определение наличия пары по ключу
    public boolean search(int key) {
        for (HashPair aBody : body) {
            if (key == aBody.getFirst()) return true;
        }
        return false;
    }

    //сравнение на равенство 2 hashTable
    public boolean equal( HashTable body2) {
        for (int i = 0; i < body.size(); i++) {
            if ((this.set(i).getSecond() != body2.set(i).getSecond()))
                return false;
        }
        return true;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < body.size(); i++) {
            if (i == body.size() - 1) {
                builder.append(body.get(i).getFirst()).append(" - ").append(body.get(i).getSecond());
            } else  builder.append(body.get(i).getFirst()).append(" - ").append(body.get(i).getSecond()).append("\n");
        }
        return builder.toString();
    }
}
