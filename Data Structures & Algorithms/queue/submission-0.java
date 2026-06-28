class Deque {
    ArrayList<Integer> queue = new ArrayList<>();

    public Deque() {

    }

    public boolean isEmpty() {
        return !(queue.size() > 0);
    }

    public void append(int value) {
      queue.add(value);
    }

    public void appendleft(int value) {
        ArrayList<Integer> queue2 = new ArrayList<>();
       queue2.add(value);
       for(int i=0;i<queue.size();i++){
        queue2.add(queue.get(i));
       }
       queue = queue2;
    }

    public int pop() {
        if(!isEmpty()){
        int removed_elem = queue.get(queue.size()-1);
        queue.remove(queue.size()-1);
        return removed_elem;
        }
        else{
            return -1;
        }
    }

    public int popleft() {
        if(!isEmpty()){
        int removed_elem = queue.get(0);
        queue.remove(0);
        return removed_elem;
        }
        else{
            return -1;
        }
        
    }
}
