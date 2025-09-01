import java.util.*;
class BasicLevel1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

       //1. Print numbers from 1 to N 
       System.out.println("1. Print numbers from 1 to N ");
       System.out.println("Enter the number you want to print ");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        System.out.println(i);
       }
       System.out.println("_____________________________________________________________");

       //2. Check if a number is even or odd
       System.out.println("2. Check if a number is even or odd");
       System.out.println("Enter any number to check even and odd ");
       int n1=sc.nextInt();
       String res=n1%2==0?"Number is Even ":"Number is Odd";
       System.out.println(res);

       System.out.println("_____________________________________________________________");

       // 3. Find the sum of first N natural numbers 
        System.out.println("3. Find the sum of first N natural numbers ");
        System.out.println("Enter the Number you want to sum upto ");
        int sum=0;
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+num+" number is "+sum);

        System.out.println("_____________________________________________________________");


        //4. Find the factorial of a number
        System.out.println("4. Find the factorial of a number ");
        System.out.println("Enter the number you want to factorial ");
        int fact=1;
        int num1=sc.nextInt();
        for(int i=num1;i>=1;i--){
            fact*=i;
        }
        System.out.println("Factorial of "+num1+" is "+fact);

        System.out.println("_____________________________________________________________");


         //5. Reverse a number 
         System.out.println("5. Reverse a number ");
         System.out.println("Enter the number for reverse");
         int digit;
         int rev=0;
         int num2=sc.nextInt();
         while(num2!=0){
            digit=num2%10;
            num2/=10;
            rev=rev*10+digit;
         }
         System.out.println("Reverse number is"+rev);
         
         System.out.println("_____________________________________________________________");


         //6. Check if a number is a palindrome
         System.out.println("6. Check if a number is a palindrome");
         System.out.println("Enter the any number to check is a palindrome or not ");
         int number=sc.nextInt();
         int original_number=number;
         int digit1,reverse=0;
         while (number!=0) {
            digit1=number%10;
            number/=10;
            reverse=reverse*10+digit1;   
         }
         if (original_number==reverse){
            System.out.println("Number is Palindrome ");
         }
         else{
            System.out.println("Number is not a Palindrome ");   
         }

        System.out.println("_____________________________________________________________");


        //7. Check if a number is prime
        System.out.println("7. Check if a number is prime");
        System.out.println("Enter the number to check it is prime number or not");
        int num_1=sc.nextInt();
        boolean flag=false;
        if(num_1==2)
             System.out.println(+num_1+" is a Prime Number");
        else{
             for(int i=2;i<num_1;i++){
                 flag=false;
                    if(num_1%i==0){
                        System.out.println(+num_1+" is not a Prime Number ");
                        break;
                    }
                    else
                        flag=true;
        }
        }
        if(flag){
            System.out.println(+num_1+" is a Prime Number");
        }

        System.out.println("_____________________________________________________________");

        //8. Print all prime numbers up to N
        System.out.println("8. Print all prime numbers up to N");
        System.out.println("Enter the number you want to print Prime number upto ");
        int num_2=sc.nextInt();
        int count=0;
        boolean flag1=true;
        for(int i=2;i<num_2;i++){
            flag1=true;
            for(int j=2;j<i;j++){
                if (i%j==0) {
                    flag1=false;
                    break;  
                }
            }
            if(flag1){
                System.out.println(+i+" ");
                count++;
            }
        }
        System.out.println("Total Prime number upto "+num_2+" is "+count);

        System.out.println("_____________________________________________________________");
    }
}