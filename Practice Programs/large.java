import java.io.*;
 import java.util.*;
  public class large 
  {
    public static void main(String[] args) 
    {
      Readable in;
      Scanner sc = new Scanner(in);
    int a,b,c;
    System.out.println("Enter the first number"); a=sc.nextInt();
    System.out.println("Enter the second number"); b=sc.nextInt();
    System.out.println("Enter the third number"); c=sc.nextInt();
    if(a>b&&a>c)
    System.out.println(a + " " + "Is largest"); else if(b>a&&b>c)
    System.out.println(b + " " + "Is largest"); else
    System.out.println(c + " " + "Is Largest");
    } 
}