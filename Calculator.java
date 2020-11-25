package javaCalculator;

public class Calculator {
  public static int add(String numbers) {
	 if(numbers=="")
		 return 0;
	 else if (numbers.contains(",")) {
		 String[] arr=numbers.split(",");
		 int sum=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]); 
		 return sum;
	 }
	 else
		 return Integer.parseInt(numbers);
  }
}
