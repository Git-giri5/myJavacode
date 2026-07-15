public class SecondLar {
    public static void main(String[] args) {
        int[] arr={10,5,20,8,15};
        int lar=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    lar=Math.max(lar,arr[i]);
                }
            } 
        }
        int sl=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]!=lar&&arr[i]>arr[j]){
                    sl=Math.max(sl,arr[i]);
                }
            }
        }
        System.out.println(sl);
    }
}

