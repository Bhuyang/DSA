package OneToFourteen;

public class BreakStatement {

	public static void main(String[] args) {
		// When we don't want to execute full loop and need to exit in between

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);

		}
	}

}
