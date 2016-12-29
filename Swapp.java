package assignment.acadgild;

public class Swapp {

	public static void main(String[] args) {
		int num1 = 40;
		int num2 = 25;
		
		swap(num1, num2);
	}

	private static void swap(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("Initially, Value in num1:   "+num1);
		System.out.println("Initially, Value in num2:   "+num2);
		num1 = num1+num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping, Value in num1:   "+num1);
		System.out.println("After swapping, Value in num2:   "+num2);

	}
}
