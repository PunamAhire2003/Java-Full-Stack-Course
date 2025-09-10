class BinaryTree<E>{
    Node<E> root;
     static class Node<E>{
        E ele;
        Node<E> left,right;
        Node(E ele){
            this.ele=ele;
        }
    }
    public void preOrder(Node<E>root){
        if(root==null)return;
        System.out.println(root.ele+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(Node<E>root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.ele+ " ");


    }
    public void inOrder(Node<E>root){
        if(root==null)return;
        inOrder(root.left);
        System.out.println(root.ele+ " ");
        inOrder(root.right);
    }
}
class TreeExample{
    public static void main(String[] args) {
        BinaryTree<Character>tree=new BinaryTree<Character>();
        tree.root=new BinaryTree.Node<Character>('P');
        tree.root.left=new BinaryTree.Node<Character>('Q');
        tree.root.right=new BinaryTree.Node<Character>('R');
        tree.root.left.left=new BinaryTree.Node<Character>('S');
        tree.root.left.right=new BinaryTree.Node<Character>('T');
        tree.root.right.left=new BinaryTree.Node<Character>('U');
        
        System.out.println("preOrder:");
        tree.preOrder(tree.root);
        System.out.println("\n------------------\n ");
        System.out.println("postOrder : ");
        tree.postOrder(tree.root);
        System.out.println("\n------------------\n ");
        System.out.println("inOrder");
        tree.inOrder(tree.root);

        
    }
}
