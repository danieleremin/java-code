public class Loops {

	public static void main(String[] args) {
		// While loops
		int number = 0;
		while(number < 5) {
			System.out.println("While loop: " + number);
			number++;
		}
		// For loop
		int number2 = 0;
		for(int i=0; i<5; i++) {
			// System.out.println("For loop: " + number2);
			System.out.printf("For loop: %d\n", number2);
			number2++;
		}
	}

}
