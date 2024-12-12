package project2;

public class MethodsDemo {
    public static int findsum(int x, int y) {
    	return x+y;
    }
    public static void greet() {
    	System.out.println("Hello everybody!");
    }
    public static double findmax(double x, double y) {
    	return (x>y)? x:y;
    }
    public static void main(String[] args) {
    	int total = findsum(10,20);
    	System.out.println(total);
    
        System.out.println(findsum(366, 663));
        System.out.println(findsum(3000,6000));
     greet();
     
    double max=findmax(133.5,120.7);
    System.out.println(max);
  }
}
