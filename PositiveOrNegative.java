package week1.day1;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -40;
		int num1=-50;
		int num2;
		if (num < 0) {
			System.out.println("The Given number is negative");
		}

		else if (num > 0) {
			System.out.println("The Given number is Positive");
		}
		else if (num==0) {
			System.out.println("The Given number is Zero");
		}
		if (num1<0) {
			num2=Math.abs(num1);
			System.out.println("The Positive  number of " + num1 + " is " + num2);
		}
	}
}
