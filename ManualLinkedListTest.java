package com.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManualLinkedListTest {
   @Test
   void Searchtest(){
       ManualLinkedList list = new ManualLinkedList();
       list.add(56);
       list.add(30);
       list.add(70);
       assertEquals (true,list.search(70));
       assertEquals (true,list.search(56));
       assertEquals (true,list.search(30));
       assertEquals (false,list.search(99));

       assertEquals("56 30 40 70 ",list.insertAfter(40,30));
   }

}