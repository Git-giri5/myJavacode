import java.util.*;
public class Sett {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> set=new HashSet<>();
        System.out.println("Enter the "+n+"elements:");
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        System.out.println(set);
        
    }

}
