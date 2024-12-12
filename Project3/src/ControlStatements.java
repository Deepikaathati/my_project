
public class ControlStatements {
   public static boolean isEven(int num) { 
	   boolean status = false;
	    if(num%2==0) {
	    	status = true;
	    }
	    return status;
   }
    public static void main(String[] args) {
    	System.out.println(isEven(55));
    	System.out.println(isEven(122));
    	System.out.println(isEven(87));
    }
}

