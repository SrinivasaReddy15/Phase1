package methodoverloading;

public class Functionoverloading {
	int addtwonumbers(int a,int b)
	{
		return a+b;
	}
    int area(float p)
    {
    	double area=3.14*p*p;
    	int carea=(int)area;
    	return carea;
    }
    int area(int l,int b)
    {
    	int recarea=l*b;
    	return recarea;
    }
    int area(int s)
    {
    	int sqarea=s*s;
    	return sqarea;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionoverloading fo=new Functionoverloading();
		System.out.println("addition of two numbers :"+fo.addtwonumbers(3,4));
		System.out.println("area of circle :"+fo.area(4.76F));
		System.out.println("area of rectangle :"+fo.area(6,7));
		System.out.println("area of square :"+fo.area(45));
		

	}

}
