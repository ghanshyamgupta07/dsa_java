package tree;

public class Runner {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(7);
        bst.insert(5);
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);
        bst.insert(10);

        BinarySearchUtil.printRootToLeafPath(bst.root);
        System.exit(0);

        boolean r = BinarySearchUtil.childrenSumProperty(bst.root);
        System.out.println(r);

        BinarySearchTree bst1 = new BinarySearchTree();
        BinarySearchTree bst2 = new BinarySearchTree();

        bst1.insert(7);
        bst1.insert(5);
        bst1.insert(9);
        bst1.insert(4);
        bst1.insert(6);
        bst1.insert(8);
        bst1.insert(10);

        bst2.insert(7);
        bst2.insert(5);
        bst2.insert(9);
        bst2.insert(4);
        bst2.insert(6);
        bst2.insert(8);
        bst2.insert(10);

        BinarySearchUtil.convertToMirrorTreeUsingQueue(bst1.root);
        boolean res2 = BinarySearchUtil.isMirrorImage(bst1.root,bst2.root);
        System.out.println(res2);






    }
}
