/** Project 0! Going to try and use try and catch exception errors to 
 * sums these nums seamlessly**/
 
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {
		
			Scanner inputSource = new Scanner(System.in);
			int input1 = 0, input2 = 0, result;
			double num1, num2, decimalResult;
			
			System.out.print("Please enter two numbers of your exalted choosing: ");
			
			try{ 
				input1 = inputSource.nextInt();
				System.out.println ("The number you chose is: " + input1);
			}
			
			catch ( InputMismatchException a ){
				 num1 = inputSource.nextDouble();
					System.out.println("You're using the decimal number " + num1);
					}
			
			try {
				input2 = inputSource.nextInt();
				System.out.println ("The number you chose is: " + input2);
			}
			catch (InputMismatchException a){
				num2 = inputSource.nextDouble();
				System.out.println("You're using the decimal number " + num2);

			}
			
		
			result = input1 + input2;
			System.out.println(result);
		

			inputSource.close();
			
	}


