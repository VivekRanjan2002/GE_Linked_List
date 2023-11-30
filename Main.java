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


   // creating sorted list
   ManualLinkedList sortedlist= new ManualLinkedList();
   sortedlist.addSortedManner(56);
   sortedlist.addSortedManner(30);
   sortedlist.addSortedManner(40);
   sortedlist.addSortedManner(70);
   sortedlist.display();


    }

}
