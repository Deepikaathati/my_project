package com.edubridge.maven_project1;

public class CountDigits {
    public int findCountDigit(int n) {
       while(n > 0){
    	   int Count = 0;
		   Count++;
    	   n=n/10;
       }
       return n;
}
}
