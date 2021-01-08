
import java.util.Scanner;
public class Quadratic
{
 public static void main(String args[])
 {
   double a,b,c;
   double root1,root2;
   Scanner in=new Scanner(System.in);
   System.out.println("Enter value of a : ");
   a=in.nextDouble();
   System.out.println("Enter value of b : ");
   b=in.nextDouble();
   System.out.println("Enter value of c : ");
   c=in.nextDouble();
   double determinant=(b*b)-(4*a*c);
   double sq=Math.sqrt(determinant);
   // condition for real and different roots
   if(determinant>0)
   {
    root1=((-b+sq)/(2*a));
    root2=(-b-sq)/(2*a);
    System.out.println("Root 1= "+root1+"\t"+"Root2= "+root2);
   }
   // condition for real and equal roots
   else if(determinant==0)
   {
    root1=root2=(-b+sq)/(2*a);
    System.out.println("Root 1=Root 2=  "+root1);
   }
   // condition for roots that are not real
   else
   {
    double  real=-b/(2*a);
    double  img=Math.sqrt(-determinant)/(2*a);
    System.out.println("Root 1= "+real+"+"+img+"i"+"\t"+"Root2= "+real+"-"+img+"i");
   }
  }
}

