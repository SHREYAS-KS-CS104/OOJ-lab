import java.io.*;
import java.lang.*; 
import java.util.*; 
public class cie_and_see 
{
private static double cie; 
private static double see; 
public static void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the CIE marks out of 50"); 
cie=sc.nextFloat();
System.out.println("Enter the SEE marks out of 100"); 
see=sc.nextFloat();
}
public static void calc() {
read();
double total=Math.round(cie+((see)/2));
System.out.println("Total marks obtained is " + total); 
if(total>=90&&total<=100)
{
System.out.println("Grade obtained is " + "S"); }
else if(total>=80&&total<90) {
System.out.println("Grade obtained is " + "A"); }
else if(total>=70&&total<80) {
System.out.println("Grade obtained is " + "B"); }
else if(total>=60&&total<70) {
System.out.println("Grade obtained is " + "C"); }
else if(total>=50&&total<60) {
System.out.println("Grade obtained is " + "D");
}
else if(total>=40&&total<50)

{
System.out.println("Grade obtained is " + "E");
} 
else 
{
System.out.println("Grade obtained is " + "F"); }
}
public static void main(String[] args) 
{
calc(); 
}
}
