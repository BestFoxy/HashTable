package ru.bestfoxy.hashtable;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(8);

        //ВСТАВКА ЭЛЕМЕНТОВ
        hashTable.insert(11);
        hashTable.insert(5);
        hashTable.insert(15);
        hashTable.insert(20);
        hashTable.insert(2);

        //ДЕБАЖИМ ТЕКУЩУЙ ХЭШ
        hashTable.printTable();

        //ПРОВЕРЯЕМ НАЛИЧИЕ
        System.out.println("Search 15: " + hashTable.search(15));
        System.out.println("Search 7: " + hashTable.search(7));

        //УДАЛЯЕМ ЭЛЕМЕНТЫ
        hashTable.delete(15);
        hashTable.delete(7);

        //ДЕБАЖИМ ТЕКУЩУЙ ХЭШ
        hashTable.printTable();
    }
}
