/* I let the user decide the type of nums so I can do the sums.
In reality I'm treating doubles like an "error" and correcting it if need be. **/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {
		
			Scanner inputSource = new Scanner(System.in);
			Integer input1 = null, input2 = null, result;
			double num1 = 0.0, num2 = 0.0, decimalResult;
			
			System.out.print("Please enter two numbers of your exalted choosing: ");
			
			try{ input1 = inputSource.nextInt();}
			
			catch ( InputMismatchException a ){
				 num1 = inputSource.nextDouble();
					System.out.println("The number you chose is: " + num1);
					}
			
			try {input2 = inputSource.nextInt();}
			catch (InputMismatchException a){
				num2 = inputSource.nextDouble();
				System.out.println("The number you chose is: " + num2);

			}
			
			if (input1 != null){
			result = input1 + input2;
			System.out.println("Your sum is: " + result);
			}
			
			else{
				decimalResult = num1 + num2;
				System.out.println("Your sum is: " + decimalResult);
	}

			inputSource.close();
			
	}

}
