# Reverse
import java.io.*;
import java.util.*;
public class Reverse
{
public static void main(String args[])
{
int n=0;
int revn=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a digit");
n=sc.nextInt();
while(n!=0)
{
revn=revn*10;
revn=revn+n%10;
n=n/10;
}
System.out.println("reverse of n is:"+revn);
}
}

