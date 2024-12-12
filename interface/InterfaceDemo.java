
public class InterfaceDemo {

	public static void main(String[] args) {
			// Instantiation is not possible for interface
			// calc c= new Calc();

			MyCalc myCalc = new MyCalc();
			System.out.println(myCalc.sum(10, 5));
			System.out.println(myCalc.sub(10, 5));
			System.out.println(myCalc.mul(10, 5));
			System.out.println(myCalc.div(10, 5));
			
			//Accessing default methods using Implementation class
			System.out.println(myCalc.findSquare(10));
			System.out.println(myCalc.findCube));
			
            // interface static methods can't accessed using implementation class
			//System.out.println(myCalc.doubleIt(10));
			
			//Accessing inteface static methods using interface name
			System.out.println(Calc.doubleIt(10));
			
			//Accessing interface variable 
			System.out.println(myCalc.PI_VALUE);
			System.out.println(Calc.PI_VALUE);
			
			System.out.println("-------------------");

			// Interface can be used as reference type
			Calc c = new MyCalc();
			System.out.println(c.sum(10, 5));
			System.out.println(c.sub(10, 5));
			System.out.println(c.mul(10, 5));
			System.out.println(c.div(10, 5));
		}

}
