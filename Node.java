package com.example.linkedlist;

public class Node <T extends  Comparable<T>> implements Comparable<Node<T>> {
    public T data;
   Node<T> next;

   Node(T data){
       this.data=data;
       this.next=null;

   }

    public T getData() {
        return data;
    }


// compare two node of same type
     @Override
    public int compareTo(Node<T> a) {
        return this.data.compareTo(a.data);
    }
}


