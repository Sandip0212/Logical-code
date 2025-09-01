import java.util.Arrays;
import java.util.HashSet;

public class ArrayLogic2 {
    public static void main(String[] args) {
        //31. Remove duplicates from an array
        // System.out.println("31. Remove duplicates from an array");
        // int[] arr={3,4,5,3,2,6,4,1};
        // HashSet<Integer> set=new HashSet<>();
        // int j=0;

        // for(int i=0;i<arr.length;i++){
        //     if(!set.contains(arr[i])){
        //         arr[j++]=arr[i];
        //         set.add(arr[i]);
        //     }    

        // }
        // int[] arrnew=Arrays.copyOf(arr, j);
        // System.out.println(Arrays.toString(arrnew));

        // Sort an array in ascending order
        System.out.println(" Sort an array in ascending order");
        int[] arr1={5,9,6,8,2,7};
        int temp;
        for(int i=0;i<arr1.length-1;i++){
            int small=i;
            for(int j1=i+1;j1<arr1.length;j1++){
                if(arr1[small]>arr1[j1]){
                small=j1;
                
                }
            }
            temp=arr1[i];
            arr1[i]=arr1[small];
            arr1[small]=temp;

        }
        System.out.println(Arrays.toString(arr1));


    }
    
}
