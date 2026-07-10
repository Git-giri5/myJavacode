import java.util.*;
public class DP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the arr value");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==0){
            System.out.println(0);
            return;
        }
        int maxx=0,p1=0,p2=0;
        for(int i=0;i<n;i++){
            int take=arr[i]+p1;
            int nottake=p1;
            maxx=Math.max(take,nottake);
            p1=maxx;
            p2=p1;
        }
        System.out.println(maxx);

    }
}
