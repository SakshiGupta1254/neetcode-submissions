class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node prev;
    }
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        Node curr = head;
         if(index < 0 || index >= size){
            return -1;
        }
        if (index < size / 2) {
            curr = head;
            for (int i = 0; i < index; i++) curr = curr.next;
            return curr.val;
        } else {
            curr = tail;
            for (int i = 0; i < size - index - 1; i++) curr = curr.prev;
            return curr.val;
        }
    }
    
    public void addAtHead(int val) {
        Node n = new Node();
        n.val = val;
        n.prev= null;
        n.next = head;
        if(head != null){
        head.prev = n;
        }
        head = n;
        if(size == 0){
            n.next = null;
            n.prev = null;
            tail = head = n;
        }
        size++;
    }
    
 public void addAtTail(int val) {
    Node n = new Node();
    n.val = val;
    n.next = null;
    if (size == 0) {
        // list is empty, new node becomes both head and tail
        head = n;
        tail = n;
    } else {
        // attach after current tail, then update tail
        tail.next = n;
        n.prev = tail;      // set prev after we have the old tail
        tail = n;
    }
    size++;                 // one increment covers all cases
}
    
    public void addAtIndex(int index, int val) {
        Node n = new Node();
        n.val = val;
        Node curr = head;
       if(index > size){
        return;
       }
        if(index == 0 ){
            addAtHead(val);
            return;
            
        }
        else if(index != 0 && index == size){
            addAtTail(val);
            return;
           
        }
        else{
            for(int i= 0; i< index-1; i++){
                curr = curr.next;
            }
          n.prev = curr;
          n.next = curr.next;  
          curr.next.prev = n;
          curr.next = n;
          size++;
        }
        
    }
    
    public void deleteAtIndex(int index) {


        if(index <0 || index >= size){
            return;
        }
       if (index == 0) {                      // delete head
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        } 
        else if(index == size-1){
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        else{
            Node curr = head;
            for(int i= 0; i< index; i++){
                curr = curr.next;
            }
        
        Node prevNode = curr.prev;
        Node nextNode = curr.next;

        if (prevNode != null) prevNode.next = nextNode;
        if (nextNode != null) nextNode.prev = prevNode;
        size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */