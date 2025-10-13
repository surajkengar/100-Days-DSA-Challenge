// problem 1
// You are given a string s, and your task is to reverse the string.

// Examples:

// Input: s = "Geeks"
// Output: "skeeG"
// Input: s = "for"
// Output: "rof"
// Input: s = "a"
// Output: "a"



import java.util.*;
public class reverse_string{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the string  : ");
        String name =sc.nextLine();

        String str1 =reverse_string(name);
        System.out.print(str1);




    }
     static String reverse_string(String str){
            char ch[]=str.toCharArray();

            int i=0;
            int j=ch.length-1;

            while(i < j){
            char temp = ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }

            return new String(ch);
    }
}