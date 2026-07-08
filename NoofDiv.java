import java.util.*;
public class NoofDiv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] div=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    c=c+1;
                }
            }
            div[i]=c;   
        }
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(div[i]<div[j]){
                    temp=div[i];
                    div[i]=div[j];
                    div[j]=temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        }   
    }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
}

