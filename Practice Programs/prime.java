import java.io.*; 
import java.lang.*; 
import java.util.*; 
public class prime 
{
    public static boolean checkprime(int n) 
    {
    int flag=1;
    for(int i=2;i<=n/2;i++) 
    {
    if(n%i==0) 
    {
    flag=0; break;
    }
    } 
    if(flag==1) 
    {
    return true; 
}
    else 
    {
    return false; 
    }
    }
    public static void main(String[] args) 
    {
    int a,b;
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the first number"); 
    a=sc.nextInt();
    System.out.println("Enter the second number"); 
    b=sc.nextInt();
    System.out.println("Prime numbers are "); 
    for(int i=a;i<=b;i++)
    {
    if(checkprime(i)) {
    System.out.println(i + " " + "is prime"); 
}
    } 
}
    }