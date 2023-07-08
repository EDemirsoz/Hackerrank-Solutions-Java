

/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

	void decode(String s, Node root) {
        Node head = root;
        
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                root = root.right;
            } else if (s.charAt(i) == '0'){
                root = root.left;
            }
            
            if (root.left == null && root.right == null){
                System.out.print(root.data);
                root = head;
            }
        }
    }

