public class Number8 {
    public static void main(String[] args) {
        //int n=0;
        for(int i=1;i<=5;i++){
            int n=i;
            int sub=1;
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n=n+5-sub++;
            }
            System.out.println();
            
        }
    }
}
