  class Node {
    int val;
    Node next;
    Node(int value){
        this.val= value;
    }
    }

class LinkedList {
    int val = 0;
    int size;
    Node head;
    Node tail;

    public LinkedList() {
       head = null;
       size = 0;
    }

    public int get(int index) {
        if(index <0 || index >= size){
            return -1;
        }
        Node curr = head;
        for(int i=1;i<=index;i++){
           curr = curr.next; 
        }
        return curr.val;
    }

    public void insertHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
        size++;
        
    }

    public void insertTail(int val) {
        Node n = new Node(val);
        if(head == null){
            head = n;
        }
        else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = n;
        }
        size++;
    }

    public boolean remove(int index) {
        if(index<0 || index >= size){
            return false;
        }
        else if(index == 0){
            head = head.next;
            size--;
            return true;
        }
        Node curr = head;
        for(int i =0 ; i<index-1 ;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        Node curr = head;
        ArrayList<Integer> list = new ArrayList<>();

        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        
        return list;
    }
}
