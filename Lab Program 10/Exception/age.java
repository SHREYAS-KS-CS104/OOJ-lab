import java.util.*;
class WrongAge extends Exception{
  private String detail;
  WrongAge(String s){
       detail=s;
  }
  public String toString(){
       return ("Invalid Age exception : "+detail);
  }
}
class Father{
   int age;
   Father(int a){
      age=a;
  }
}
class Son extends Father{
    int age1;
    Son(int a,int b){
    super(a);
    age1 = b;
 }
}
public class age {
   public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Father's and Son's age");
       int m=in.nextInt();
       int n=in.nextInt();
       try{
       if(m<0)
       throw new WrongAge("Negative");
       else if(n>=m)
       throw new WrongAge("Illogical");
       else{
       Son ob=new Son(m,n);
       System.out.println("Father's Age: "+ob.age+"\nSon's Age: "+ ob.age1);
       }
       }
       catch (WrongAge e){
       System.out.println(e);
     }
}
}