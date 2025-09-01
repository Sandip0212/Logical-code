import java.util.HashMap;
import java.util.Scanner;

public class StringLogic {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //16. Check if a string is a palindrome
        System.out.println("16. Check if a string is a palindrome");
        System.out.println("Enter any String");
        String s=sc.nextLine();
         String s1="";
         for (int i = s.length() - 1; i >= 0; i--) {
            s1 = s1 + s.charAt(i); 
        }
        System.out.println(s1);
        if(s.equals(s1)){
            System.out.println("Palindrome");
        
        }else
        System.out.println("Not a palindrome");

        System.out.println("______________________________________________");

        //17. Count vowels and consonants in a string 
        System.out.println("17. Count vowels and consonants in a string ");
        System.out.println("Enter any String");
        String str=sc.nextLine();
        int vowel=0, consonants=0;
         char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                     vowel++;
            }
              else
                consonants++;
        }
            
        }
        System.out.println("Number of Vowel is "+vowel+" Consonant is "+consonants);

        System.out.println("______________________________________________");


        //18. Reverse a string without using library functions
        System.out.println("18. Reverse a string without using library functions");
        System.out.println("Enter a String");
        String str1=sc.nextLine();
        String s2="";
        for(int i=str1.length()-1;i>=0;i--){
             s2+=str1.charAt(i);
        }
       
        System.out.println(s2);

        System.out.println("______________________________________________");


        //19. Remove spaces from a string 
        System.out.println("19. Remove spaces from a string ");
        System.out.println("Enter any string");
        String str2=sc.nextLine();
        String result="";
        for(int i=0;i<str2.length();i++){
            char ch1=str2.charAt(i);
            if(ch1!=' '){
                result+=ch1;
            }
        }
        
            System.out.println(result);
         System.out.println("______________________________________________");


        //20. Count words in a string
        System.out.println("20. Count words in a string");
        System.out.println("Enter the String ");
        String string=sc.nextLine();
        int count1=0;
        char ch2;
        boolean flag=false;
        for(int i=0;i<string.length();i++){
            ch2=string.charAt(i);
            if(ch2!=' '&& !flag){
                count1++;
                flag=true;
            }
            else if(ch2==' ')
                flag=false;
        }
        System.out.println("Number of word in String "+count1);

         System.out.println("______________________________________________");

        //21. Find the frequency of each character in a string 

         System.out.println("21. Find the frequency of each character in a string ");
        System.out.println("Enter any String to check frequency ");
         String string3=sc.nextLine();
         string3=string3.toLowerCase();
         HashMap<Character,Integer> map=new HashMap<>();
         for(int i=0;i<string3.length();i++){
            char c=string3.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1 );
            }
         }
         System.out.println(map);

         System.out.println("______________________________________________");

         //22. Replace all spaces in a string with ‘-’
         System.out.println("22. Replace all spaces in a string with ‘-’ ");
         System.out.println("Enter any string");
         String newString1=sc.nextLine();
        StringBuilder newString=new StringBuilder();
         for(int i=0;i<newString1.length();i++){
            char c1=newString1.charAt(i);
            if(c1==' '){
                newString.append("_");
            }
            else{
                newString.append(c1);
            }
         }
         System.out.println(newString.toString());

         System.out.println("______________________________________________");

         //23. Check if two strings are anagrams
         System.out.println("23. Check if two strings are anagrams");
         System.out.println("Enter any two string");
         String s3=sc.nextLine();
         String s4=sc.nextLine();
         HashMap<Character,Integer> m1=new HashMap<>();
         HashMap<Character,Integer> m2=new HashMap<>();
         if(s3.length()!=s4.length())
            System.out.println("Not Anagrams");
         else{
            for(int i=0;i<s3.length();i++){
                if(m1.containsKey(s3.charAt(i))){
                    m1.put(s3.charAt(i), m1.get(s3.charAt(i))+1);
                }
                else{
                    m1.put(s3.charAt(i), 1);
                }

                 if(m2.containsKey(s4.charAt(i))){
                    m2.put(s4.charAt(i), m2.get(s4.charAt(i))+1);
                }
                else{
                    m2.put(s4.charAt(i), 1);
                }

            }
            if(m1.equals(m2))
             System.out.println("Anagram");
            else 
                    System.out.println("Not Anagrams");
         } 

         System.out.println("______________________________________________");
         
         
         //24. Convert lowercase to uppercase (without using built-in) 
         System.out.println("24. Convert lowercase to uppercase (without using built-in) ");
         System.out.println("Enter any String");
         String uppercase=sc.nextLine();
         StringBuilder lowercase=new StringBuilder();
         for(int i=0;i<uppercase.length();i++){
            int char1=uppercase.charAt(i)+32;
            lowercase.append( (char) char1);
            
         }
         System.out.println(lowercase.toString());


         System.out.println("______________________________________________");
           //25. Find the longest word in a sentence 
            System.out.println(" 24.Find the longest word in a sentence \r\n" );
            System.out.println("Enter any String");
            String stringnew=sc.nextLine();
            int num=0;
            int maxNum=0;
            int n=0;
            int stringlength=stringnew.length();
            StringBuilder longword=new StringBuilder();
            for(int i=0;i<stringlength;i++){
                if(stringnew.charAt(i)==' '){
                    num=0;
                }
                else{
                    num++;
                }
                if(num>maxNum){
                    maxNum=num;
                    n=i-maxNum;
                }
            }
            for(int i=n+1;i<stringlength;i++){
                if (stringnew.charAt(i)==' ') {
                    break;  
                }
                longword.append(stringnew.charAt(i));
            }
            System.out.println("Long word is "+longword);
            System.out.println("Length is "+maxNum);

    }
}
