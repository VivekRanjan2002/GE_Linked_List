package com.example.linkedlist;


public class Main {
    public static void main(String[] args) {

        // UC1 initialisation of list
        ManualLinkedList<Integer> list= new ManualLinkedList();
         // UC2 create and add
        list.add(70);  //70
        list.add(30);  // 30 70
        list.add(56);
        list.display(); // 56 30 70
        list.delete(56); // 30 70
        list.delete(70); // 30
        list.delete(30);

        //  UC3 create and append
        list.append(56); // 56
        list.append(70);  //  56-> 70

        // UC4 insert at particular index
        list.insert(1,30); // 56->30->70

        //  UC5 pop method
        list.pop();
        list.display(); // 30->70
        list.insert(0,56); // 56->30->70

        // UC6 popLast
        list.popLast();
        list.display(); // 56->30

        // UC7 ability to search
        list.search(30);  // return true
        list.search(33); // return false;

        //UC8 ability to insert after particular node
        list.insertAfter(40,30);
        list.display();  // 56->30->40

        // UC9 ability to delete particular node and return current size of list
        list.delete(40); // 2


        // UC10  creating sorted list
        ManualLinkedList sortedlist= new ManualLinkedList();
        sortedlist.addSortedManner(56);
        sortedlist.addSortedManner(30);
        sortedlist.addSortedManner(40);
        sortedlist.addSortedManner(70);
        sortedlist.display();   // 30->40->56->70


    }

}