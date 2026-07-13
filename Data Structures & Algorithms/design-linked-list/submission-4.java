class MyLinkedList {
    class Node{
        int val;
        Node prev;
        Node next;
    public Node (int val){
        this.val = val;
        this.prev = null;
        this.next = null;
    }
    }
   Node head;
   Node tail;
   int size;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index < 0 || index >= size || size == 0){
            return -1;
        }
        else{
             if(index < size/2){
            Node curr = head;
            for(int i =0; i< index; i++){
                curr = curr.next;
            }
            return curr.val;
        }
        else {
            Node curr = tail;
            for(int i = 0; i < size-index-1; i++){
                curr = curr.prev;
            }
            return curr.val;
        }
        }

    }
    
    public void addAtHead(int val) {
        Node n = new Node(val);
        n.val = val;
        if(size == 0){
            head = tail = n;
            
        }
        else{
            head.prev = n;
            n.next = head;
            head = n;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node n = new Node(val);
        n.val = val;
        if(size == 0){
            head = tail = n;
            
        }
        else{
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        }
        else if(index == 0){
            addAtHead(val);
        }
        else if(index == size){
            addAtTail(val);
        }
        else{
            Node n = new Node(val);
            n.val = val;
            Node curr = head;
            for(int i = 0 ; i< index ;i++){
                curr = curr.next;
            }
            n.prev = curr.prev;
            curr.prev.next = n;
            curr.prev = n;
            n.next = curr;
            
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }
        else if(index == 0 ){
            if(size == 1){
            head = tail = null;
            size--;
            }
            else{
                head = head.next;
                head.prev = null;
                size--;
            }
        }
        else if( index == size-1){
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        else {
            Node curr = head;
            for(int i =0; i< index; i++){
                curr = curr.next;
            }
            Node pr = curr.prev;
            Node nex = curr.next; 
            pr.next = nex;
            nex.prev = pr;
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