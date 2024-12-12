 
//overloading method     same method and different arguments
class MyCalc{ 
	public static int findMax(int x, int y) {
		return(x>y)? x:y;
	}
	public static double findMax(double x,double y) {
		return(x>y)? x:y;
	}
	public static long findMax(long x,long y) {
		return(x>y)? x:y;
	}
	
	//varArg method or variable length Argument Method
	public static void m1(int...num) {
		int total=0;
		for(int element:num) {
			total+= element;
		}
		System.out.println(total);
	}
}

public class OverloadingDemo {
    public static void main(String[] args) {

		MyCalc.m1();
		MyCalc.m1(10);
		MyCalc.m1(10,20);
		MyCalc.m1(10,20,30);
		MyCalc.m1(10,20,30,40);
		MyCalc.m1(new int[] {111,222,333,444,555});
		
	 int maxInt= MyCalc.findMax(500, 444);	
	 System.out.println(maxInt);

	double maxDouble=MyCalc.findMax(15.5,22.6);
	 System.out.println(maxDouble);
	  
	 long maxLong=MyCalc.findMax(877665434323454L,53246778908878L);
	 System.out.println(maxLong);
	}
}
	 