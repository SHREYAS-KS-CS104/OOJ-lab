import java.util.Scanner;
class Indices
{

    public static void main(String args[])
    {
        int n,i;
        int odd,even;
        odd=0;
        even=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("\nEnter array elements");
        for(i=0;i<n;i++)
        {
         System.out.println("Enter element"+(i+1)+":\t");
         arr[i]=sc.nextInt();
        }
        System.out.println("\nDisplaying array elements");
        for(i=0;i<n;i++)
        {
         System.out.print(arr[i]+"\t");
        }
        for(i=0;i<n;i=i+2)
        {
         even=even+arr[i];
        }
        for(i=1;i<=n;i=i+2)
        {
         odd=odd+arr[i];
        }

        System.out.println("\nSum of even indices:"+even);
        System.out.println("Sum of odd indices:"+odd);
     }
}
