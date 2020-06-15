package day14_Methods_Part2;

public class Lab_1_06 {

	public static void main(String[] args) {
		
		cigarParty(60, false);
		cigarParty(75, false);
		cigarParty(35, true);
		
	}
	
	public static void cigarParty(int number, boolean weekend) {
		
		if (40<=number && number<=60) {
			
				System.out.println(true);	
			
			
		}else if (number>=40 && weekend){
			
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
		
		
		
	}

}
