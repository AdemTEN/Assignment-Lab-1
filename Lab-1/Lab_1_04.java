package day14_Methods_Part2;

public class Lab_1_04 {

	public static void main(String[] args) {

		deerPlay(70, false);
		deerPlay(95, false);
		deerPlay(95, true);
		deerPlay(45, true);
	}

	public static void deerPlay(double temperature, boolean summer) {
		
		if ((60<= temperature && temperature<=90) || (summer == true && (60<= temperature && temperature <=100 ))){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
	}
}
