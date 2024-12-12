
public interface Calc {
	public static final double PI_VALUE = 3.14;

	public abstract int sum(int x, int y);

	public abstract int sub(int x, int y);

	public abstract int mul(int x, int y);

	public abstract int div(int x, int y);

	//From Java 8
	//Default keyword is mandatory
	public default int findSquare(int x) {
		return x*x;
	}
	public default int findCube(int x) {
		return x*x*x; 
	}	
		 //Static methods
		public static int doubleIt(int x,) {
			return x+x;  
		}
}
