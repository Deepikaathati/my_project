
public class Stringbufferdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StringBuffer sb= new StringBuffer("Java");
    System.out.println(sb);
    sb.append("23");
    System.out.println(sb); 
    sb.reverse();
    System.out.println(sb);
    StringBuffer sb1= new StringBuffer("Java");
    StringBuffer sb2= new StringBuffer("Java");
    System.out.println(sb1.equals(sb2)); // reference comparison
    String s1=new String("Java");
    String s2=new String("Java");
    System.out.println(s1.equals(s2)); // content comparison
	}
	

}
// Stringbuffer is mutable(changeable)
   //.equals() performs reference comparison only