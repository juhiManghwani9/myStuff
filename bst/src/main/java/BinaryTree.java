import java.util.Scanner;

public class BinaryTree {
    Node root;

    BinaryTree(int key)
    {
        Node root = new Node(key);
    }
    BinaryTree(){
        root = null;
    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("No of elements in bst: ");
        int n = scan.nextInt();

        BinaryTree bt = new BinaryTree();

        for(int i =0; i < n; i++){
            System.out.println("Enter no: ");
            int ele = scan.nextInt();
        }
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.left.left = new Node(4);

        System.out.println("preOrder+");
        bt.preOrder(bt.root);
        System.out.println("inOrder+");
        bt.inOrder(bt.root);
        System.out.println("postOrder+");
        bt.postOrder(bt.root);

    }

    public void preOrder(Node root){
        if(root == null)
            return;

        System.out.println("Key" + root.key);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if(root == null)
            return;

        inOrder(root.left);
        System.out.println("Key" + root.key);
        inOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println("Key" + root.key);
    }
}
