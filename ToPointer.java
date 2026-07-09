import java.util.*;
public class ToPointer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sub(arr);
    }
    
    static void sub(int[] arr) {
        int n = arr.length;
        int[] dup1 = arr.clone();
        int idx=0;
        int l=0,r=n-1,ls=arr[0],rs=arr[n-1];
        while(l<r){
            if(ls>rs){
                rs+=arr[r-1];
                r--;
            }
            if(rs>ls){
                ls+=arr[l+1];
                l++;
            }
            if(ls==rs){
                while(l<r-1){
                    System.out.print(arr[l+1]+" ");
                    dup1[idx++] = arr[l+1];
                    l++;
                }
                if(idx > 0) {
                    break;
                }
                sub(dup1);
                break;
            }
            if(ls!=rs&&l+1==r-1){
                System.out.println("no element invalid");
                break;
            }
        }
    }
}

