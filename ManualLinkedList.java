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
     @desc:insert node with given value at particular index
     if index is out of bound then leave it
     @params: index at which node to be added and value of node to add

      */
     public void insert(int index,int value){
         Node newNode= new Node(value);
         if(index==0) {    // insert at starting position
            newNode.next=head;
            head=newNode;
            return;
         }

         Node prev=null;

        Node curr=head;
        int cnt=0;
        while(cnt<index && curr!=null){
            prev=curr;
            curr=curr.next;
            cnt++;
        }
        if(cnt!=index) return;  // if index is out of bound
        prev.next=newNode;
        newNode.next=curr;
     }

     /*
     @desc: delete the starting node

      */
    public void pop(){
        if(head==null) return;
        head=head.next;
    }

    /*
   @desc: delete the last node
    */
    public void popLast(){
        if(head==null || head.next==null) {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.next!=null) temp=temp.next;
        temp.next=null;
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
