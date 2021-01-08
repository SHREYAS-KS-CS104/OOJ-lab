import java.util.Scanner;
class Num
{
 public static void main(String args[])
 {
  int n,i,ctr1,ctr2,ctr3;
  ctr1=ctr2=ctr3=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter array size:");
  n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter array elements");
  for(i=0;i<n;i++)
  {
   System.out.print("Enter element"+(i+1)+":");
   arr[i]=sc.nextInt();
  }
  System.out.println("\nDisplaying array elements");
  for(i=0;i<n;i++)
  {
   System.out.print(arr[i]+"\t");
  }
  for(i=0;i<n;i++)
  {
   if(arr[i]>=1)
   ctr1++;
   else if(arr[i]<0)
   ctr2++;
   else
   ctr3++;
  }
   System.out.println("\nCount of positive numbers:"+ctr1);
   System.out.println("Count of negative numbers:"+ctr2);
   System.out.println("Count of zero numbers:"+ctr3);
 }
}


