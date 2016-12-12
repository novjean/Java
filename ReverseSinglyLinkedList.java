package reversesinglylinkedlist;

import java.util.LinkedList;
/**
 *
 * @author Novjean
 */
public class ReverseSinglyLinkedList {

    
    
    public static void main(String[] args) {
        LinkedLisT ll = new LinkedLisT();
        
        ll.InsertAtRoot(3);
        ll.InsertAtRoot(32);
        ll.InsertAtRoot(54);
        ll.InsertAtRoot(89);
        
        System.out.println("Original Linked List: " );
        ll.Display(ll.root);
        
        ll.ReverseIterative(ll.root);

    }
    
}
class Node{
    public int data;
    public Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedLisT{
    public Node root;
    
    public LinkedLisT(){
        root = null;
    }
    
    public void InsertAtRoot(int data){
        Node newNode = new Node(data);
        newNode.next = root;
        root = newNode;
    }
    
    public void Display(Node root){
        Node currNode = root;
        System.out.println();
        while(currNode != null){
            System.out.print(" -> " + currNode.data);
            currNode = currNode.next;
        }
    }
    
    public void ReverseIterative(Node root){
        Node curr = root;
        Node next = null;
        Node prev = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        root = prev;
        Display(root);
    }
}
