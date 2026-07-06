public class Summ {

    public static void main(String[] args) {
        int a=9,b=11,c=9;
        int d=a+b+c;
        System.out.println(Math.max(a,Math.max(b,c))+Math.max(a,Math.min(b,c))-Math.min(a,Math.min(b,c)));
        //or we can use like this
        System.out.println(d-2*Math.min(a,Math.min(b,c)));
    }
}
