package com.accessmodifiers;

import com.accessmodifier.model.Student;

public class Sample {

	public static void main(String[] args) {
		  Student s = new Student();
   	   System.out.println(s.rollNo);          //method
   	   s.printRollNumber();              
      }

	}                      //Different package,class can done by public
