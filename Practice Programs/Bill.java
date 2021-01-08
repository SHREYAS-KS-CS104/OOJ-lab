import java.util.Scanner;
class Bill
{
  public static void main(String args[])
 {
  int x,i;
  double tot,d;
  tot=0.0;
  d=0.0;
  Scanner obj=new Scanner(System.in);
  System.out.print("ENTER NO. OF ITEMS:");
  x=obj.nextInt();
  double rate[]=new double[x];
  int quantity[]=new int[x];
  for(i=0;i<x;i++)
  {
   System.out.println("ITEM"+(i+1));
   System.out.print("ENTER RATE:");
   rate[i]=obj.nextDouble();
   System.out.print("\nENTER QUANTITY:");
   quantity[i]=obj.nextInt();
  }

  System.out.println("\n*** BILL DETAILS OF CUSTOMER ***");
  for(i=0;i<x;i++)
  {
   System.out.println("ITEM"+(i+1));
   System.out.print("RATE:"+rate[i]);
   System.out.print("\nQUANTITY:"+quantity[i]);
   tot=tot+rate[i]*quantity[i];
  }
  if(tot>=10000)
  d=tot-(tot*0.05);
  else if(tot>=7500 && tot<10000)
  d=tot-(tot*0.03);
  else if(tot>=5000)
  d=tot-(tot*0.02);
  System.out.println("\n*** BILL AMOUNT OF CUSTOMER ***");
  System.out.print("\nTOTAL BILL AMOUNT:"+tot+"\n");
  System.out.print("\nDISCOUNTED BILL AMOUNT:"+d+"\n");
  }
}

