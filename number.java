import java.io.*;
import java.util.*;
public class number
{
public static void main(String args[])
{
int n;
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
if(n==0)
System.out.println(n+"is zero");
else
if(n%2==0)
System.out.println(n+"is even");
else
System.out.println(n+"is odd");
}
}
