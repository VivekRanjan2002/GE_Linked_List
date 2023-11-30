package com.example.linkedlist;


public class Main {
    public static void main(String[] args) {
    ManualLinkedList  list= ManualLinkedList.List();

list.add(56);

list.add(70);
list.insert(1,30);
list.search(30);  // return true
 list.search(33); // return false;
        list.insertAfter(40,30);
list.display();
        System.out.println(list.delete(40));


    }

}
