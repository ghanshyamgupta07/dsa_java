package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchUtil {

    public static void level_order_traversal(Node root){

        Queue<Node> queue = new LinkedList<>();
        if(root != null)
            queue.add(root);
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.info+" ");
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }

    }

    public static int size(Node root) {
        if(root ==null)
            return 0;
        return 1+size(root.left)+size(root.right);
    }

    public static int height(Node root) {
        if(root ==null)
            return 0;
        int leight = 1+ height(root.left);
        int reight = 1+ height(root.right);

        return Math.max(leight, reight);
    }

    public static boolean isIdentical(Node root1,Node root2) {
        if(root1 == null && root2 == null)
            return true;

        if(root1 == null || root2 == null)
            return false;

        return root1.info == root2.info &&
                isIdentical(root1.left,root2.left) &&
                isIdentical(root1.right,root2.right);
    }


    public static boolean isMirrorImage(Node root1,Node root2) {
        if(root1 == null && root2 == null)
            return true;

        if(root1 == null || root2 == null)
            return false;

        return root1.info == root2.info &&
                isMirrorImage(root1.left,root2.right) &&
                isMirrorImage(root1.right,root2.left);
    }

    public static boolean is_symetric(Node root){
        return isMirrorImage(root,root);
    }

    public static Node convertToMirrorTree(Node root) {
        if(root == null )
            return root ;

        // reach to leftmost and rightmost tree
        Node left = convertToMirrorTree(root.left);
        Node right = convertToMirrorTree(root.right);


        root.left = right;
        root.right = left;

        return root;
    }
    public static Node convertToMirrorTreeUsingQueue(Node root) {
        if(root == null )
            return root ;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            root = queue.poll();
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            if(root.left != null){
                queue.add(root.left);
            }
            if(root.right != null){
                queue.add(root.right);
            }

        }

        return root;
    }

    public static boolean childrenSumProperty(Node root) {

        int left_data = 0, right_data = 0;
        /* If node is NULL or it's a leaf node then  return true */
        if (root == null || (root.left == null && root.right == null))
            return true;

        if(root.left != null)
            left_data = root.left.info;
        if(root.right != null)
            right_data = root.right.info;

        return (root.info == left_data+right_data) &&
                childrenSumProperty(root.left) &&
                childrenSumProperty(root.right) ;
    }

    public static void printRootToLeafPath(Node root){
        List<Integer> path = new ArrayList<>();
        int pathLength = 0;
        dfs(root,path,pathLength);
    }
    private static void dfs(Node root, List<Integer> path, int pathLength) {
        if (root == null)
            return;

        path.add(pathLength++, root.info);

        /* it's a leaf, so print the path that led to here  */
        if (root.left == null && root.right == null)
        {
            for (int i = 0; i < pathLength; i++)
            {
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        }
        else
        {
            /* otherwise try both subtrees */
            dfs(root.left, path, pathLength);
            dfs(root.right, path, pathLength);
        }
    }

}
