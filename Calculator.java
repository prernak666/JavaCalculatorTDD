package javaCalculator;

public class Calculator {
  public static int add(String numbers) {
	 if(numbers=="")
		 return 0;
	 else if (numbers.contains(",")) {
		 String[] arr=numbers.split(",");
		 int sum=0;
		 for(int i=0;i<arr.length;i++) 
		 sum+=Integer.parseInt(arr[i]); 
		 return sum;
	 }
	 else
		 return Integer.parseInt(numbers);
  }
}
