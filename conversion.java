package day1;

import java.util.Scanner;


public class conversion {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter number : " );
		int num = sc.nextInt();
		
		System.out.print("given number:" + num);
		
		System.out.println("\nBinary equivalent :" +Integer.toBinaryString(num));
		System.out.println("Hexadecimal equivalent :" +Integer.toHexString(num));
		System.out.println("Octal equivalent :" +Integer.toOctalString(num));
		
	}

}
