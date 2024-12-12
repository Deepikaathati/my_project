package java.accessmodifier.service;

import com.accessmodifier.model.Student;

public class SubClass extends Student{
           public static void main(String[] args) {
        	   new SubClass().test();
           }
        	   public void test() {
        		   System.out.println(rollNo);         //method
        		   printRollNumber();
        	   }
  }

