    class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        int key;
        public TreeNode(int key, int val){
            this.val = val;
            this.key = key;
        }

    }
class TreeMap {
    TreeNode root ;
    int size = 0;

    public TreeMap() {
        root = null;
    }
       public TreeNode insertNode(TreeNode node, int key, int val){
             if(node == null){
            node = new TreeNode(key,val);
        }
        if(  key > node.key){
                node.right = insertNode(node.right,key,val);
            }
            else if( key < node.key){
                node.left = insertNode(node.left,key,val);
            }
            else{
                node.val = val;
            }
            return node;
    
        }
        public TreeNode removeNode(TreeNode node, int k){
            if(node.key > k){
                node.left = removeNode(node.left,k);
            }else if(node.key < k){
                node.right = removeNode(node.right,k);
            }else{
                if(node.left == null && node.right == null){
                    return null;
                }
                if(node.left == null){
                    return node.right;
                }
                if(node.right == null){
                    return node.left;
                }
                TreeNode successor = findMin(node.right);
                node.key = successor.key;
                node.val = successor.val;
                node.right = removeNode(node.right, successor.key);
            }
            return node;
        }
        public TreeNode findMin(TreeNode n){
            while(n.left != null){
                n = n.left;
            }
            return n;
        }
        public int searchNode(TreeNode node, int key){
            int op = -1;
        if(node == null){
            return op;
        }
        else if(key == node.key){
            return node.val;
        }
        else if(key < node.key){
            op = searchNode(node.left,key); 
        }
        else{
            op = searchNode(node.right,key);
        }
        return op;
        }
        public void insert(int key, int val) {
        root = insertNode(root,key,val);
       
    }

        public void inorder(TreeNode node,List<Integer> result ){
            if(node== null){
                return;
            }
            else{
                inorder(node.left,result);
                result.add(node.key);
                inorder(node.right,result);
            }
        }
    public int get(int key) {
        return searchNode(root,key);
    }

    public int getMin() {
        TreeNode node  = root;
        if( root == null){
            return -1;
        }
        else{
            while(node.left != null){
                node = node.left;
            }
            return node.val;
        }
    }

    public int getMax() {
        TreeNode node  = root;
        if( root == null){
            return -1;
        }
        else{
            while(node.right != null){
                node = node.right;
            }
            return node.val;
        }
    }

    public void remove(int key) {
        if(root == null){
            return;
        }
        root = removeNode(root,key);
        
       
    }

    public List<Integer> getInorderKeys() {
        List<Integer> result = new ArrayList<>();
        inorder(root,result);
        return result;
    }
}
