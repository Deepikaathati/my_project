//Inheritance:
// To extends one class from another class
//In order to reuse the functionality
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Phone p = new Phone();
    p.call();
    p.msg();
    System.out.println("-----------");
      
    Smartphone sp = new Smartphone();
    		sp.call();
            sp.msg();
            sp.browsing();
  
	}

}
