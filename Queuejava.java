import java.util.*;
class queuee{
    int arr[];
    int front,rear,size;
    queuee(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    void enqueue(int data){
        if(rear==size-1){
            System.out.println("Queue overflow");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        arr[rear]=data;
        System.out.println("Data enqueued");
    }
    void dequeue(){
        if(front==-1||front>rear){
            System.out.println("Queue underflow");
            return;
        }
        front++;
        System.out.println("dequeued");
    }
    void peek(){
        if(front==-1||front>rear){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("peek element"+arr[front]);
    }
    void display(){
        if(front==-1||front>rear){
            System.out.println("queue is empty");
            return;
        }
        System.out.println("queue elements");
        for(int i=front;i<rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
public class Queuejava {

    public static void main(String[] args) {
        queuee q=new queuee(5);
        Scanner sc=new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("1. enqueue");
            System.out.println("2. dequeue");
            System.out.println("3. peek");
            System.out.println("4. display");
            System.out.println("5. exit");
            System.out.print("enter your choice:");
            choice=sc.nextInt();
            System.out.println();
            switch(choice){
                case 1:
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }

    
    }

}