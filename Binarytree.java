import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class Binarytree{
    Node root;
    void insert(Node node,int data){
        if(root==null){
            root=new Node(data);
            return;
        }else{
            if(data<node.data){
                if(node.left==null){
                    node.left=new Node(data);
                    return;
                }else{
                    insert(node.left, data);
                }
            }else{
                if(node.right==null){
                    node.right=new Node(data);
                    return;
                }else{
                    insert(node.right,data);
                    
                }
            }
        }
    }
    void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    void preorder(Node node){
        if(node==null) return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    void postorder(Node node){
        if(node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Binarytree tree=new Binarytree();
        boolean flag=true;
        while(flag){
            System.out.println("1. Enter data");
            System.out.println("2. Inorder");
            System.out.println("3. Preorder");
            System.out.println("4. Postorder");
            System.out.println("5. Exit");
            System.out.print("Enter your choice:");
            int choice=sc.nextInt();
            System.out.println();
            switch(choice){
                case 1:
                    System.out.println("Enter data");
                    int data=sc.nextInt();
                    tree.insert(tree.root, data);
                    break;
                case 2:
                    tree.inorder(tree.root);
                    break;
                case 3:
                    tree.preorder(tree.root);
                    break;
                case 4:
                    tree.postorder(tree.root);
                    break;
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }


    }
    
}
