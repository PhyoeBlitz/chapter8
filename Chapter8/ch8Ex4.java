public class ch8Ex4{
   public static int indexOfMax(int [] a){
        int i =0;
        int index =0;
        for(int x :a){
            if(a[i] > a[index]){
                index = i;
            }
            i++;
        }
        return index;
    }
   public static void main (String []args){
        int [] b ={1,2,3,4,5,6};
        System.out.println(indexOfMax(b));
    }
}