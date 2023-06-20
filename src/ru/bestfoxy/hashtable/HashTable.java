package ru.bestfoxy.hashtable;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class HashTable {

    //РАЗМЕР ТАБЛИЦЫ
    private final int size;
    //СПИСКИ
    private final LinkedList<Integer>[] table;

    public HashTable(int size) {
        this.size = size;
        this.table = new LinkedList[size];
        //ИНИЦИЛИЗИРУЕМ КАЖДЫЙ ЭЛЕМЕНТ МАССИВА
        Arrays.fill(table, new LinkedList<>());
    }

    /* ПОЛУЧАЕМ ИНДЕКС В МАССИВЕ */
    private int hash(int key) {
        return key % size;
    }

    /* ВСТАВКА ЭЛЕМЕНТА */
    public void insert(int key) {
        //ПОЛУЧАЕМ ИНДЕКС В МАССИВЕ
        int index = hash(key);
        //СПИСОК ПОД ЭТОТ ИНДЕКТ
        LinkedList<Integer> list = table[index];
        if(!list.contains(key)) {
            list.add(key);
        }
    }

    /* ПОИСК В ТАБЛИЦЕ */
    public boolean search(int key) {
        int index = hash(key);
        LinkedList<Integer> list = table[index];
        return list.contains(key);
    }

    /* УДАЛЕНИЕ ЭЛЕМЕНТА В ТАБЛИЦЕ */
    public void delete(int key) {
        int index = hash(key);
        LinkedList<Integer> list = table[index];
        //УДАЛЯЕМ ПЕРВЫЙ ЭЛЕМЕНТ В КОЛЛЕКЦИИ
        list.removeFirstOccurrence(key);
    }

    public void printTable() {
        for(int i = 0; i < size; i++) {
            LinkedList<Integer> list = table[i];
            System.out.print("Index " + i + ": ");
            for(int number : list) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
