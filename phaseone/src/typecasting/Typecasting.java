package typecasting;
import java.util.*;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter float number");
  float a=sc.nextFloat();
  long b=(long)a;
  System.out.println("Float to long :"+b);
  
  System.out.println("Enter Doube number");
  double c=sc.nextDouble();
  long d=(long)c;
  int e=(int)d;
  char f=(char)e;
  System.out.println("Double to long "+d+"long to integer "+e+"integer to char"+f);
  
  
  System.out.println("enter long number");
  long g=sc.nextLong();
  byte h=(byte)g;
  System.out.println("long to byte"+h);
  
  System.out.println("Enter integer");
  int i=sc.nextInt();
  double j=i;
  long k=(long)j;
  System.out.println("Integer to double"+j+"double to long"+k);
  
  
  
  
  
	}

}
