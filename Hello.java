import java.util.*;
public class Hello {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int c=0,m=0;
        for(int i=0;i<st.length();i++){
            for(int j=0;j<st.length();j++){
                if(st.charAt(i)==st.charAt(j)){
                    c++;
                }
            }
            if(c>m){
                m=c;
            }
            c=0;
        }
        System.out.println(m);
    }
}
