import java.util.*;
class BOOK
{
 public static void main(String args[])
 {
  int n,i,ctr,max_price,least_page;
  ctr=0;
  String max_name;
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER LIMIT OF BOOKS:");
  n=sc.nextInt();
  int id[]=new int[n];
  String title[]=new String[n];
  int page[]=new int[n];
  int year[]=new int[n];
  String author[]=new String[n];
  String publ[]=new String[n];
  int price[]=new int[n];
  System.out.println("ACCEPTING BOOK DETAILS");
  for(i=0;i<n;i++)
  {
   System.out.println("BOOK "+(i+1));
   System.out.print("ENTER BOOK TITLE:");
   title[i]=sc.next();
   System.out.print("\nENTER BOOK AUTHOR:");
   author[i]=sc.next();
   System.out.print("\nENTER BOOK PUBLISHER:");
   publ[i]=sc.next();
   System.out.print("\nENTER BOOK ID:");
   id[i]=sc.nextInt();
   System.out.print("\nENTER PUBLISHING YEAR:");
   year[i]=sc.nextInt();
   System.out.print("\nENTER TOTAL NO. OF PAGES:");
   page[i]=sc.nextInt();
   System.out.print("\nENTER BOOK PRICE:");
   price[i]=sc.nextInt();
   }
  System.out.println("DISPLAYING BOOK DETAILS");
  for(i=0;i<n;i++)
  {
   System.out.println("BOOK "+(i+1));
   System.out.print("BOOK TITLE:"+title[i]);
   System.out.print("\nBOOK AUTHOR:"+author[i]);
   System.out.print("\nBOOK PUBLISHER:"+publ[i]);
   System.out.print("\nBOOK ID:"+id[i]);
   System.out.print("\nPUBLISHING YEAR:"+year[i]);
   System.out.print("\nTOTAL NO. OF PAGES:"+page[i]);
   System.out.print("\nBOOK PRICE:"+price[i]);
  }
  max_price=price[0];
  max_name=title[0];
  least_page=page[0];
  for(i=0;i<n;i++)
  {
   if(year[i]==2020)
     ctr++;
   if(price[i]>=max_price)
   {
     max_price=price[i];
     max_name=title[i];
   }
   if(page[i]<=least_page)
   {
    least_page=page[i];
    max_name=title[i];
   }
  }
  System.out.print("\nCOUNT OF BOOKS PUBLISHED IN 2020:"+ctr);
  System.out.print("\nMAXIMUM BOOK PRICE & CORRESPONDING BOOK TITLE:"+max_price+" "+max_name);
  System.out.print("\nBOOK WITH LEAST NO. OF PAGES & CORRESPONDING BOOK TITLE:"+least_page+" "+max_name);
 }
}

