package com.example.linkedlist;

public class ManualLinkedList <T extends Comparable<T>>{
    Node <T> head;

// @desc: static method to initialise linked list and return it

    public ManualLinkedList(){
        head=null;
    }
    //add item in linked list
public void add(T data){
        Node<T> newNode= new Node(data);
        newNode.next=head;
        head=newNode;

}
    /*
   @desc: append item to the linked  list
    */
    public void append ( T data) {
        Node<T>newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node<T>temp=head;
            while(temp.next!=null) temp=temp.next;
            temp.next=newNode;
        }
    }


    /*
    @desc: add item in sorted manner to the linked  list
     */
    public  void addSortedManner ( T data) {
        Node<T>newNode= new Node(data);
        if(head==null || head.data.compareTo(newNode.data)>=0){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node<T>prev= head;
            Node<T>curr=head;
            while(curr!=null && curr.data.compareTo(newNode.data)<0){
                prev=curr;
                curr=curr.next;
            }
            prev.next=newNode;
            newNode.next=curr;
        }


    }

    /*
    @desc:insert node with given value at particular index
    if index is out of bound then leave it
    @params: index at which node to be added and value of node to add

     */
    public void insert(int index,T value){
        Node<T>newNode= new Node(value);
        if(index==0) {    // insert at starting position
            newNode.next=head;
            head=newNode;
            return;
        }

        Node <T> prev=null;

        Node <T> curr=head;
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
        Node<T>temp=head;
        while(temp.next!=null && temp.next.next!=null) temp=temp.next;
        temp.next=null;
    }

    /*
    @desc: search an item in linked list
    @param: item to be searched
    @return : boolean if 1 then item is available and if 0 then item is not in list
     */
    public boolean search(T item){
        Node<T> temp=head;
        while(temp!=null){
            if(temp.data.equals(item)) return true;
            temp=temp.next;
        }
        return false;
    }

    /*
    @desc: insert element after particular ele and put all elements of list in string
    @params: int searchkey after which u want to add and value you want to add
    @return : string which contains every element of list
     */
    public String insertAfter(T value,T searchKey){
        Node<T> newNode = new Node(value);
        Node<T>temp=head;
        boolean searchflag=false;
        while(temp!=null){
            if(temp.data.equals(searchKey)){
                searchflag=true;
                break;
            }
            temp=temp.next;

        }
        if(searchflag==true){
            Node next= temp.next;
            temp.next=newNode;
            newNode.next=next;
        }
        String res="";
        temp=head;
        while(temp!=null){
            res+=temp.data+" ";
            temp=temp.next;
        }
        return res;

    }
    /*
    @desc: delete the node with given val in list and return the size of current list
    @params: value of node to be deleted
    @return : size of list after deleting the node
     */
    public int delete(T val){
        if(head==null) return  0;
        if(head.data.equals(val)) {
            head=head.next;
        }
        else {
            Node prev = head;
            Node curr = head;

            boolean isFound = false;
            while (curr != null) {
                if (curr.data.equals(val)) {
                    isFound = true;
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
            if (isFound) {
                prev.next = curr.next;
            }
        }
        return size();

    }


    /*
@desc: return  size of the list
     */

    public int size(){
        Node temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }


    /*
    @desc: print all the list
     */
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}