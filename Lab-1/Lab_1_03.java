package day14_Methods_Part2;

public class Lab_1_03 {

	public static void main(String[] args) {

		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
	}

	public static void specialEleven(int number) {
		boolean kontrol = true;
		if (number%11 == 0 || (number)%11 == 1) {
			System.out.println(kontrol);
		}else {
			System.out.println(!kontrol);
		}
	}
	
}
