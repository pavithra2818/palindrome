package palindrome;
import java.util.Scanner;
import java.io.*;
public class Palindrome {
    public static void main(String[] args) {
        int n;
        int rev=0,rem,temp;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n:");
        n=in.nextInt();
        temp=n;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
            
        }
        if(n==rev)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
            
    }
    
}
