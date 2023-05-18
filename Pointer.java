
// Linked list implementation in Java

class LinkedList {
    // Creating a node
    Node head;
  
     class Node {
      int value;
      Node next;
  
      Node(int d) {
        value = d;
        next = null;
      }
    }
    public void addLast(int data){
      Node newNode=new Node(data);
      if(head==null){
        head=newNode;
      return;}
        newNode.next=null;
          Node temp=head;
          while(temp.next!=null){
          temp=temp.next;
          }
         temp.next=newNode;
         
        }
      
    public void addFirst(int firstData){
      Node newNode=new Node(firstData);
      if(head==null){
        head=newNode;
      } newNode.next=head;
      head=newNode;
    }
  public void display(){

    Node current=head;
    while(current!=null){
      System.out.print(current.value+" ");
      current=current.next;
    }
  
  }
public static void main(String[] args) {
  LinkedList l=new LinkedList();
  l.addLast(1);
  l.addLast(2);
  l.addLast(3);
  l.addFirst(0);
  l.addFirst(-4);
  l.display();
}}