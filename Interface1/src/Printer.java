

	//Introduced in java 8
	//FunctionalInterface= only 1 abstract method+(default & static methods)
	@FunctionalInterface
	public interface Printer {
		// Only one abstract method is allowed
	    void printJob();    //Implicitly public abstract
	    
	    //Any no. of default and static methods are allowed
	    default void scan()  {
	    	System.out.println("scan....");
	    }
	     static void threeDprint() {
	    	 System.out.println("3D print....");
	     }
	}


