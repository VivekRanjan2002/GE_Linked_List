package com.example.linkedlist;

public class Node implements  Comparable<Node> {
    public int  data;
   Node next;

   Node(int data){
       this.data=data;
       this.next=null;

   }

    public int getData() {
        return data;
    }

    @Override
    public int compareTo(Node a){
       return Integer.compare(data,a.data);
    }
}
