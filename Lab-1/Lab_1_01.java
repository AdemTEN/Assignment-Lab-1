package day14_Methods_Part2;

public class Lab_1_01 {

	public static void main(String[] args) {

	stringTimes("Hi", 3);	
	stringTimes("Hi" ,2);
	stringTimes("Hi", 1);
	}

	
	public static void stringTimes(String hello, int number) {
		
		for(int i = 1; i<=number;i++) {
			System.out.print(hello);
		}
		System.out.println();
	}
}
