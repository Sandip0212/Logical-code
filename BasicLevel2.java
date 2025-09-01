import java.util.Scanner;

public class BasicLevel2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //9. Find the greatest of three numbers
        System.out.println("9. Find the greatest of three numbers");
        System.out.println("Enter the 3 number  ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(+a+" is Greater Number");
        }else if (b>c) {
            System.out.println(+b+ " is Greater number");
            
        }else{
            System.out.println(+c+" is Greater Number");
        }

         System.out.println("_____________________________________________________________");
         
        //10. Swap two numbers without using a third variable
        System.out.println("10. Swap two numbers without using a third variable");
        System.out.println("Enter any two number ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Before swaping \n num1="+num1+"\n num2="+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swaping \n num1="+num1+"\n num2="+num2);

        System.out.println("_____________________________________________________________");
         

        //11. Find the sum of digits of a number
        System.out.println("11. Find the sum of digits of a number");
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;

        }
        System.out.println("Sum of digits is "+sum);

        System.out.println("_____________________________________________________________");

         //12. Count the number of digits in a number
         System.out.println("12. Count the number of digits in a number");
         System.out.println("Enter the number ");
         int num=sc.nextInt();
         int count=0;
         while (num!=0) {
    
            num/=10;
            count++;
         }
         System.out.println("Number of digit is "+count);

        System.out.println("_____________________________________________________________");

         
         //13. Print multiplication table of a number 
         System.out.println("13. Print multiplication table of a number ");
         System.out.println("Enter any number you want to table ");
         int n1=sc.nextInt();
         for(int i=1;i<=10;i++){
            System.out.println(+n1+"X"+i+"="+n1*i);
         }

        System.out.println("_____________________________________________________________");

         
         //14. Print Fibonacci series up to N terms
         System.out.println("14. Print Fibonacci series up to N terms");
         System.out.println("Enter the number you want a fibonacci series");
         int num3=sc.nextInt();
         int number1=0;
         int number2=1;
         System.out.print(number1+" "+number2);
         for(int i=3;i<=num3;i++){
            int nextNumber=number1+number2;
            System.out.print(nextNumber+" ");
            number1=number2;
            number2=nextNumber;
         }

          System.out.println("_____________________________________________________________");
  

         //15. Check if a number is an Armstrong number
         System.out.println("15. Check if a number is an Armstrong number");
         System.out.println("Enter the number ");
         int num_1=sc.nextInt();
         int original_number=num_1;
         int sum1=0,arm=0;
         while (num_1!=0) {
            sum1=num_1%10;
            num_1/=10;
            arm=arm+sum1*sum1*sum1;
         }
         if(original_number==arm){
            System.out.println("Number is Armstrong number");
         }
         else{
            System.out.println("Number is not a Armstrong number ");
         }

         System.out.println("_____________________________________________________________");



        //16. Check if a number is Perfect square root number 
        System.out.println("16. Check if a number is Perfect square root number ");
        System.out.println("Enter the number ");
        int num_2=sc.nextInt();
        for(int i=1;i<=num_2;i++){
            if(i*i==num_2){
                System.out.println(num_2+" is perfect square root number ");
                break;
            }
            else if(i*i>num_2){
                System.out.println(num_2+" is not a perfect square root number");
                break;
            }
        }

    }
}