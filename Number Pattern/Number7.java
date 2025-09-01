import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        for(int i=1;i<=n;i++){
            for(int j=n1;j>=1;j--){
                System.out.print(j+" ");
            }
            n1--;
            System.out.println();

        }
    }
}
