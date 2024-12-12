package exception;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		System.out.println(10/5);
        try {
        	System.out.println(10/0);
        }catch(ArithmeticException e) {
        	System.out.println("can't divide by 0");
        }
        System.out.println(10/2);
       
	}

}
 // try control space enter  first option ----shortcut
//throwable acts as parent class
//exception child class