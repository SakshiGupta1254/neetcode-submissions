class DynamicArray {
    int size = 0;
    int capacity = 0;
    int[] arr = new int[capacity];

    public DynamicArray(int capacity) {
        int[] arr2 = new int[capacity];
        arr = arr2;
        this.capacity = capacity;
    }

    public int get(int i) {
        if(i<= size){
        for(int n=0; n<=i;n++){
            return arr[i];
        }
        }
        return 0;
        
    }

    public void set(int i, int n) {
        for(int z=0;z<=i;z++){
            arr[i] = n;
        }
    
    }

    public void pushback(int n) {
        if(size < capacity){
        arr[size]=n;
        size++;
        }else{
            resize();
            arr[size] = n;
            size++;
        }
    
    }

    public int popback() {
            int elem= arr[size-1];
            arr[size-1]=0;
            size--;
            return elem;
        
    }

    private void resize() {
        int[] arr1 = new int[capacity*2];
        if(size !=0){
            for (int i=0;i<size;i++){
                arr1[i]=arr[i];
            }
        }
        arr = arr1;
        capacity = capacity*2;

    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
