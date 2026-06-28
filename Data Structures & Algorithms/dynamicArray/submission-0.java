class DynamicArray {
    int[] array;
    int capacity = 0;
    int size = 0;
    public DynamicArray(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i]= n;
    }

    public void pushback(int n) {
        if(size != capacity){
            array[size] =n;
        }
        else{
            resize();
            array[size] =n;
        }
        size += 1;
    }

    public int popback() {
        int pop = array[size-1];
        array[size-1] = 0;
        size -= 1;
        return pop;  
    }

    private void resize() {
    int[] array2 = new int[capacity*2];
    if(size > 0){
    for(int i=0; i < size;i++){
        array2[i] = array[i];
    }
    }
    array = array2;
    capacity *= 2;
    
    }

    public int getSize() {
        
        return size;
    }

    public int getCapacity() {
        return array.length;
    }
}
