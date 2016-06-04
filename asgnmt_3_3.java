import java.util.Scanner;
public class asgnmt_3_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int upperBound;
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the upper bound for random number generation,greater than 0");
		upperBound = obj.nextInt();
		rand_gen randTest = new rand_gen(upperBound);
		System.out.print("A random number from 0 to " + upperBound + " is ");
		System.out.println(randTest.randGen());
	
	}

}
