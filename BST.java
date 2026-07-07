import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this .data=data;
        left=right=null;
    }
    Node root;
    Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;

    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

}
public class BST{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the nodes: ");
        Node root=null;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            if(root==null){
                root=new Node(data);
            }else{
                root.insert(root,data);
            }
        }
        /*while(true){
            System.out.println("1. Inorder");
            System.out.println("2. Preorder");
            System.out.println("3. Postorder");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Inorder: ");
                    root.inorder(root);
                    break;
                    
                case 2:
                    System.out.println("Preorder: ");
                    root.preorder(root);
                    break;
                    
                case 3:
                    System.out.println("Postorder: ");
                    root.postorder(root);
                    break;
                    
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }*/
       System.out.println("Inorder: ");
       root.inorder(root);
       System.out.println();
       System.out.println("Preorder: ");
       root.preorder(root);
       System.out.println();
       System.out.println("Postorder: ");
       root.postorder(root);
       System.out.println();
        
        
    }
}