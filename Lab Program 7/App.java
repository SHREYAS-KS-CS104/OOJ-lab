import java.util.*;

class Genrics<T>{
  T var1;

void Genirics(T gvar){
  var1=gvar;
 }

T Gdisplay(){
 return var1;
 }
}

public class App{
        public static void main(String[]args)throws Exception{
System.out.println("--PLEASE ENTER STUDENT DETAILS--");

Scanner Minp=new Scanner(System.in);

Genrics<Integer> Rollno= new Genrics<Integer>();
Genrics<String> Name= new Genrics<String>();

System.out.println("NAME: ");
String Sname=Minp.nextLine();
Name.Genirics(Sname);

System.out.println("USN: ");
int Sroll=Minp.nextInt();
Rollno.Genirics(Sroll);
System.out.println("-------DISPLAY-------");
System.out.println("--STUDENT DETAILS--");
System.out.println("NAME: "+Name.Gdisplay());
System.out.println("USN: "+Rollno.Gdisplay());

Minp.close();
}
}

