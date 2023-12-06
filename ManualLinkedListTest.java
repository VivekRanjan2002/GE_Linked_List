
package com.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManualLinkedListTest {
   @Test
   void SearchtestonInteger(){
       ManualLinkedList<Integer> list = new ManualLinkedList();
       list.add(56);
       list.add(30);
       list.add(70);
       assertEquals (true,list.search(70));
       assertEquals (true,list.search(56));
       assertEquals (true,list.search(30));
       assertEquals (false,list.search(99));

       assertEquals("56 30 40 70 ",list.insertAfter(40,30));
       assertEquals(3,list.delete(40));
       assertEquals(2,list.delete(56));
       assertEquals(2,list.delete(89));
       assertEquals(1,list.delete(70));
       assertEquals(0,list.delete(30));
       assertEquals(0,list.delete(99));
   }
    @Test
    void SearchtestonDouble(){
        ManualLinkedList<Double> list = new ManualLinkedList();
        list.add(56.0);
        list.add(30.0);
        list.add(70.0);
        assertTrue(list.search(70.0));
        assertEquals (true,list.search(56.0));
        assertEquals (true,list.search(30.0));
        assertEquals (false,list.search(99.0));

        assertEquals("56.0 30.0 40.0 70.0 ",list.insertAfter(40.0,30.0));
        assertEquals(3,list.delete(40.0));
        assertEquals(2,list.delete(56.0));
        assertEquals(2,list.delete(89.0));
        assertEquals(1,list.delete(70.0));
        assertEquals(0,list.delete(30.0));
        assertEquals(0,list.delete(99.0));
    }

}

