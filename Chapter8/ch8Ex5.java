public class ch8Ex5{
    public static int sieve(int[]n){
        int x ;
        for(int i =0;i<Math.sqrt(x);i++){
            if(n[i]==true){
                for(int j=Math.pow(i,2);j<n;j=Math.pow(i,2)+1){
                    if(n[j]==false){
                        System.out.print("P");
                    }
                }
            }
        }
        return -1;
    }
    public static void main (String []args){
        int[]a ={1,2,3,4,5,6,7,8,9,10};
        sieve(a);
    }
}