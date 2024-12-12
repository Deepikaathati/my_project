
public class ControlStatementso {
   public static boolean isOdd(int num) {
	   boolean status = false;
	    if(num%2==1) {
	    	status = true;
	    }
	    return status;
  }
   public static void main(String[] args) {
   	System.out.println(isOdd(55));
   	System.out.println(isOdd(122));
   	System.out.println(isOdd(87));
   }
}
