import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Number Pattern 2");
        //int n=sc.nextInt();
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //Dyanamic code
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
    }
}
