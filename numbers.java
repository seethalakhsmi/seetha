import java.io.*;
import java.util.*;
public class numbers
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int a=Integer.parseInt(s);
int[]b=a.split(",");
for(int i=0;i<s.length();i++)
{
if((a[0]>a[1])&&(a[0]>a[2]))
{
System.out.print("the largest number is a[0]");
}
else if(a[1]>a[2])
{
System.out.print("the largest number is a[1]");
}
else
{
System.out.print("the largest number is a[2]);
}
}
}
