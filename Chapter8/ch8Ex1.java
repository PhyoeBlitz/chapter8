import java.util.Arrays;
public class ch8Ex1{
    public static void main(String[]args){
        double[]a = {1,2,3};
        powArray(a,2);
        
        //Setion 2
        int[]b = {1,1,2,4,5,5,6,6,6,99};
        System.out.print(Arrays.toString(histogram(b,3)));
    }
    public static double [] powArray(double[]a,double value){
         double[]aSquared = new double[a.length];
      
          for (int i = 0; i < a.length; i++) {
               aSquared[i] = Math.pow(a[i], value);
               System.out.println(aSquared[i] + " ");
          }
          return aSquared;
    }
    public static int []histogram(int[] scores,int counter){
        int[] counts = new int[counter];
        for (int i = 0;i<counts.length;i++) {
              int index = scores[i];
              
              counts[index]++;
              //if(
        }
           
        return counts;
    }
    
}