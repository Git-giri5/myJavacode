import java.util.*;
public class Fib{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        for(int j=0;j<n;j++){
            System.out.print(dp[j]+" ");
        }
    }
}