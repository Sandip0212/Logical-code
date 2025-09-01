public class Number6 {
    public static void main(String[] args) {
        int space=5;
        for(int i=1;i<=5;i++){
            for(int j=space;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            space--;
            System.out.println();
        }
    }
}
