class TreeNode{
    int key;
    int val;
    TreeNode right;
    TreeNode left;
    public TreeNode(int key, int val){
        this.key = key;
        this.val = val;
    }
}
class TreeMap {
    TreeNode root;

    public TreeMap() {
    }
    public TreeNode insertNode(int key,int val, TreeNode node){
        if(node == null){
            return new TreeNode(key,val);
        }
        else if(key < node.key){
            node.left = insertNode(key,val,node.left);
        }
        else if(key > node.key){
            node.right = insertNode(key,val,node.right);
        }
        else{
            node.val = val;
        }
        return node;
    }
    public int searchNode(int key, TreeNode node){
        
        if(node == null){
                return -1;
            }
            else{
                if(node.key == key){
                    return node.val;
                }
                else if(key < node.key){
                  return  searchNode(key,node.left);
                }
                else if(key > node.key){
                  return  searchNode(key,node.right);
                }
            }
        return -1;

    }
    public void insert(int key, int val) {
        if(root == null){
            root = new TreeNode(key,val);
        }else{
            root = insertNode(key,val,root);
        }
    }
    public TreeNode findMin(TreeNode n){
        while(n.left != null){
            n= n.left;
        }
        return n;
    }
    public int findMax(TreeNode n){
        while(n.right != null){
            n= n.right;
        }
        return n.val;
    }
    public int get(int key) {
       return searchNode(key,root);
    }

    public int getMin() {
        if(root != null){
         return findMin(root).val;
        }
        else{
            return -1;
        }
    }

    public int getMax() {
        if(root != null){
         return findMax(root);
        }
        else{
            return -1;
        }
    }
    public TreeNode removeNode(TreeNode n, int k){
        if(n == null){
            return null;
        }
        if(k < n.key){
            n.left = removeNode(n.left,k);
        }
        else if(k> n.key){
            n.right = removeNode(n.right,k);
        }
        else{
            if(n.left == null && n.right== null){
                return null;
            }
            if(n.left == null ){
                return n.right;
            }
            if(n.right == null){
                return n.left;
            }
            TreeNode successor = findMin(n.right);
            n.key = successor.key;
            n.val = successor.val;
            n.right = removeNode(n.right,successor.key);

        }
        return n;
    }
    public void remove(int key) {
    
       if(root == null){
        return;
       }
       else {
       root = removeNode(root, key);
       }
    }
    public List<Integer> inorder(TreeNode n, List<Integer> k){
        if(n != null){
        if(n.left != null){
            inorder(n.left,k);
        }
        k.add(n.key);
        if(n.right != null){
        inorder(n.right,k);
        }
        }
        return k;
    }
    public List<Integer> getInorderKeys() {
        List<Integer> l = new ArrayList<>();
        l = inorder(root,l);
        int[] list = new int[l.size()];
        for(int i=0; i<l.size() ;i++){
            list[i]= l.get(i);
        }
        return l;
    }
}
