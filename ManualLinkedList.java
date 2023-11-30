package com.example.linkedlist;

public class ManualLinkedList {
    Node head;
/*
@desc: static method to initialise linked list and return it
 */
   public static ManualLinkedList List(){
       ManualLinkedList list= new ManualLinkedList();
       return list;
   }
   /*
   @desc: add item to the linked  list
    */
     public void add ( int data) {
         Node newNode= new Node(data);
         if(head==null){
             head=newNode;
         }
         else{
             Node temp=head;
             while(temp.next!=null) temp=temp.next;
             temp.next=newNode;
         }
     }
/*
@desc: print all the linkedlist
 */
     public void display(){
       Node temp=head;
       while(temp!=null){
           System.out.println(temp.data);
           temp=temp.next;
       }
     }
}
