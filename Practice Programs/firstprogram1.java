import java.io.*;import java.util.*;
  import java.lang.*;
public class firstprogram1 
{
public static void pattern(int n) 
{
int k=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(k + " ");
k++; }
System.out.println(); 
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter the number of rows");
num=sc.nextInt(); pattern(num);
}
}