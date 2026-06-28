class Node{
    int value;
    Node next;
    public Node(int val){
        value = val;
    }
}
class LinkedList {
    Node head;
    int size = 0;
    public LinkedList() {

    }

    public int get(int index) {
        Node curr = head;
        if(index >= size || index<0){
            return -1;
        }else{
            if( curr != null){
            for(int i =0; i< index; i++){
                curr = curr.next;
            } 
            }
            return curr.value;
        }
    }

    public void insertHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
        size++;
    }

    public void insertTail(int val) {
        Node l = new Node(val);
        Node curr = head;
        if(head == null){
            head = l;
            size++;
        }
        else if(head != null){
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = l;
        size++;
        }
        
    }

    public boolean remove(int index) {
        if( index < 0 || index >= size){
            return false;
        }
        if(index == 0){
            head= head.next;
            size--;
        }
        else{
            Node curr = head;
            for(int i =0; i< index-1; i++){
                curr = curr.next;
            } 
            curr.next= curr.next.next;
            size--;
        }
        return true;
        
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> a = new ArrayList<>();
        Node curr = head;
        if(head != null){
        for(int i=0; i<size;i++){
            a.add(curr.value);
            curr = curr.next;
        }
        }
        return a;
    }
}
