package linkedlistdemo3;

import java.util.Hashtable;

/**
 *
 * @author Novjean
 */
public class LinkedListDemo3 {

    public int data;
    public LinkedListDemo3 next;

    public LinkedListDemo3(int data){
        this.data= data;
    }

    public void display(){
        System.out.print(data + " -> ");
    }
    
    public static void main(String[] args) {
       LinkList ll = new LinkList();
       ll.InsertAtBegin(5);
       ll.InsertAtBegin(10);
       ll.InsertAtBegin(15);
       ll.InsertAtBegin(15);
       ll.InsertAtBegin(25);
       ll.InsertAtBegin(15);
       
       ll.Display();
       //ll.RemoveAtBegin();
       //ll.Display();
       
       //ll.RemoveAtEnd();
       //ll.Display();
       
       //ll.DeleteDuplicates();
       ll.DeleteDuplicatesWithoutBuffer();
       ll.Display();
       
       System.out.println();
       LinkedListDemo3 res = ll.nthToLast(3);
       System.out.println("nth to Last values is : "+res.data);
   }
    
}

class LinkList{
    public LinkedListDemo3 root;
    
    LinkList(){
        root = null;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public void InsertAtBegin(int data){
        LinkedListDemo3 newNode = new LinkedListDemo3(data);
        newNode.next = root;
        root = newNode;
    }
    
    public void RemoveAtBegin(){
        LinkedListDemo3 temp = root;
        if(isEmpty()){
            System.out.println("Empty linked list.");
        }
        else{
            temp = temp.next;
            root = temp;
        }
    }
    
    public void RemoveAtEnd(){
        LinkedListDemo3 temp = root;
        LinkedListDemo3 prev = null;
        if(isEmpty()){
            System.out.println("Empty linked list.");
        }
        else{
            while (temp.next!=null){
                prev = temp;
                temp=temp.next;
            }
            prev.next = null;
        }
    }
    
    public void DeleteDuplicates(){
        Hashtable table = new Hashtable();
        LinkedListDemo3 prev = null;
        LinkedListDemo3 temp = root;
        
        while(temp!=null){
            if(table.containsKey(temp.data))
                prev.next = temp.next;
            else{
                table.put(temp.data, true);
                prev = temp;
            }
            temp = temp.next;
        }
    }
    
    public void DeleteDuplicatesWithoutBuffer(){
        if(isEmpty()){
            System.out.println("Empty Linked List.");
            return;
        }
        LinkedListDemo3 prev = root;
        LinkedListDemo3 curr = prev.next;
        while(curr.next != null){
            LinkedListDemo3 runner = root;
            while(runner!=curr){
                if(runner.data == curr.data){
                    LinkedListDemo3 temp = curr.next;
                    prev.next = temp;
                    curr = temp;
                    break;
                }
                runner = runner.next;
                
            }
            if(runner == curr){
                prev = curr;
                curr = curr.next;
            }
        }
    }
    
    public LinkedListDemo3 nthToLast(int n){
        LinkedListDemo3 head = root;
        if(head == null || n<1){
            return null;
        }
        LinkedListDemo3 p1 = head;
        LinkedListDemo3 p2 = head;
        for(int j = 0; j<n-1; j++){
            if(p2 == null){
                return null;
            }
            p2 = p2.next;
        }
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    
    public void Display(){
        LinkedListDemo3 temp = root;
        System.out.println();
        System.out.print("root -> ");
        while(temp!=null){
            temp.display();
            temp = temp.next;
        }
        
    }
    
}
