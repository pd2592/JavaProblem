package assignment.acadgild;

import java.util.Scanner;

public class SumWithoutPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = add(a,b);
		System.out.println(sum); 
	}
	static int add(int a,int b)
	{
		int carry;
        while(b!=0)
        {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
	}
	
}
