import java.util.*;
public class Hashh2 {
    public static void main(String args[]){
        HashMap<String,Integer> m = new HashMap<>();
        String s="hi this is a hi this";
        String w[]=s.split(" ");
        for(String ww:w){
            m.put(ww,m.getOrDefault(ww,0)+1);
        }
        for(String key:m.keySet()){
            if(m.get(key)>1){
                String k=key;
                for(int i=k.length()-1;i>=0;i--){
                    System.out.print(k.charAt(i));
                }
                System.out.println();
            }
        }
    }
}
