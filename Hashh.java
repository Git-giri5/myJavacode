import java.util.HashMap;

public class Hashh{
    public static void main(String args[]){
        HashMap<Character,Integer>m=new HashMap<>();
        String s="pplea";
        String t="apple";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);


        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            m.put(c,m.getOrDefault(c,0)-1);
        }
        for(int i:m.values()){
            if(i!=0){
                System.out.println("not a anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
}