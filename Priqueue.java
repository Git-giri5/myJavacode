import java.util.*;
public class Priqueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());//it is used to reverse the queue
        System.out.println("Enter the no of element");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        System.out.println("Enter the nth largest element to find:");
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            q.poll();
        }
        System.out.println(q.peek());
    }
}
