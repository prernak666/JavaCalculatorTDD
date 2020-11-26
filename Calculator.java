package javaCalculator;

public class Calculator {
  public static int add(String numbers) {
	int returnValue=0;
	String[] arr=numbers.split(",");
	//if(arr.length>2)
		//throw new RuntimeException("More than two numbers not allowed");
	
	for(String arr1:arr)
		if(!arr1.isEmpty()) {
		returnValue+=Integer.parseInt(arr1);
		}
	return returnValue;
}
}