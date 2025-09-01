public class Number9 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=5;i++){
           if(i%2==1){
                for(int j=1;j<=3;j++){
                    count++;
                    System.out.print(count+" ");
                }    
           } 
           else{
                int temp=count;
                for(int j=count=count+3;j>temp;j--){
                    System.out.print(j+" ");
                }

           }
           
           System.out.println();
        }
    }
}
