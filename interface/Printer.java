
//Introduced in java 8
FunctionalInterface= only 1 abstract method+(default & static methods)
@FunctionalInterface
public interface Printer {
	// Only one adstract method is allowed
    void printJob(); //Implicity public abstract
    void scan();
    //Any no. of default and static methods are allowed
    default void scan() {
    	System.out.println("scan....");
    }
     static void threeDprint() {
    	 System.out.println("3D print....")
     }
}
