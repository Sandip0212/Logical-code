import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLogic1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //26. Find largest and smallest element in an array
        System.out.println("26. Find largest and smallest element in an array");
        int[] arr={3,8,5,9,2};
        int small=arr[0],big=arr[0];
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
            if(big<arr[i]){
                big=arr[i];
            }
            
        }
        System.out.println("Smallest element is "+small+" Largest element is "+big);

        System.out.println("______________________________________________");

        //27. Reverse an array
        System.out.println("27. Reverse an array");
        int[] arr1={1,2,3,9,8,7};
        int n=0;
        int temp;
        int j=arr1.length-1;
        while(n<=j){
            temp=arr1[n];
            arr1[n]=arr1[j];
            arr1[j]=temp;
            n++;
            j--;
        }
        System.out.println(Arrays.toString(arr1));

         System.out.println("______________________________________________");



        //28. Copy one array to another
        System.out.println("28. Copy one array to another");
        int[] first={1,3,5,7,9,8,6,4,2};
        int[] second=new int[first.length];
        for(int i=0;i<first.length;i++){
            second[i]=first[i];

        }
        System.out.println(Arrays.toString(second));

         System.out.println("______________________________________________");


        //29. Count even and odd numbers in an array 
        System.out.println("29. Count even and odd numbers in an array ");
        int[] nums={12,4,3,6,7,88,55,0};
        int even=0,odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(" Even number is an Array is "+even+" Odd number is an Array is "+odd);

        System.out.println("______________________________________________");

        //30. Find the sum of elements in an array
        System.out.println("30. Find the sum of elements in an array");
        int[] sum={2,5,3,2,7,9};
        for(int i=1;i<sum.length;i++){
            sum[0]+=sum[i];
        }
        System.out.println("Sum of element is "+sum[0]);

        
    }
}
