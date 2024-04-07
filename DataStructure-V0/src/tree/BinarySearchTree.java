package tree;

class Node{
    int info;
    Node left;
    Node right;

    public Node(){

    }
    public Node(int info){
     this.info = info;
    }
}

public class BinarySearchTree {
   Node root;
   public  BinarySearchTree(){

   }
   public void insert(int num){
       if(root == null){
           root = new Node(num);
       }else{
           root = insert(root,num);
       }

   }

   public Node insert(Node root , int num){
       if(root == null){
           root = new Node(num);
       }else if(root.info>num){
           if(root.left == null){
               root.left = new Node(num);
           }else{
               insert(root.left,num);
           }

       }else{
           if(root.right == null){
               root.right = new Node(num);
           }else{
               insert(root.right,num);
           }
       }
       return root;
   }

    public void inOrder(Node root) {

        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.info+" ");
        inOrder(root.right);

    }


}
